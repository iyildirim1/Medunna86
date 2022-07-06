package stepdefinitions.uiStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.PasswordChangePage;
import pojos.pojos.SalimPojos;
import utilities.Driver;

public class SalimPasswordChange {

    SalimPojos passwordChange = new SalimPojos();
    LoginPage loginPage = new LoginPage();
    PasswordChangePage passwordChangePage = new PasswordChangePage();



    @Given("user provides their username as {string}")
    public void user_provides_their_username_as(String username) {
        Driver.waitAndSendText(loginPage.username, username);

        //passwordChange.setUsername(username);
    }

    @Given("user provides their password as {string}")
    public void user_provides_their_password_as(String password) {
        Driver.waitAndSendText(loginPage.password, password);

       // passwordChange.setPassword(password);
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

        //passwordChange.setCurrentPassword(currentPassword);
    }
    @When("user enters new password as {string}")
    public void user_enters_new_password_as(String newPassword) {
        Driver.waitAndSendText(passwordChangePage.newPassword, newPassword);

        //passwordChange.setNewPassword(newPassword);

    }

    @And("user enters new password confirmation as {string}")
    public void userEntersNewPasswordConfirmationAsConfirmNewPassword(String confirmNewPassword) {
        Driver.waitAndSendText(passwordChangePage.confirmNewPassword, confirmNewPassword);

        //passwordChange.setNewPassword(confirmNewPassword);
    }

    @When("user saves and changes the old password")
    public void user_saves_and_changes_the_old_password() {
        Driver.waitAndClick(passwordChangePage.passwordChangeSaveButton);
        Driver.sleep(1000);
        Assert.assertTrue(passwordChangePage.successMessage.isDisplayed());
    }


}
