package stepdefinitions.apiStepDefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.TestItem;
import pojos.User;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TxtWriter;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;

public class IsmailApiStep {

    Response response;
    User[] users;
    User user;
    TestItem testItemResponse;

   Faker faker = new Faker();
   TestItem testItem = new TestItem();


    @Given("Admin enters the system with the username and password")
    public void adminEntersTheSystemWithTheUsernameAndPassword() {
        response = given().headers("Authorization","Bearer "+ReusableMethods.adminIdToken(),
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

        response = given().headers("Authorization","Bearer "+ReusableMethods.adminIdToken(),
                        "Content-Type",ContentType.JSON,
                        "Accept",ContentType.JSON).queryParam("ssn",ssn)
                .when()
                .get("https://medunna.com/api/patients/search");
    }


    @Given("Admin sends post request to create a test item")
    public void adminSendsPostRequestToCreateATestItem() {

        testItem.setName(faker.superhero().name());
        testItem.setDescription(faker.superhero().descriptor());
        testItem.setPrice(faker.number().numberBetween(1,100));

        RestAssured.baseURI= ConfigReader.getProperty("medunnaUrl");

       response= given().headers("Authorization","Bearer "+ReusableMethods.adminIdToken(),
                        "Content-Type",ContentType.JSON,
                        "Accept",ContentType.JSON).body(testItem.createTestBody())
                .when().post("api/c-test-items");

        TxtWriter.saveTestRegisterData(testItem);
    }

    @Then("Admin receives the status code to verify successful test creation")
    public void adminReceivesTheStatusCodeToVerifySuccessfulTestCreation() {

        response.prettyPrint();

    }
}
