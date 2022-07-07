package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AkifPage {

    public AkifPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signInDropDown;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement signInUsernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement signInPasswordBox;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement signInSubmitButton;

    @FindBy(xpath = "//li[@id='entity-menu']//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement physicianMyPagesButton;

    @FindBy(xpath = "//li[@id='entity-menu']//div[@role='menu']//a[1]")
    public WebElement physicianMyAppointmentsButton;

    @FindBy(xpath = "(//td[normalize-space()='102365'])[1]")
    public WebElement firstPatientId;

    @FindBy(xpath = "(//td)[2]")
    public WebElement firstPatientStartDate;

    @FindBy(xpath = "(//td)[3]")
    public WebElement firstPatientEndDate;

    @FindBy(xpath = "(//td)[4]")
    public WebElement firstPatientStatus;

    @FindBy(xpath = "(//td)[11]")
    public WebElement firstPatientDoctor;

    @FindBy(xpath = "(//td)[12]")
    public WebElement firstPatientName;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement firstPatientAppointmentEditButton;

    @FindBy(xpath = "//textarea[@id='appointment-anamnesis']")
    public WebElement anamnesisTextBox;

    @FindBy(xpath = "//textarea[@id='appointment-treatment']")
    public WebElement treatmentTextBox;

    @FindBy(xpath = "//textarea[@id='appointment-diagnosis']")
    public WebElement diagnosisTextBox;

    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement appointmentStatusDropDown;

    @FindBy(xpath = "//option[@value='PENDING']")
    public WebElement pendingStatusDropDown;

    @FindBy(xpath = "//option[@value='COMPLETED']")
    public WebElement completedStatusDropDown;

    @FindBy(xpath = "//option[@value='CANCELLED']")
    public WebElement canceledStatusDropDown;

    @FindBy(xpath = "//*[contains(text(), 'Save')]")
    public WebElement appointmentSaveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement appointmentSaveCompletedAlert;

    @FindBy(xpath = "//div[@id='app-header']//a[2]")
    public WebElement registrationButton;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement registrationFirstPasswordTextBox;

    @FindBy(xpath = "//div[@class='jh-card card']//li[1]")
    public WebElement firstStrengthBar;

    @FindBy(xpath = "//div[@class='jh-card card']//li[2]")
    public WebElement secondStrengthBar;

    @FindBy(xpath = "//div[@class='jh-card card']//li[3]")
    public WebElement thirdStrengthBar;

    @FindBy(xpath = "//div[@class='jh-card card']//li[4]")
    public WebElement fourthStrengthBar;

    @FindBy(xpath = "//div[@class='jh-card card']//li[5]")
    public WebElement fifthStrengthBar;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement invalidPassword;

    @FindBy(xpath = "//ul[@id='strengthBar']")
    public WebElement passwordBarText;
}