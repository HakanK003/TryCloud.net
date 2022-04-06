package net.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteFilePage extends BasePage{


    //@FindBy(xpath = "/html/body/header/div[1]/ul/li[2]/a")
    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement fileButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr/td[1]/label")
    public WebElement fileCheckbox;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/thead/tr/th[2]/div/span/a/span[2]")
    public WebElement actionButton;

    @FindBy(xpath = "//*[@id=\"selectedActionsList\"]/div/ul/li[4]/a/span[2]")
    public WebElement deleteButton;

    @FindBy(xpath = "/html/body/div[3]/div[1]/ul/li[7]/a")
    public WebElement subModuleDeleteFile;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[11]/td[2]/a/div/div")
    public WebElement talkButton;

}
