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

    @FindBy(xpath = "//li[@data-id='contacts']")
    public WebElement contactsModule;


@FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='files']")
    public WebElement fileFolderIcon;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement add_plus_icon;

    @FindBy(xpath = "//a[@data-templatename='New folder']")
    public WebElement newFolderIcon;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement newFolderIconInputTextField;

    @FindBy(xpath = "//form[@class='filenameform']//input[@type='submit']")
    public WebElement submitIcon_Arrow;


    @FindBy(xpath = "//tbody[@id='fileList']//tr[last()]/td[2]")
    public WebElement lastAddedFolder;


    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFileIcon;

    @FindBy (id = "uploadprogressbar")
    public WebElement uploadBar;


    @FindBy(xpath = "//tbody[@id='fileList']//tr[last()]//td[2]")
    public WebElement lastAddedFile;






}
