package net.trycloud.pages;

import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "div[class='full-name']")
    public List<WebElement> contactList;

    @FindBy(xpath ="//li[@id='contacts']")
    public WebElement contactsModule;


}
