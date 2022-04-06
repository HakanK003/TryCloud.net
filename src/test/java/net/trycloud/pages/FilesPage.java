package net.trycloud.pages;

import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {
    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='files']")
    public WebElement fileFolderIcon;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addIcon;

    @FindBy(xpath= "//span[text()='New folder']")
    public WebElement newFolderIcon;

    @FindBy(xpath= "//input[@id='view13-input-folder']")
    public WebElement fileNameInputBox;

    @FindBy(xpath = "//form[@class='filenameform']//input[@type='submit']")
    public WebElement submitButton;



}
