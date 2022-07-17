package stepdefinitions.uiStepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.HashMap;
import java.util.List;

public class ValidateAppointmentsUS10 {

    @Given("Doctor is on the medunna health page and does log in")
    public void doctor_is_on_the_medunna_health_page_and_does_log_in() {
        Driver.getDriver().get(ConfigReader.getProperty("login_page"));
        Driver.getDriver().findElement(By.xpath("//*[@id='username']")).sendKeys("teamdoctor86");
        Driver.getDriver().findElement(By.xpath("//*[@id='password']")).sendKeys("teamdoctor86");
        Driver.getDriver().findElement(By.xpath("//*[@id='login-page']/div/form/div[3]/button[2]")).click();

    }

    @Then("Doctor goes to my appointments")
    public void doctor_goes_to_my_appointments() {

        Driver.getDriver().findElement(By.xpath("//*[@id='entity-menu']/a")).click();
        Driver.getDriver().findElement(By.xpath("//*[@id='entity-menu']/div/a[1]/span")).click();

    }

    @Then("Doctor can se ID, StartDate, EndDate, etc...")
    public void doctor_can_se_id_start_date_end_date_etc() {
        String list = Driver.getDriver().findElement(By.xpath("//*[@id='app-view-container']/div/div/div/div/div/table/thead/tr")).getText();
        System.out.println(list);
    }
}