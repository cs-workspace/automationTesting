package apiTestingAuxClasses;

import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class FindUsers {
    public static int[] getUserID(){
        String url = "http://localhost:5000/users/all";
        Response response = RequestMaker.makeGetRequest(url);
        String responseString = response.asString();
        JSONArray jsonResponse = new JSONArray(responseString);

        JSONObject jsonFirst = (JSONObject) jsonResponse.get(0);
        int firstID = (int) jsonFirst.get("id");

        JSONObject jsonLast = (JSONObject) jsonResponse.get(jsonResponse.length() - 1);
        int lastID = (int) jsonLast.get("id");
        return new int[] {firstID, lastID};
        }
}
