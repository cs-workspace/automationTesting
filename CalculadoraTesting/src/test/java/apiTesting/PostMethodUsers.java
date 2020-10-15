package apiTesting;

import apiTestingAuxClasses.CreateBodyContent;
import apiTestingAuxClasses.RequestMaker;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class PostMethodUsers {

    @Test(groups = {"all", "postMethod", "createNewUser"}, description = "createNewUser API")
    public void createNewUser(){
        String url = " http://localhost:5000/users/add";
        String bodyContent = CreateBodyContent.getBodyContentUsers();
        Response response = RequestMaker.makePostRequest(url, bodyContent);

        String responseString = response.asString();
        JSONObject jsonResponse = new JSONObject(responseString);
        System.out.println(jsonResponse.toString(10));

    }
    @DataProvider()
    private Iterator<Object[]> getBodyContent(){
        Collection<Object[]> data = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            String bodyContent = CreateBodyContent.getBodyContentUsers();
            JSONObject newUser = new JSONObject(bodyContent);
            data.add(new Object[] {bodyContent});
        }
        return data.iterator();
    }

}

//{"username": "johnny",
//"firstname": "johnny",
//"lastname" : "johnny",
//"email": "johnny2@gmail.com"}
