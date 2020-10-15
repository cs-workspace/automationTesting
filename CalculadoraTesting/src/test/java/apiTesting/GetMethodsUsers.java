package apiTesting;

import apiTestingAuxClasses.RequestMaker;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetMethodsUsers {

    @Test(groups = {"all", "getMethods", "getAllUsers"}, description = "getAllUsers API")
    public void getAllUsers(){
        String url = "http://localhost:5000/users/all";
        Response response = RequestMaker.makeGetRequest(url);
        String responseString = response.asString();
        JSONArray jsonResponse = new JSONArray(responseString);
        System.out.println(jsonResponse.toString(10));

    }
}
