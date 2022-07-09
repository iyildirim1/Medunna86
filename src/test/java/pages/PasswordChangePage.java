package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PasswordChangePage {

    public PasswordChangePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id='account-menu']//a[2]")
    public WebElement passwordChangeButton;

    @FindBy(xpath = "//input[@id='currentPassword']")
    public WebElement currentPassword;

    @FindBy(xpath = "//input[@id='newPassword']")
    public WebElement newPassword;

    @FindBy(xpath = "//input[@id='confirmPassword']")
    public WebElement confirmNewPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement passwordChangeSaveButton;

    @FindBy(xpath = "//*[contains(text(),'Password changed!')]")
    public WebElement successMessage;

    @FindBy(xpath = "//*[contains(text(),'An error has occurred! The password could not be changed.')]")
    public WebElement PasswordCantChangeError;


    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement passwordStrength;

    @FindBy(xpath = "(//li[@class='point'])[2]")
    public WebElement passwordStrength1;

    @FindBy(xpath = "(//li[@class='point'])[3]")
    public WebElement passwordStrength2;

    @FindBy(xpath = "(//li[@class='point'])[4]")
    public WebElement passwordStrength3;

    @FindBy(xpath = "(//li[@class='point'])[5]")
    public WebElement passwordStrength4;


}
