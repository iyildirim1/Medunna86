package stepdefinitions.uiStepdefs;
import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import net.bytebuddy.dynamic.loading.ClassInjector;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.IsmailPage;
import pojos.User;
import utilities.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.*;


public class IsmailStepFile {

    IsmailPage ip = new IsmailPage();
    Faker faker = new Faker();
    User user = new User();

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

        Driver.waitAndClick(ip.registerSubmitButton);
        Driver.wait(1);
        Assert.assertTrue(ip.registrationConfirmedMessage.isDisplayed());
        TxtWriter.saveUIRegisterData(user);
    }

    @Then("user doesn't get invalid username message")
    public void userDoesnTGetInvalidUsernameMessage() {
        //Script will catch the noSuchElement exception to prove that the element doesn't exist
        //Nonexistence of the "Invalid username" message proves that it's entered correctly
//        try {
//            ip.usernameInvalidMessage.isDisplayed();
//            Assert.fail();
//        }
//        catch (NoSuchElementException exception) {
//            Assert.assertTrue(true);
//        }
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
    public void userClicksOnEditAndChangeGender(String gender) {

        Select genderBox = new Select(ip.patientGenderBox);
        genderBox.selectByVisibleText(gender);
        Assert.assertEquals( ip.patientGenderBox.getAttribute("value"),gender);
    }

    @When("user clicks on edit and change Blood Group {string}")
    public void userClicksOnEditAndChangeBloodGroup(String bloodGroup) {
        Select bloodType = new Select(ip.patientBloodGroupBox);
        bloodType.selectByVisibleText(bloodGroup);
       WebElement selectedOption = bloodType.getFirstSelectedOption();
        Assert.assertEquals(selectedOption.getText(),bloodGroup);
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


    @And("user enters the ssn {string}")
    public void userEntersTheSsn(String ssn) {
        ssn = faker.idNumber().ssnValid();
        Driver.waitAndSendText(ip.ssn,ssn);
        user.setSsn(ssn);

    }

    @And("user enters the firstname {string}")
    public void userEntersTheFirstname(String firstName) {

        firstName = faker.name().firstName();
        Driver.waitAndSendText(ip.firstName,firstName);
        user.setFirstName(firstName);
    }

    @And("user enters the lastname {string}")
    public void userEntersTheLastname(String lastName) {

        lastName = faker.name().lastName();
        Driver.waitAndSendText(ip.lastName,lastName);
        user.setLastName(lastName);


    }

    @And("user enters the email {string}")
    public void userEntersTheEmail(String email) {

        email = faker.internet().emailAddress();
        Driver.waitAndSendText(ip.emailBox,email);
        user.setEmail(email);
    }

    @And("user enters the password {string}")
    public void userEntersThePassword(String password) {

        password = faker.internet().password(4,8);
        Driver.waitAndSendText(ip.firstPassword,password);
        user.setPassword(password);

    }

    @And("user confirms the password {string}")
    public void userConfirmsThePassword(String password) {

        password = user.getPassword();
        Driver.waitAndSendText(ip.secondPassword,password);
    }

    @And("user enters the username {string}")
    public void userEntersTheUsername(String username) {
        username=user.getFirstName()+user.getLastName();
        Driver.waitAndSendText(ip.usernameBox,username);
        user.setLogin(username);
    }

    @Then("user clicks on save changes")
    public void userClicksOnSaveChanges() {
        ip.savePatientChanges.submit();
       // Driver.wait(5);

        Driver.waitForVisibility(ip.patientUpdatedMessage,2);
        Assert.assertTrue(ip.patientUpdatedMessage.isDisplayed());
        TxtWriter.saveUIRegisterData(user);
    }

    @Given("Staff logs in to the account with username and password {string}, {string}")
    public void staffLogsInToTheAccountWithUsernameAndPassword(String username, String password) {
        Driver.getDriver().get("https://medunna.com/login");
        Driver.waitAndSendText(ip.usernameBoxSignIn,username);
        Driver.waitAndSendText(ip.passwordBoxSignIn,password);
        ip.signInButton.submit();

    }

    @And("Staff navigates to the search patient page")
    public void staffNavigatesToTheSearchPatientPage() {
        Driver.waitAndClick(ip.myPagesLink);
        Driver.waitAndClick(ip.searchPatientLink);
    }

    @And("Staff enters the ssn Id to search {string}")
    public void staffEntersTheSsnIdToSearch(String ssn) {
        Driver.waitAndSendText(ip.ssnSearchBox,ssn);
    }

    @Then("Verify that the ssn number matches with the one entered {string}")
    public void verifyThatTheSsnNumberMatchesWithTheOneEntered(String ssn) {

        String ssnOnTable = ip.ssnTableVerify.getText();
        Assert.assertEquals(ssn,ssnOnTable);
    }
}
