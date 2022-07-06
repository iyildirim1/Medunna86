package stepdefinitions;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pages.IsmailPage;
import utilities.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.*;


public class IsmailStepFile {

    IsmailPage ip = new IsmailPage();

    @Given("user is on the landing page")
    public void userIsOnTheLandingPage() {
        Driver.getDriver().manage().deleteAllCookies();
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        Driver.wait(2);
    }

    @And("user clicks on the account icon")
    public void userClicksOnTheAccountIcon() {

        ip.accountIcon.click();
    }

    @And("user clicks on the registration link")
    public void userClicksOnTheRegistrationLink() {
        ip.registerLink.click();
    }


    @Then("user clicks on submit button")
    public void userClicksOnSubmitButton() {

        ip.registerSubmitButton.submit();
    }

    @Then("user doesn't get invalid username message")
    public void userDoesnTGetInvalidUsernameMessage() {
        //Script will catch the noSuchElement exception to prove that the element doesn't exist
        //Nonexistence of the "Invalid username" message proves that it's entered correctly
        try {
            ip.usernameInvalidMessage.isDisplayed();
            Assert.fail();
        }
        catch (NoSuchElementException exception) {
            Assert.assertTrue(true);
        }
    }

    @And("user enters the {string} as username")
    public void userEntersTheAsUsername(String arg0) {

        ip.usernameBox.sendKeys(arg0);
    }

    @And("user enters the {string} as email")
    public void userEntersTheAsEmail(String arg0) {
        ip.emailBox.sendKeys(arg0);
    }

    @Then("user doesn't get invalid email message")
    public void userDoesnTGetInvalidEmailMessage() {
        //Script will catch the noSuchElement exception to prove that the element doesn't exist
        //Nonexistence of the "Invalid email" message proves that it's entered correctly
        try {
            ip.emailInvalidMessage.isDisplayed();
            System.out.println("invalid format");
            Assert.fail();
        }
        catch (NoSuchElementException exception) {
            Assert.assertTrue(true);
        }
    }

    @Then("user clicks on submit button without entering email")
    public void userClicksOnSubmitButtonWithoutEnteringEmail() {
        ip.registerSubmitButton.submit();
    }

    @Then("user gets an error message as -Your email is required.-")
    public void userGetsAnErrorMessageAsYourEmailIsRequired() {
        Assert.assertTrue(ip.emailRequiredMessage.isDisplayed());
    }

    @And("user clicks on SignIn link")
    public void userClicksOnSignInLink() {
        ip.signInLink.click();
    }

    @And("user enters {string} as username and {string} as password")
    public void userEntersAsUsernameAndAsPassword(String arg0, String arg1) {

        ip.usernameBoxSignIn.sendKeys(arg0);
        ip.passwordBoxSignIn.sendKeys(arg1);
    }

    @And("user clicks on sign-in button")
    public void userClicksOnSignInButton() {
        ip.signInButton.submit();
    }

    @And("user clicks on items and titles on the menu")
    public void userClicksOnItemsAndTitlesOnTheMenu() {
        ip.itemsAndTitlesButton.click();
    }

    @Then("user clicks on patient portal")
    public void userClicksOnPatientPortal() {
        ip.patientPortal.click();
    }

    @And("user sees the Patient Header")
    public void userSeesThePatientHeader() {
       Assert.assertTrue(ip.PatientPortalHeader.isDisplayed());
    }

    @When("user clicks on edit and change ID {string}")
    public void userClicksOnEditAndChangeID(String arg0) {
        ip.patientIDBox.sendKeys(arg0);
       // Assert.assertEquals(arg0,ip.patientIDBox.getAttribute("value"));
    }

    @When("user clicks on edit and change Firstname {string}")
    public void userClicksOnEditAndChangeFirstname(String arg1) {
        ip.patientFirstNameBox.clear();
        ip.patientFirstNameBox.sendKeys(arg1);
        Assert.assertEquals(arg1,ip.patientFirstNameBox.getAttribute("value"));
    }

    @When("user clicks on edit and change Lastname {string}")
    public void userClicksOnEditAndChangeLastname(String arg2) {
        ip.patientLastNameBox.clear();
        ip.patientLastNameBox.sendKeys(arg2);
        Assert.assertEquals( ip.patientLastNameBox.getAttribute("value"),arg2);
    }

    @When("user clicks on edit and change Birthdate {string}")
    public void userClicksOnEditAndChangeBirthdate(String arg3) {
        ip.patientBirthDayBox.clear();
        ip.patientBirthDayBox.sendKeys(arg3);
      // Assert.assertEquals( ip.patientBirthDayBox.getAttribute("value"),arg3);
    }

    @When("user clicks on edit and change Email {string}")
    public void userClicksOnEditAndChangeEmail(String arg4) {
        ip.patientEmailBox.clear();
        ip.patientEmailBox.sendKeys(arg4);
        Assert.assertEquals( ip.patientEmailBox.getAttribute("value"),arg4);
    }

    @When("user clicks on edit and change Phone {string}")
    public void userClicksOnEditAndChangePhone(String arg5) {
        ip.patientPhoneNumberBox.clear();
        ip.patientPhoneNumberBox.sendKeys(arg5);
        Assert.assertEquals( ip.patientPhoneNumberBox.getAttribute("value"),arg5);
    }

    @When("user clicks on edit and change Gender {string}")
    public void userClicksOnEditAndChangeGender(String arg6) {
        ip.patientGenderBox.clear();
        ip.patientGenderBox.sendKeys(arg6);
        Assert.assertEquals( ip.patientGenderBox.getAttribute("value"),arg6);
    }

    @When("user clicks on edit and change Blood Group {string}")
    public void userClicksOnEditAndChangeBloodGroup(String arg7) {
        ip.patientBloodGroupBox.clear();
        ip.patientBloodGroupBox.sendKeys(arg7);
        Assert.assertEquals( ip.patientBloodGroupBox.getAttribute("value"),arg7);
    }

    @When("user clicks on edit and change Address {string}")
    public void userClicksOnEditAndChangeAddress(String arg8) {
        ip.patientAddressBox.clear();
        ip.patientAddressBox.sendKeys(arg8);
        Assert.assertEquals( ip.patientAddressBox.getAttribute("value"),arg8);
    }

    @When("user clicks on edit and change Description {string}")
    public void userClicksOnEditAndChangeDescription(String arg9) {
        ip.patientDescriptionBox.clear();
        ip.patientDescriptionBox.sendKeys(arg9);
        Assert.assertEquals( ip.patientDescriptionBox.getAttribute("value"),arg9);
    }

    @When("user clicks on edit and change User {string}")
    public void userClicksOnEditAndChangeUser(String arg10) {
        ip.patientUserNameBox.clear();
        ip.patientUserNameBox.sendKeys(arg10);
        Assert.assertEquals( ip.patientUserNameBox.getAttribute("value"),arg10);
    }

    @When("user clicks on edit and change Country {string}")
    public void userClicksOnEditAndChangeCountry(String arg11) {
        ip.patientCountryBox.clear();
        ip.patientCountryBox.sendKeys(arg11);
        Assert.assertEquals( ip.patientCountryBox.getAttribute("value"),arg11);
    }

    @When("user clicks on edit and change State-City {string}")
    public void userClicksOnEditAndChangeStateCity(String arg12) {
        ip.patientStateBox.clear();
        ip.patientStateBox.sendKeys(arg12);
        Assert.assertEquals( ip.patientStateBox.getAttribute("value"),arg12);
    }

    @When("user clicks on edit")
    public void userClicksOnEdit() {
        ip.editButtonPatient.click();
    }
}
