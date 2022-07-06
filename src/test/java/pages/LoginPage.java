package pages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
@JsonIgnoreProperties(ignoreUnknown = true)

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="username")
    public WebElement username;

    @FindBy(name="password")
    public WebElement password;

    @FindBy(name="rememberMe")
    public WebElement rememberMeCheckmark;

    @FindBy(xpath="(//span[text()='Sign in'])[3]")
    public WebElement loginButton;

    @FindBy(xpath="//*[text()='Did you forget your password?']")
    public WebElement updatePassword;

    @FindBy(xpath="//*[text()='Register a new account']")
    public WebElement proceedToRegistration;

    @FindBy(id = "account-menu")
    public WebElement AccountMenu;

    @FindBy(css = "button[type='submit'] span")
    public WebElement SignInSubmitButton;

}
