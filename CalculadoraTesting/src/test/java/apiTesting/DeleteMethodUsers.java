package apiTesting;

import apiTestingAuxClasses.CreateBodyContent;
import apiTestingAuxClasses.FindUsers;
import apiTestingAuxClasses.RequestMaker;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DeleteMethodUsers {

    @Test(groups = {"all", "deleteMethod", "deleteUser"}, description = "deleteUser API")
    public void deleteUser(){
        String url = "http://localhost:5000/users/removebyid/";
        int[] ID = FindUsers.getUserID();
        int firstID = ID[0];
        int lastID = ID[1];
        for (int i = firstID; i < lastID; firstID+=2){
            Response response = RequestMaker.makeDeleteRequest(url);

            String responseString = response.asString();
            JSONObject jsonResponse = new JSONObject(responseString);
            System.out.println(jsonResponse.toString(10));
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