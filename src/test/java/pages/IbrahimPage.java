package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IbrahimPage {
    public IbrahimPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signInButton;

 @FindBy(xpath = "//span[normalize-space()='Sign in']")
 public WebElement firstSignInLink;

 @FindBy(xpath = "//span[normalize-space()='Remember me']")
 public WebElement rememberMe;


 @FindBy(xpath = "//span[normalize-space()='Did you forget your password?']")
 public WebElement didYouForgetPassword;

 @FindBy(xpath = "//span[normalize-space()='Register a new account']")
 public WebElement registerationPage;



    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement userNameTextBox;

    @FindBy(xpath ="//*[@id=\"password\"]" )
    public WebElement passwordTextButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/form/div[3]/button[2]/span")
    public WebElement userSignIn;

    @FindBy(xpath = "//*[@id=\"rememberMe\"]")
    public WebElement rememberMeClick;

    @FindBy(xpath = "//span[normalize-space()='Did you forget your password?']")
    public WebElement ForgetPassword;

//    @FindBy(xpath = "//span[normalize-space()='Register a new account']")
//    public WebElement registerIcon;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/form/div[3]/button[1]/span")
    public WebElement cancelButton;

    @FindBy(xpath = "///span[normalize-space()='Cancel']")
    public WebElement secondSignIn;

@FindBy(xpath = "//span[normalize-space()='MY PAGES']")
    public WebElement myPageSegment;

@FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
public WebElement myAppointments;

@FindBy(xpath = "//tbody/tr[1]/td[13]/div[1]/a[1]//*[name()='svg']")
    public WebElement editButton;

@FindBy(xpath = "//a[normalize-space()='Show Test Results']")
    public WebElement showTestResult;

@FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/a[1]/span[1]")
    public WebElement viewResults;

@FindBy(xpath = "//span[normalize-space()='ID']")
    public WebElement iD;










}
