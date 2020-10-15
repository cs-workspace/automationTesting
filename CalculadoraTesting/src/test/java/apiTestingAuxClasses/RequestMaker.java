package apiTestingAuxClasses;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestMaker {
    public static Response makeGetRequest(){
        Response response = given()
                .header("Content-type", "application/json")
                .when()
                .get(url)
                .then()
                .extract()
                .response();
        return response
    }

    public static Response makePostRequest(){
        Response response = given()
                .header("Content-type", "application/json")
                .when()
                .post(url)
                .then()
                .extract()
                .response();
        return response
    }

    public static Response makeDeleteRequest(){
        Response response = given()
                .header("Content-type", "application/json")
                .when()
                .post(url)
                .then()
                .extract()
                .response();
        return response
    }

}
