package stepdefinitions.uiStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MehmetPage;
import pojos.Countries;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US28_MehmetStepDefs {
    MehmetPage mp = new MehmetPage();
    Countries countries = new Countries();

    @Given("Admin  navigates to medunnaUrl homepage")
    public void adminNavigatesToMedunnaUrlHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("Admin navigate to the Sign In page")
    public void adminNavigateToTheSignInPage() {
        mp.signInClickIcon.click();
        mp.signInLink.click();
    }

    @And("Admin types username as {string}")
    public void adminTypesUsernameAs(String username) {
        mp.usernameTextBox.sendKeys(username);
        ReusableMethods.waitFor(1);

    }

    @And("Admin types password as {string}")
    public void adminTypesPasswordAs(String password) {
        mp.passwordTextBox.sendKeys(password );
        ReusableMethods.waitFor(1);
    }

    @And("Admin clicks Sign In button")
    public void adminClicksSignInButton() {
        mp.signInButton.click();
    }

    @And("Clicks Items&Titles")
    public void clicksItemsTitles() {
        mp.itemsTitle.click();
    }

    @And("Cliks Country segment")
    public void cliksCountrySegment() {
        mp.country.click();
    }

    @And("Click create a new Country")
    public void clickCreateANewCountry() {
        mp.createANewCountry.click();
    }

    @Then("write a country name in to the Name Box")
    public void writeACountryNameInToTheNameBox() {
        mp.createCountryNameInput.sendKeys("AkbabaMehmet");
    }

    @And("Select a create date")
    public void selectACreateDate() {
    }

    @Then("Click save button")
    public void clickSaveButton() {
        mp.createCountrySaveButton.click();
    }

    @Then("Verifies  A new country is created success message")
    public void verifiesANewCountryIsCreatedSuccessMessage() {
        Assert.assertTrue(mp.countryCretaedSuccesMessage.isDisplayed());
    }
}
