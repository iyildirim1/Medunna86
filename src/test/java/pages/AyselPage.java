package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AyselPage {

    public AyselPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement HMmakeanAppointmentWebelement;


    @FindBy(xpath = "//input[@id='appoDate']")
    public WebElement appointmentDateTimeBox;


    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement HMfirstnameBox;

    @FindBy(xpath = "(//input[@id='lastName'])")
    public WebElement HMlastnameBox;


    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement HMSSNbox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement HMemailbox;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement HMphonenumberbox;

    @FindBy(xpath = "//span[normalize-space()='Send an Appointment Request']")
    public WebElement sendAppButton;

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement iconButton;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement RegSSNbox;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement RegFirstnamebox;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement RegLastnamebox;


    @FindBy(xpath = "//input[@id='username']")
    public WebElement RegusernameBox;


    @FindBy(xpath = "//input[@id='email']")
    public WebElement RegEmailBox;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement RegNewPasswordBox;

    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement RegNewpasswordConfrmBox;

    @FindBy(xpath = "//button[@id='register-submit']//span[contains(text(),'Register')]")
    public WebElement RegRegisterButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement signinUsernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement signinPasswordBox;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement signinSigninButton;

    @FindBy(xpath = "//span[text()='Register']")
    public WebElement dropdownRegisterButton;

    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement cautionRegSSN;

    @FindBy(xpath = "//div[@class='jh-card card']")
    public WebElement appoinmentRequestTable;

    @FindBy (xpath = "//span[normalize-space()='Items&Titles']")
    public WebElement itemsandtitleButton;

    @FindBy (xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement registrationSavedToastContainer;

   @FindBy (xpath = "//div[@class='modal-content']")
   public WebElement modalContentDropTable;


   @FindBy (xpath = "//input[@id='username']")
   public WebElement dropTableUsernameBox;

   @FindBy (xpath = "//input[@id='password']")
   public WebElement dropTablePasswordBox;

   @FindBy (xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
   public WebElement dropTableSigninBox;

   @FindBy (xpath = "//span[normalize-space()='Registration']")
   public WebElement RegistarionText;


  @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
  public WebElement ItemsAndTitleDropdown4;

  @FindBy(xpath = "//span[normalize-space()='Register']")
  public WebElement IconRegistrationWebelement;

  @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
  public WebElement AppointmentToastContainerMassage;

 @FindBy(xpath = "//span[text()='Create a new Appointment']")
  public WebElement createaNewAppointmentButton;

    @FindBy(xpath = "//div[normalize-space()='Your LastName is required.']")
    public WebElement cautionLastnameText;

   @FindBy(xpath = "//div[normalize-space()='Your SSN is required.']")
   public WebElement cautionSSNText;

   @FindBy(xpath = "//div[text()='Your email is required.']")
   public WebElement cautionEmailText;

   @FindBy(xpath = "//div[text()='Phone number is required.']")
   public WebElement cautionPhoneText;

   @FindBy(xpath = "//span[text()='Registration']")
   public WebElement RegistrationText;

   //@FindBy(xpath = "//span[text()='Create a new Appointment']")
   //public WebElement createaNewAppointmentButton;

   //@FindBy(xpath = "//span[text()='Create a new Appointment']")
   //public WebElement createaNewAppointmentButton;







}
