package apiTesting;

import apiTestingAuxClasses.FindUsers;
import apiTestingAuxClasses.RequestMaker;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class DeleteMethodCompanies {
    @Test(groups = {"all", "deleteMethod", "deleteCompany"}, description = "deleteCompany API")
    public void deleteCompany() {
        String url = "http://localhost:5000/company/removebyid/";
        int[] ID = FindUsers.getCompanyID();
        int firstID = ID[0];
        int lastID = ID[1];
//        System.out.println(firstID);
//        System.out.println(lastID);
        for (int i = firstID; i <= lastID; i += 1) {
            if (i % 2 == 0) {
                System.out.println("even");
                Response response = RequestMaker.makeDeleteRequest(url + i);

                String responseString = response.asString();
                JSONObject jsonResponse = new JSONObject(responseString);
                System.out.println(jsonResponse.toString(10));
            }

        }
    }
}