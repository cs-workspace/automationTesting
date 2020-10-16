package apiTesting;

import apiTestingAuxClasses.RequestMaker;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.testng.annotations.Test;

public class GetMethodsCompanies {
    @Test(groups = {"all", "getMethods", "getAllCompanies"}, description = "getAllCompanies API")
    public void getAllCompanies(){
        String url = "http://localhost:5000/companies/all";
        Response response = RequestMaker.makeGetRequest(url);
        String responseString = response.asString();
        JSONArray jsonResponse = new JSONArray(responseString);

        System.out.println(jsonResponse.toString(10));
    }
}
