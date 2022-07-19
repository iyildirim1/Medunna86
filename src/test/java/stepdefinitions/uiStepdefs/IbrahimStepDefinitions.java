package stepdefinitions.uiStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import pages.IbrahimPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class IbrahimStepDefinitions {
    ReusableMethods reusableMethods=new ReusableMethods();

    IbrahimPage iP = new IbrahimPage();

    @Given("User goes to Medunna url")
    public void userGoesToMedunnaUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @And("click sign in icon")
    public void clickSignInIcon() {
       ReusableMethods.waitFor(2);
        iP.signInButton.click();

    }
    @And("click first sign in button")
    public void clickFirstSignInButton() {
        ReusableMethods.waitFor(1);
        iP.firstSignInLink.click();
    }


    @When("enter a valid {string}")
    public void enter_a_valid(String username) {

    iP.userNameTextBox.sendKeys(username);
    }
    @When("user enter {string}")
    public void user_enter(String password) {

        iP.passwordTextButton.sendKeys(password);

    }
    @Then("click sign in")
    public void click_sign_in() {
        iP.userSignIn.click();

    }


    @And("verify remember button")
    public void verifyRememberButton() {
        iP.rememberMeClick.click();
    }

    @And("check did you forget your password")
    public void checkDidYouForgetYourPassword() {
iP.ForgetPassword.click();
    }


//    @And("register a new account")
//    public void registerANewAccount() {
//        iP.registerIcon.click();
//    }


    @Then("click to cancel button")
    public void clickToCancelButton() {iP.cancelButton.click();

    }

    @And("second sign in")
    public void secondSignIn() {
iP.secondSignIn.click();
    }

    @When("click to my page segment")
    public void click_to_my_paga_segment() {
        iP.myPageSegment.click();

    }

    @When("click my appointments")
    public void click_my_appointments() {
        ReusableMethods.waitFor(2);
        iP.myAppointments.click();

    }

    @When("click edit button")
    public void click_edit_button() {
        iP.editButton.click();

    }

    @When("click show test result")
    public void click_show_test_result() {
        iP.showTestResult.click();

    }

    @When("click view results")
    public void click_view_results() {
        iP.viewResults.click();

    }

    @Then("verify test information id,name,default min,default max,test,description,date")
    public void verify_test_information_id_name_default_min_default_max_test_description_date() {



       // Assert.assertTrue();
    }


    @Then("Verifies Remember me options")
    public void verifiesRememberMeOptions() {
        Assert.assertTrue(iP.rememberMe.isDisplayed());
    }

    @Then("Verifies Did You Forget Password")
    public void verifiesDidYouForgetPassword() {
        Assert.assertTrue(iP.didYouForgetPassword.isDisplayed());

    }

    @Then("Verifies Registration Page")
    public void verifiesRegistrationPage() {
        Assert.assertTrue(iP.registerationPage.isDisplayed());
    }
}
