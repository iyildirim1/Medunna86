package stepdefinitions.apiStepDefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.User;
import utilities.ReusableMethods;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;

public class IsmailApiStep {

    Response response;
    User[] users;
    User user;


    @Given("Admin enters the system with the username and password")
    public void adminEntersTheSystemWithTheUsernameAndPassword() {
        response = given().headers("Authorization","Bearer "+ReusableMethods.getIdToken(),
                        "Content-Type",ContentType.JSON,
                        "Accept",ContentType.JSON)
                .when().get("https://medunna.com/api/users?=size=2000");
    }
    @Then("the username {string} is verified by database that it's unqiue")
    public void theUsernameIsVerifiedByDatabaseThatItSUnqiue(String username) throws JsonProcessingException {
        ObjectMapper obj = new ObjectMapper();
        users=obj.readValue(response.asString(),User[].class);
        for (User user: users){
            if(user.getLogin().equals(username.toLowerCase())){
                System.out.println("This username already exists");
                Assert.fail();
                break;
            }
        }

        System.out.println("This username is available");
        Assert.assertTrue(true);


    }


    @Then("Staff searches for a patient by ssn id {string}")
    public void staffSearchesForAPatientBySsnId(String ssn) {
        response.prettyPrint();

    }


    @Given("Staff enters the system with the username and password {string}")
    public void staffEntersTheSystemWithTheUsernameAndPassword(String ssn) {

        response = given().headers("Authorization","Bearer "+ReusableMethods.getIdToken(),
                        "Content-Type",ContentType.JSON,
                        "Accept",ContentType.JSON).queryParam("ssn",ssn)
                .when()
                .get("https://medunna.com/api/patients/search");
    }


}
