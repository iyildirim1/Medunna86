package stepdefinitions.seleniumuisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pages.MehmetPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MehmetStepDefsUS14_TC02 {
MehmetPage mh = new MehmetPage();

    WebDriver driver;

    @Given("Doctor  navigates to medunnaUrl homepage")
    public void doctor_navigates_to_medunna_url_homepage()  {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("Doctor navigate to the Sign In page")
    public void doctor_navigate_to_the_sign_in_page()  {
        mh.signInClickIcon.click();
        mh.signInLink.click();
    }
    @When("Doctor types username as {string}")
    public void doctor_types_username_as(String username) {
        mh.usernameTextBox.sendKeys(username);
    }
    @When("Doctor types password as {string}")
    public void doctor_types_password_as(String password) {
        mh.passwordTextBox.sendKeys(password );
    }
    @When("Doctor clicks Sign In button")
    public void doctor_clicks_sign_in_button() {
        mh.signInButton.click();
        Driver.sleep(1000);
    }
    @When("Doctor navigate to the My Pages")
    public void doctor_navigate_to_the_my_pages() {
        mh.myPagesSegment.click();
    }
    @Then("clicks My Inpatients")
    public void clicks_my_inpatients() {
        mh.myInpatientSegment.click();
        Driver.sleep(1000);
    }
    @And("verifies all Inpatients as ID, Start Date, End Date, Status, Description, Created Date, Room, Appointment, Patient")
    public void verifiesAllInpatientsAsIDStartDateEndDateStatusDescriptionCreatedDateRoomAppointmentPatient() {
        Assert.assertTrue(mh.IDDisplayed.isDisplayed());
        Assert.assertTrue(mh.StartDate.isDisplayed());
        Assert.assertTrue(mh.EndDateDisplayed.isDisplayed());
        Assert.assertTrue(mh.StatusDisplayed.isDisplayed());
        Assert.assertTrue(mh.DescriptionDisplayed.isDisplayed());
        Assert.assertTrue(mh.CreatedDateDisplayed.isDisplayed());
        Assert.assertTrue(mh.RoomDisplayed.isDisplayed());
        Assert.assertTrue(mh.AppointmentDisplayed.isDisplayed());
        Assert.assertTrue(mh.Patient.isDisplayed());
    }
    @Then("close the driver")
    public void closeTheDriver() {
        Driver.closeDriver();
    }
    @And("Doctor clicks edit button")
    public void doctorClicksEditButton()  {
        mh.editButton.click();
    }
    @And("Doctor update status")
    public void doctorUpdateStatus()  {

        mh.statusCheckBox.click();
        Driver.sleep(3000);

//       WebElement status = driver.findElement(By.xpath("//select[@id='in-patient-status']"));// mh.statusCheckBox.click();
//        Select dropdownstatus = new Select(status);
//
//       dropdownstatus.selectByVisibleText("DISCHARGED");
    }
    @Then("Clicks save button")
    public void clicksSaveButton()  {
        mh.saveButton.submit();

    }


    @And("Doctor can update room")
    public void doctorCanUpdateRoom() {

        mh.roomCheckBox.click();

    }


}
