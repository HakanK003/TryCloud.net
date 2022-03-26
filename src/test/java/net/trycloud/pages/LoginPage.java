package net.trycloud.pages;

import net.trycloud.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "user")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement LogInBTN;


    public void logInWithSuccess() {
        this.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        this.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        this.LogInBTN.click();
    }

}
