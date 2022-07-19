package stepdefinitions.uiStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bson.BsonElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pages.MehmetPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import javax.imageio.stream.ImageInputStream;
import java.util.List;

public class MehmetStepDefsUS14_TC02 {

MehmetPage mp = new MehmetPage();

    WebDriver driver;


    @Given("Doctor  navigates to medunnaUrl homepage")
    public void doctor_navigates_to_medunna_url_homepage()  {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("Doctor navigate to the Sign In page")
    public void doctor_navigate_to_the_sign_in_page()  {
       mp.signInClickIcon.click();
        mp.signInLink.click();
    }
    @When("Doctor types username as {string}")
    public void doctor_types_username_as(String username) {
        mp.usernameTextBox.sendKeys(username);
        ReusableMethods.waitFor(1);
    }
    @When("Doctor types password as {string}")
    public void doctor_types_password_as(String password) {
        mp.passwordTextBox.sendKeys(password );
        ReusableMethods.waitFor(1);
    }
    @When("Doctor clicks Sign In button")
    public void doctor_clicks_sign_in_button() {
        mp.signInButton.click();

    }
    @When("Doctor navigate to the My Pages")
    public void doctor_navigate_to_the_my_pages() {
        mp.myPagesSegment.click();
        ReusableMethods.waitFor(1);
    }
    @Then("clicks My Inpatients")
    public void clicks_my_inpatients() {
        mp.myInpatientSegment.click();
       ReusableMethods.waitFor(1);
    }
    @And("verifies all Inpatients as ID, Start Date, End Date, Status, Description, Created Date, Room, Appointment, Patient")
    public void verifiesAllInpatientsAsIDStartDateEndDateStatusDescriptionCreatedDateRoomAppointmentPatient() {

         Driver.waitForVisibility(mp.entireTable,3);
        Assert.assertTrue(mp.entireTable.isDisplayed());

        Assert.assertTrue(mp.IDDisplayed.isDisplayed());
        Assert.assertTrue(mp.StartDate.isDisplayed());
        Assert.assertTrue(mp.EndDateDisplayed.isDisplayed());
        Assert.assertTrue(mp.StatusDisplayed.isDisplayed());
        Assert.assertTrue(mp.DescriptionDisplayed.isDisplayed());
        Assert.assertTrue(mp.CreatedDateDisplayed.isDisplayed());
        Assert.assertTrue(mp.RoomDisplayed.isDisplayed());
        Assert.assertTrue(mp.AppointmentDisplayed.isDisplayed());
        Assert.assertTrue(mp.Patient.isDisplayed());
    }
    @And("clicks edit  button on {string} patients")
    public void clicksEditButtonOnPatients(String status) {
        List<String> statusColumnText = ReusableMethods.getElementsText(mp.statusTableColumn);
        ReusableMethods.waitFor(1);
        for (int i = 0; i < statusColumnText.size(); i++) {
            if (statusColumnText.get(i).equals(status)) {
                mp.editColumnList.get(i).click();
                break;
            }
        }
    }

    @And("update created date {string}")
    public void updateCreatedDate(String arg0) {
        mp.createdDateUpdate.sendKeys(arg0);
    }
    @And("update status to Staying")
    public void updateStatusToStaying() {
        Select status= new Select(mp.statusCheckBox);
        ReusableMethods.waitFor(2);
        status.selectByVisibleText("STAYING");
    }
    @And("update status to CANCELLED")
    public void updateStatusToCANCELLED() {
        Select status= new Select(mp.statusCheckBox);
        ReusableMethods.waitFor(2);
        status.selectByVisibleText("CANCELLED");
    }
    @And("Update status to DISCHARGED")
    public void updateStatusToDISCHARGED() {
        Select status= new Select(mp.statusCheckBox);
        ReusableMethods.waitFor(2);
        status.selectByVisibleText("DISCHARGED");
    }
    @And("Update status to UNAPPROVED")
    public void updateStatusToUNAPPROVED() {
        Select status= new Select(mp.statusCheckBox);
        ReusableMethods.waitFor(2);
        status.selectByVisibleText("UNAPPROVED");
    }
    @And("click save button")
    public void clickSaveButton() {


      Driver.waitForClickablility(mp.saveButton, 13);
        JSUtils.scrollIntoViewByJS(mp.saveButton);
        mp.saveButton.submit();
    }
    @Then("verifies the error message is displayed")
    public void verifiesTheErrorMessageIsDisplayed() {
       Driver.waitForVisibility(mp.canNotBeUpdatedMessage,13);
        Assert.assertTrue( mp.canNotBeUpdatedMessage.isDisplayed());
    }
    @Then("verifies  the success message is displayed")
    public void verifiesTheSuccessMessageIsDisplayed() {
        Driver.waitForVisibility(mp.successMessage,13);
        Assert.assertTrue(mp.successMessage.isDisplayed());
    }
    @And("select a  room with available room")
    public void selectARoomWithAvailableRoom() {
        ReusableMethods.waitFor(2);
        Select select =new Select(mp.roomCheckBox);
        List<WebElement> roomOptions = select.getOptions();

        for (int i =1; i <roomOptions.size(); i++){
            if (!(roomOptions.get(i).getText().contains("FULL-UNAVAILABLE"))){
                roomOptions.get(i).click();
                break;
            }
        }
        ReusableMethods.waitFor(2);
        select.getFirstSelectedOption().getText();
    }
    @And("update room with unavailable room")
    public void updateRoomWithUnavailableRoom() {
        ReusableMethods.waitFor(2);
        Select select =new Select(mp.roomCheckBox);
        List<WebElement> roomOptions = select.getOptions();
        for (int i =1; i <roomOptions.size(); i++){
            if (!(roomOptions.get(i).getText().contains("FULL-UNAVAILABLE"))){
                roomOptions.get(i).click();
                break;
            }
        }
        ReusableMethods.waitFor(2);
        select.getFirstSelectedOption().getText();
    }
    @And("select available room")
    public void selectAvailableRoom() {
        ReusableMethods.waitFor(1);
        Select select =new Select(mp.roomCheckBox);
        List<WebElement> roomOptions = select.getOptions();
        for (int i =1; i <roomOptions.size(); i++){
            if (!(roomOptions.get(i).getText().contains("FULL-UNAVAILABLE"))){
                roomOptions.get(i).click();
                break;
            }
        }
    }
    @And("click MY Appointments")
    public void clickMYAppointments() {
        mp.clickMyAppointments.click();
    }
    @And("click edit button on my appointments")
    public void clickEditButtonOnMyAppointments() {
        mp.editForTestRequest.click();
    }
    @And("click Request A  Test")
    public void clickRequestATest() throws InterruptedException {
        mp.RequestATest.click();
        mp.RequestATest.click();
    }
    @And("Verifies Test Items Info as ID and Name")
    public void verifiesTestItemsInfoAsIDAndName() {
        Assert.assertTrue(mp.IDTestItemsDisplayed.isDisplayed());
        Assert.assertTrue(mp.nameTestItemsDisplayed.isDisplayed());
    }

    @Then("verifies items as checkmark options;Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin")
    public void verifiesItemsAsCheckmarkOptionsUreaCreatinineSodiumPotassiumTotalProteinAlbuminHemoglobin() {
        Driver.waitForVisibility(mp.ureaCheckmark,3);
        Assert.assertTrue(mp.ureaCheckmark.isDisplayed());
        Assert.assertTrue(mp.creatinineCheckmark.isDisplayed());
        Assert.assertTrue(mp.sodiumCheckmark.isDisplayed());
        Assert.assertTrue(mp.potassiumCheckmark.isDisplayed());
        Assert.assertTrue(mp.totalProteinCheckmark.isDisplayed());
        Assert.assertTrue(mp.albuminCheckmark.isDisplayed());
        Assert.assertTrue(mp.hemoglobinCheckmark.isDisplayed());
    }
    @Then("verifies item as checkmark option; Glucose")
    public void verifiesItemAsCheckmarkOptionGlucose() {
        Assert.assertFalse(mp.toString().contains("Glucose"));
//        yanlis olma olasiligi yuksek kontrol et bu kodu daha sonra
    }
    @And("update description")
    public void updateDescription() {
        ReusableMethods.waitFor(2);
        mp.descriptionBox.clear();
        mp.descriptionBox.sendKeys("Mehmet");
    }
    @Then("verifies  the Such a room not found error message is displayed")
    public void verifiesTheSuchARoomNotFoundErrorMessageIsDisplayed() {
        Driver.waitForVisibility(mp.redErrorSuchasNotFoundRoom,13);
        Assert.assertTrue( mp.redErrorSuchasNotFoundRoom.isDisplayed());
    }
    @And("update room with available room")
    public void updateRoomWithAvailableRoom() {
        Select selectAvailableRoom = new Select(mp.roomCheckBox);
        ReusableMethods.waitForVisibility(mp.roomCheckBox,2);
    }
    @And("Update room")
    public void updateRoom() {
    }
    @And("close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }


}
