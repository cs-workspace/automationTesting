package apiTestingAuxClasses;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import com.github.javafaker.PhoneNumber;
import org.json.JSONObject;

public class CreateBodyContent {

    public static String getBodyContentUsers(){
        JSONObject body = new JSONObject();

        Faker faker = new Faker();
        Name name = faker.name();
        String firstName = name.firstName();
        String lastName = name.lastName();
        String userName = name.username();
        String email = faker.internet().emailAddress();
        body.put("username", userName)
                .put("firstname", firstName)
                .put("lastname", lastName)
                .put("email", email);
        return body.toString();
    }

    public static String getBodyContentCompanies(){
        JSONObject body = new JSONObject();

        Faker faker = new Faker();
        Name name = faker.name();
        String companyname = name.firstName();

        String address = faker.address().streetName();
        String phonenumber = faker.phoneNumber().cellPhone();

        body.put("companyname", companyname)
                .put("street", address)
                .put("phonenumber", "123321");
        return body.toString();
    }
}
