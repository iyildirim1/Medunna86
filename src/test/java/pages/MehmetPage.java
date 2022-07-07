package pages;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MehmetPage {

    public MehmetPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
//    public WebElement dropdownSignIn;
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signInClickIcon;

    @FindBy(linkText = "Sign in")
    public WebElement signInLink;

//    @FindBy(xpath = "//span[normalize-space()='Sign in']")
//    public WebElement signInPageClick;

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

    @FindBy(xpath = "(//span[contains(text(),'Edit')])[1]")
    public WebElement editButton;

    @FindBy(xpath = "//select[@id='in-patient-status']") //select[@id='in-patient-status']
    public WebElement statusCheckBox;

    @FindBy(className = "class=\"form-control is-touched is-pristine av-valid form-control")
    public WebElement roomCheckBox;

    @FindBy(xpath = "/html/body/div/div/div/div[4]/div/div/div/div[2]/div/form/button/span")
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

}
