package apiTesting;

import apiTestingAuxClasses.FindUsers;
import apiTestingAuxClasses.RequestMaker;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;


public class DeleteMethodUsers {

    @Test(groups = {"all", "deleteMethod", "deleteUser"}, description = "deleteUser API")
    public void deleteUser(){
        String url = "http://localhost:5000/users/removebyid/";
        int[] ID = FindUsers.getCompanyID();
        int firstID = ID[0];
        int lastID = ID[1];
//        System.out.println(firstID);
//        System.out.println(lastID);
        for (int i = firstID; i <= lastID; i+= 1){
            if (i % 2 == 0){
                System.out.println("even");
                Response response = RequestMaker.makeDeleteRequest(url+i);

                String responseString = response.asString();
                JSONObject jsonResponse = new JSONObject(responseString);
                System.out.println(jsonResponse.toString(10));
            }

        }

    }
//    @DataProvider(name = "deleteEvenUsers", parallel = true)
//    List<Integer> ID = FindUsers.getUserID();
//    int firstID = ID.get(0);
//    int lastID = ID.get(1);
//    private Iterator<Object[]> getBodyContent(){
//        Collection<Object[]> data = new ArrayList<>();
//        for (int i = firstID; i < lastID; firstID+=2){
//            JSONObject newUser = new JSONObject(bodyContent);
//            data.add(new Object[] {newUser.toString()});
//        }
//        return data.iterator();
//    }

}
