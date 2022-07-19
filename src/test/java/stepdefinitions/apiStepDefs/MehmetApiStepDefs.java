package stepdefinitions.apiStepDefs;

import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.Countries;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class MehmetApiStepDefs {
    Countries countries = new Countries();
    Faker faker = new Faker();
    @Test
    public void test(){

        countries.setName(faker.name().firstName());

        Response response= given().headers("Authorization","Bearer "+ ReusableMethods.getIdToken(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON).body(countries.countryBody()).
                when().post("https://medunna.com/api/countries");
    response.prettyPrint();
        System.out.println(response.asString());
    }
}
