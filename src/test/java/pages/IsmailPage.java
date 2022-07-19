package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IsmailPage {

    public IsmailPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement accountIcon;

    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement registerSubmitButton;

    @FindBy(id="email")
    public WebElement emailBox;

    @FindBy(xpath = "//div[text()='Your username is invalid.']")
    public WebElement usernameInvalidMessage;

    @FindBy(xpath = "//div[text()='This field is invalid']")
    public WebElement emailInvalidMessage;

    @FindBy(xpath = "//div[text()='Your email is required.']")
    public WebElement emailRequiredMessage;

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemsAndTitlesButton;

    @FindBy(linkText = "Patient")
    public WebElement patientPortal;

    @FindBy(id = "username")
    public WebElement usernameBoxSignIn;

    @FindBy(id = "password")
    public WebElement passwordBoxSignIn;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement signInButton;

    @FindBy(linkText = "Sign in")
    public WebElement signInLink;

    @FindBy(xpath = "//span[normalize-space()='Patients']")
    public WebElement PatientPortalHeader;

    @FindBy(linkText = "Edit")
    public WebElement editButtonPatient;

    @FindBy(id = "patient-id")
    public WebElement patientIDBox;

    @FindBy(id = "patient-firstName")
    public WebElement patientFirstNameBox;

    @FindBy(id = "patient-lastName")
    public WebElement patientLastNameBox;

    @FindBy(id = "patient-birthDate")
    public WebElement patientBirthDayBox;

    @FindBy(id = "email")
    public WebElement patientEmailBox;

    @FindBy(id = "patient-phone")
    public WebElement patientPhoneNumberBox;

    @FindBy(id = "patient-gender")
    public WebElement patientGenderBox;

    @FindBy(id = "patient-bloodGroup")
    public WebElement patientBloodGroupBox;

    @FindBy(id = "patient-adress")
    public WebElement patientAddressBox;

    @FindBy(id = "patient-description")
    public WebElement patientDescriptionBox;

    @FindBy(id = "patient-user")
    public WebElement patientUserNameBox;

    @FindBy(id = "patient-country")
    public WebElement patientCountryBox;

    @FindBy(id = "patient-cstate")
    public WebElement patientStateBox;

    @FindBy(id = "save-entity")
    public WebElement savePatientChanges;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "firstPassword")
    public WebElement firstPassword;

    @FindBy(id = "secondPassword")
    public WebElement secondPassword;

    @FindBy(xpath ="//div[text()='Registration Saved']")
    public WebElement registrationConfirmedMessage;

    @FindBy(xpath = "//div[contains(text(),'A Patient is updated')]")
    public WebElement patientUpdatedMessage;

    @FindBy(linkText = "Search Patient")
    public WebElement searchPatientLink;

    @FindBy(linkText = "MY PAGES")
    public WebElement myPagesLink;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnSearchBox;

    @FindBy(xpath ="//tr/td[2]")
    public WebElement ssnTableVerify;

    @FindBy(id = "jh-create-entity")
    public WebElement createATest;

    @FindBy(id="c-test-item-name")
    public WebElement testName;

    @FindBy(id = "c-test-item-description")
    public WebElement testDescription;

    @FindBy(id = "c-test-item-price")
    public  WebElement testPrice;
    @FindBy(id = "c-test-item-defaultValMin")
    public WebElement testMinValue;
    @FindBy (id = "c-test-item-defaultValMax")
    public WebElement testMaxValue;

    @FindBy(id = "save-entity")
    public WebElement testSaveButton;

    @FindBy(xpath = "//div[contains(text(),'A new Test Item is created')]")
    public WebElement testCreationMessage;

    @FindBy(xpath = "//h2/span")
    public WebElement createTestPageTitle;

    @FindBy(linkText = "Test Item")
    public WebElement testItemLink;

    @FindBy(xpath = "//tr[10]/td[8]/div/a[1]")
    public WebElement randomTestItem;

    @FindBy(xpath = "//h2/span")
    public WebElement testitemViewTitle;

    @FindBy(id = "jhi-confirm-delete-cTestItem")
    public WebElement testItemDeletePopUp;

    @FindBy(xpath = "//tbody/tr[last()]/td[8]/div/a[3]")
    public WebElement randomTestItemDelete;

    @FindBy(xpath = "//div[contains(text(),'A Test Item is deleted')]")
    public WebElement testItemDeleteMessage;

    @FindBy(xpath = "//*[text()='»»']")
    public WebElement goToLastPageTestItems;

















}
