package apiTesting;

import io.restassured.response.Response;
import org.json.JSONArray;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostMethodUsers {

    @Test(groups = {"all", "getMethod", "getAllUsers"}, description = "getAllUsers API")
    public void getAllUsers(){
        String url = "http://localhost:5000/users/all";
        Response response = given()
                .header("Content-type", "application/json")
                .when()
                .post(url)
                .then()
                .extract().response();
        String responseString = response.asString();
        JSONArray jsonResponse = new JSONArray(responseString);
        System.out.println(jsonResponse.toString(10));

    }

}