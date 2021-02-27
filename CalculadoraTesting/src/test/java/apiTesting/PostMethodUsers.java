package apiTesting;

import apiTestingAuxClasses.CreateBodyContent;
import apiTestingAuxClasses.RequestMaker;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import io.restassured.response.Response;import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class PostMethodUsers {

    @Test(groups = {"all", "postMethod", "createNewUser"}, description = "createNewUser API", dataProvider = "getBodyContent")
    public void createNewUser(String bodyContent){
        String url = " http://localhost:5000/users/add";
        Response response = RequestMaker.makePostRequest(url, bodyContent);

        String responseString = response.asString();
        JSONObject jsonResponse = new JSONObject(responseString);
        System.out.println(jsonResponse.toString(10));

    }
    @DataProvider(name = "getBodyContent", parallel = true)
    private Iterator<Object[]> getBodyContent(){
        Collection<Object[]> data = new ArrayList<>();
        for (int i = 0; i < 300; i++){
            String bodyContent = CreateBodyContent.getBodyContentUsers();
            JSONObject newUser = new JSONObject(bodyContent);
            data.add(new Object[] {newUser.toString()});
        }
        return data.iterator();
    }

}

//{"username": "johnny",
//"firstname": "johnny",
//"lastname" : "johnny",
//"email": "johnny2@gmail.com"}
