package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PasswordChangePage {

    public PasswordChangePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[normalize-space()='Password']")
    public WebElement passwordChangeButton;

    @FindBy(xpath = "//input[@id='currentPassword']")
    public WebElement currentPassword;

    @FindBy(xpath = "//input[@id='newPassword']")
    public WebElement newPassword;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style, 'rgb(255, 0, 0)')]")
    public WebElement passwordStrength;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style, 'rgb(221, 221, 221)')][1]")
    public WebElement passwordStrength1;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style, 'rgb(221, 221, 221)')][2]")
    public WebElement passwordStrength2;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style, 'rgb(221, 221, 221)')][3]")
    public WebElement passwordStrength3;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style, 'rgb(221, 221, 221)')][4]")
    public WebElement passwordStrength4;
}
