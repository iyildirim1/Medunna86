package stepdefinitions.uiStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.PasswordChangePage;
import utilities.ConfigReader;
import utilities.Driver;

public class SalimPasswordChange {

    LoginPage loginPage = new LoginPage();
    PasswordChangePage passwordChangePage = new PasswordChangePage();



    @Given("user provides their username as {string}")
    public void user_provides_their_username_as(String username) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaLoginPage"));
        Driver.waitAndSendText(loginPage.username, username);

    }

    @Given("user provides their password as {string}")
    public void user_provides_their_password_as(String password) {
        Driver.waitAndSendText(loginPage.password, password);

    }

    @Given("user clicks on the Sign In button")
    public void user_clicks_on_the_sign_in_button() {

        Driver.waitAndClick(loginPage.SignInSubmitButton);
    }
    @Then("user navigates to section where the user name information is shown")
    public void user_navigates_to_section_where_the_user_name_information_is_shown() {
        Driver.waitAndClick(loginPage.AccountMenu);
    }
    @When("user clicks to Password section in dropdown")
    public void user_clicks_to_section_in_dropdown() {
        Driver.waitAndClick(passwordChangePage.passwordChangeButton);
    }
    @When("user enter enters the current password as {string}")
    public void user_enter_enters_the_current_password_as(String currentPassword) {
        Driver.waitAndSendText(passwordChangePage.currentPassword, currentPassword);

    }
    @When("user enters new password as {string}")
    public void user_enters_new_password_as(String newPassword) {
        Driver.waitAndSendText(passwordChangePage.newPassword, newPassword);


    }

    @And("user enters new password confirmation as {string}")
    public void userEntersNewPasswordConfirmationAsConfirmNewPassword(String confirmNewPassword) {
        Driver.waitAndSendText(passwordChangePage.confirmNewPassword, confirmNewPassword);

    }

    @When("user saves and changes the old password")
    public void user_saves_and_changes_the_old_password() {
        Driver.waitAndClick(passwordChangePage.passwordChangeSaveButton);
        Driver.sleep(1000);
        Assert.assertTrue(passwordChangePage.successMessage.isDisplayed());
        Driver.closeDriver();
    }

    // ============= Password strength bar level begins here =====================


    @When("user enters 7 chars to new password text box as {string}")
    public void user_enters_chars_to_new_password_text_box_as(String newPassword_7char) {
        Driver.waitAndSendText(passwordChangePage.newPassword, newPassword_7char);
        Driver.sleep(1000);
        Assert.assertTrue(passwordChangePage.passwordStrength.getAttribute("style").contains("background-color: rgb(255, 0, 0);"));



    }
    @When("user enters a lowercase char {string} and level bar changes accordingly")
    public void user_enters_a_lowercase_char_and_level_bar_changes_accordingly(String newPassword_s) {
        Driver.waitAndSendText(passwordChangePage.newPassword, newPassword_s);
        Driver.sleep(1000);
        Assert.assertTrue(passwordChangePage.passwordStrength.getAttribute("style").contains("background-color: rgb(255, 0, 0);"));


    }
    @When("user enters an uppercase char as {string} and level bar changes accordingly")
    public void user_enters_an_uppercase_char_as_and_level_bar_changes_accordingly(String newPassword_sA) {
        Driver.waitAndSendText(passwordChangePage.newPassword, newPassword_sA);
        Driver.sleep(1000);
        Assert.assertTrue(passwordChangePage.passwordStrength1.getAttribute("style").contains("background-color: rgb(255, 153, 0);"));

    }
    @And("user enters a digit as {string}and level bar changes accordingly")
    public void userEntersADigitAsNewPassword_sAAndLevelBarChangesAccordingly(String newPassword_sA1) {
        Driver.waitAndSendText(passwordChangePage.newPassword, newPassword_sA1);
        Driver.sleep(1000);
        Assert.assertTrue(passwordChangePage.passwordStrength3.getAttribute("style").contains("background-color: rgb(153, 255, 0);"));

    }
    @When("user enters a special char as {string} and level bar changes accordingly")
    public void user_enters_a_special_char_as_and_level_bar_changes_accordingly(String newPassword_sA1_) {
        Driver.waitAndSendText(passwordChangePage.newPassword, newPassword_sA1_);
        Driver.sleep(1000);
        Assert.assertTrue(passwordChangePage.passwordStrength4.getAttribute("style").contains("background-color: rgb(0, 255, 0);"));

        Driver.closeDriver();
    }
    // =====================Old password usage as new password is disabled begins here ========================

    @When("user enters the current password to new password text box as {string}")
    public void user_enters_the_current_password_to_new_password_text_box_as(String newPassword) {
        Driver.waitAndSendText(passwordChangePage.newPassword, newPassword);


    }
    @When("user enters the current password to new password confirmation text box as {string}")
    public void user_enters_the_current_password_to_new_password_confirmation_text_box_as(String newPassword_) {
        Driver.waitAndSendText(passwordChangePage.confirmNewPassword, newPassword_);


    }
    @Then("user clicks the save button and observes An error has occurred! The password could not be changed. popup message")
    public void userClicksTheSaveButtonAndObservesAnErrorHasOccurredThePasswordCouldNotBeChangedPopupMessage() {
        Driver.waitAndClick(passwordChangePage.passwordChangeSaveButton);
        Driver.sleep(1000);
        Assert.assertTrue(passwordChangePage.PasswordCantChangeError.isDisplayed());

        Driver.closeDriver();


    }


}
