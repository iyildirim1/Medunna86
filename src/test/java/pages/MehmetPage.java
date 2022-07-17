package pages;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MehmetPage {

    public MehmetPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signInClickIcon;
    @FindBy(linkText = "Sign in")
    public WebElement signInLink;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameTextBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement signInButton;
    @FindBy(xpath = "//span[normalize-space()='MY PAGES']")
    public WebElement myPagesSegment;
    @FindBy(xpath = "//span[normalize-space()='My Inpatients']")
    public WebElement myInpatientSegment;
    @FindBy(xpath = "//input[@id='in-patient-description']")
    public WebElement descriptionBox;
    @FindBy(xpath = "//select[@name='status']") //select[@id='in-patient-status']
    public WebElement statusCheckBox;
    @FindBy(xpath = "//select[normalize-space()='Status']")
    public List<WebElement> status;
    @FindBy(xpath = "//table[@class='table']//tbody//tr//td[4]")////span[normalize-space()='Status']  //th[5]
    public List<WebElement> statusTableColumn;
    @FindBy(xpath = "//table[@class='table']//tbody//tr//td[10]")////span[normalize-space()='Status']  //th[5]
    public List<WebElement> editColumnList;
    @FindBy(xpath = "//table[@class='table']//thead//tr[1]")
    public WebElement tableHeader;
    @FindBy(xpath = "//table[@class='table']//tbody")
    public WebElement tableBody;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement redErrorSuchasNotFoundRoom;
    @FindBy(xpath = "//h4[normalize-space()='My Links (Physician)']")
    public WebElement scrollDownForSeeStatus;
    @FindBy(xpath = "//select[@id='in-patient-room']")
    public WebElement roomCheckBox;
    @FindBy(xpath = "//*[@id=\"save-entity\"]/span")
    public WebElement saveButton;
    @FindBy(xpath = "//span[normalize-space()='Start Date']")
    public WebElement StartDate;
    @FindBy(xpath = "//span[normalize-space()='ID']")
    public WebElement IDDisplayed;
    @FindBy(xpath = "//span[normalize-space()='End Date']")
    public WebElement EndDateDisplayed;
    @FindBy(xpath = "//span[normalize-space()='Status']")
    public WebElement StatusDisplayed;
    @FindBy(xpath = "//span[normalize-space()='Description']")
    public WebElement DescriptionDisplayed;
    @FindBy(xpath = "//span[normalize-space()='Created Date']")
    public WebElement CreatedDateDisplayed;
    @FindBy(xpath = "//span[normalize-space()='Room']")
    public WebElement RoomDisplayed;
    @FindBy(xpath = "//span[normalize-space()='Appointment']")
    public WebElement AppointmentDisplayed;
    @FindBy(xpath = "//span[normalize-space()='Patient']")
    public WebElement Patient;
    @FindBy(xpath = "//table[@class='table']")
    public WebElement entireTable;
   @FindBy(xpath ="//*[contains (text(),'The In Patient is updated with identifier')]")
    public WebElement successMessage;
    @FindBy(xpath ="//*[contains (text(),'InPatient status can not be changed ')]")
    public WebElement canNotBeUpdatedMessage;
    @FindBy(xpath = "//input[@id='in-patient-createdDate']")
    public WebElement createdDateUpdate;
    @FindBy(xpath = "//select[@id='in-patient-status']")
    public WebElement dropdownStatus;
    @FindBy(xpath = "(//span[contains(text(),'Edit')])[1]")
    public WebElement editForTestRequest;
    @FindBy(xpath = "//span[normalize-space()='My Appointments']")
    public WebElement clickMyAppointments;
    @FindBy(xpath = "//a[normalize-space()='Request A Test']")
    public WebElement RequestATest;
    @FindBy(xpath = "//span[normalize-space()='ID']")
    public WebElement IDTestItemsDisplayed;
    @FindBy(xpath = "//span[normalize-space()='Name']")
    public WebElement nameTestItemsDisplayed;



    @FindBy(xpath = "//input[@id='1404']")
    public WebElement sodiumCheckmark;
    @FindBy(xpath = "//input[@id='1402']")
    public WebElement ureaCheckmark;
    @FindBy(xpath = "//input[@id='1407']")
    public WebElement albuminCheckmark;
    @FindBy(xpath = "//input[@id='1403']")
    public WebElement creatinineCheckmark;
    @FindBy(xpath = "//input[@id='1408']")
    public WebElement hemoglobinCheckmark;
    @FindBy(xpath = "//input[@id='1405']")
    public WebElement potassiumCheckmark;
    @FindBy(xpath = "//input[@id='1406']")
    public WebElement totalProteinCheckmark;


}
