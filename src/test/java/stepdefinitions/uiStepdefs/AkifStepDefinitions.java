package stepdefinitions.uiStepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.AkifPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AkifStepDefinitions {

    AkifPage akifPage = new AkifPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Physician goes to the Medunna Home Page")
    public void physician_goes_to_the_medunna_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("Physician click to Sign In and write Username and Password")
    public void physician_click_to_sign_in_and_write_username_and_password() {
        akifPage.signInDropDown.click();
        akifPage.signInButton.click();
        akifPage.signInUsernameBox.sendKeys("teamdoctor86");
        akifPage.signInPasswordBox.sendKeys("teamdoctor86");
    }
    @Then("Physician clicks Sign In button")
    public void physician_clicks_sign_in_button() {
        akifPage.signInSubmitButton.click();
    }
    @Then("Physician navigate to My Pages then click My appointments")
    public void physician_navigate_to_my_pages_then_click_my_appointments() {
        akifPage.physicianMyPagesButton.click();
        akifPage.physicianMyAppointmentsButton.click();
    }
    @Then("Doctor sees patient's info such as id, start and end date, Status, physician and patient")
    public void doctor_sees_patient_s_info_such_as_id_start_and_end_date_status_physician_and_patient() {
        Assert.assertTrue(akifPage.firstPatientId.isDisplayed());
        Assert.assertTrue(akifPage.firstPatientStartDate.isDisplayed());
        Assert.assertTrue(akifPage.firstPatientEndDate.isDisplayed());
        Assert.assertTrue(akifPage.firstPatientStatus.isDisplayed());
        Assert.assertTrue(akifPage.firstPatientDoctor.isDisplayed());
        Assert.assertTrue(akifPage.firstPatientName.isDisplayed());
    }
    @Then("Physician clicks edit button")
    public void physician_clicks_edit_button() {
        akifPage.firstPatientAppointmentEditButton.click();
    }
    @Then("Doctor fills up the required fields as ->  Anamnesis - Treatment - Diagnosis")
    public void doctor_fills_up_the_required_fields_as_anamnesis_treatment_diagnosis() {
        akifPage.anamnesisTextBox.sendKeys("asds");
        akifPage.treatmentTextBox.sendKeys("asda");
        akifPage.diagnosisTextBox.sendKeys("dasds");
    }
    @Then("Doctor can chose one of these options: PENDING, COMPLETED or CANCELLED")
    public void doctor_can_chose_one_of_these_options_pending_completed_or_cancelled() {
        akifPage.appointmentStatusDropDown.sendKeys("PENDING");
    }
    @Then("Doctor clicks save button")
    public void doctor_clicks_save_button() {
        actions.moveToElement(akifPage.appointmentSaveButton).perform();
        ReusableMethods.waitForClickablility(akifPage.appointmentSaveButton,5);
        akifPage.appointmentSaveButton.click();
    }
    @Then("verify The appointment is uptated with identifier message shown")
    public void verify_the_appointment_is_uptated_with_identifier_message_shown() {
        akifPage.appointmentSaveCompletedAlert.isDisplayed();
    }

    
}
