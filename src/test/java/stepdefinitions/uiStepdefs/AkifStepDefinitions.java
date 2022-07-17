package stepdefinitions.uiStepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AkifPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

public class AkifStepDefinitions {

    AkifPage akifPage = new AkifPage();

    @Given("Physician goes to the Medunna Home Page")
    public void physician_goes_to_the_medunna_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("Physician clicks to Sign In dropdown and Sign In")
    public void physician_clicks_to_sign_in_dropdown_and_sign_in() {
        akifPage.signInDropDown.click();
        akifPage.signInButton.click();
    }
    @Then("Physician enters their Username and Password")
    public void physician_enters_their_username_and_password() {
        akifPage.signInUsernameBox.sendKeys("teamdoctor86" + Keys.ENTER);
        akifPage.signInPasswordBox.sendKeys("teamdoctor86" + Keys.ENTER);
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
    @Then("Physician sees patient's info such as id, start and end date, Status, physician and patient")
    public void physician_sees_patient_s_info_such_as_id_start_and_end_date_status_physician_and_patient() {
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
    @Then("Physician fills up the required fields as ->  Anamnesis - Treatment - Diagnosis")
    public void physician_fills_up_the_required_fields_as_anamnesis_treatment_diagnosis() {
        akifPage.anamnesisTextBox.sendKeys("asds");
        akifPage.treatmentTextBox.sendKeys("asda");
        akifPage.diagnosisTextBox.sendKeys("dasds");
    }
    @Then("Physician can chose {string} : PENDING, COMPLETED or CANCELLED")
    public void physician_can_chose_pending_completed_or_cancelled(String string) {
        akifPage.appointmentStatusDropDown.sendKeys(string + Keys.ENTER);
    }
    @Then("Physician clicks on Save button")
    public void physician_clicks_on_save_button() {
        Driver.waitForClickablility(akifPage.appointmentSaveButton, 5);
        JSUtils.scrollIntoViewByJS(akifPage.appointmentSaveButton);
        Driver.waitAndClick(akifPage.appointmentSaveButton);
    }
    @Then("verify The appointment is uptated with identifier message shown")
    public void verify_the_appointment_is_uptated_with_identifier_message_shown() {
        akifPage.appointmentSaveCompletedAlert.isDisplayed();
    }
    @Then("close the browser")
    public void close_the_browser() {
        Driver.closeDriver();
    }

    @Then("Physician selects status as UNAPPROVED from dropdown")
    public void physician_selects_status_as_unapproved_from_dropdown() {
        Assert.assertTrue(akifPage.unapprovedStatusDropdown.isDisplayed());
        Select select = new Select(akifPage.appointmentStatusDropDown);
        select.selectByVisibleText("UNAPPROVED");
    }
    @Then("Physician verifies UNAPPROVED cannot be selectable")
    public void physician_verifies_unapproved_cannot_be_selectable() {
        Select select = new Select(akifPage.appointmentStatusDropDown);
        select.selectByVisibleText("UNAPPROVED");
        Assert.assertFalse(select.getFirstSelectedOption().getText().contains("UNAPPROVED"));
    }
    @Then("Physician selects status as COMPLETED from dropdown")
    public void physician_selects_status_as_completed_from_dropdown() {
        Select select = new Select(akifPage.appointmentStatusDropDown);
        select.selectByVisibleText("COMPLETED");
    }
    @Then("Physician leaves blank required fields, anemnesis, treatment, diagnosis")
    public void physician_leaves_blank_required_fields_anemnesis_treatment_diagnosis() {
        akifPage.anamnesisTextBox.clear();
        akifPage.treatmentTextBox.clear();
        akifPage.diagnosisTextBox.clear();
    }
    @Then("Physician verifies This field is required message")
    public void physician_verifies_this_field_is_required_message() {
        akifPage.diagnosisFieldRequiredAlert.isDisplayed();
        akifPage.treatmentFieldRequiredAlert.isDisplayed();
        akifPage.anamnesisFieldRequiredAlert.isDisplayed();
    }


    //----------------------------------------------

    @Given("User goes to Medunna home page")
    public void user_goes_to_medunna_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("User navigates to the registration page")
    public void user_navigates_to_the_registration_page() {
        akifPage.signInDropDown.click();
        akifPage.registrationButton.click();
    }
    @Then("User clicks to password textbox")
    public void user_clicks_to_password_textbox() {
        akifPage.registrationFirstPasswordTextBox.click();
    }
    @Then("User should enter four char {string}")
    public void user_should_enter_four_char(String string) {
        akifPage.registrationFirstPasswordTextBox.sendKeys(string+ Keys.ENTER);
    }
    @Then("verify Password strength bar color is red")
    public void verify_password_strength_bar_color_is_red() {
        Assert.assertTrue(akifPage.firstStrengthBar.getAttribute("style").contains("background-color: rgb(255, 0, 0);"));
    }

    @Then("User should enters at least seven chars {string} with one digit or uppercase or special char")
    public void user_should_enters_at_least_seven_chars_with_one_digit_or_uppercase_or_special_char(String string) {
        akifPage.registrationFirstPasswordTextBox.sendKeys(string+ Keys.ENTER);
    }
    @Then("Verify Password strength bar color is orange")
    public void verify_password_strength_bar_color_is_orange() {
        Assert.assertTrue(akifPage.firstStrengthBar.getAttribute("style").contains("background-color: rgb(255, 153, 0);"));
        Assert.assertTrue(akifPage.secondStrengthBar.getAttribute("style").contains("background-color: rgb(255, 153, 0);"));
    }

    @Then("User should enters at least seven chars {string} with including one digit and uppercase and special char")
    public void user_should_enters_at_least_seven_chars_with_including_one_digit_and_uppercase_and_special_char(String string) {
        akifPage.registrationFirstPasswordTextBox.sendKeys(string+ Keys.ENTER);
    }
    @Then("Verify Password strength bar color is green")
    public void verify_password_strength_bar_color_is_green() {
        Assert.assertTrue(akifPage.firstStrengthBar.getAttribute("style").contains("background-color: rgb(0, 255, 0);"));
        Assert.assertTrue(akifPage.secondStrengthBar.getAttribute("style").contains("background-color: rgb(0, 255, 0);"));
        Assert.assertTrue(akifPage.thirdStrengthBar.getAttribute("style").contains("background-color: rgb(0, 255, 0);"));
        Assert.assertTrue(akifPage.fourthStrengthBar.getAttribute("style").contains("background-color: rgb(0, 255, 0);"));
        Assert.assertTrue(akifPage.fifthStrengthBar.getAttribute("style").contains("background-color: rgb(0, 255, 0);"));
    }

    @Then("User enters three char in the {string}")
    public void user_enters_three_char_in_the(String string) {
        akifPage.registrationFirstPasswordTextBox.sendKeys(string+ Keys.ENTER);
    }
    @Then("Verify Password is invalid")
    public void verify_password_is_invalid() {
        Assert.assertTrue(akifPage.invalidPassword.isDisplayed());
    }

}