package net.trycloud.pages;

import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class Test {

    @org.junit.Test
    public void test() throws AWTException {

        String path = "/Users/maximcherepanov/Desktop/wildlife.jpg";
        LoginPage lp = new LoginPage();
        lp.logInWithSuccess();

        HomePage hp = new HomePage();
        hp.fileFolderIcon.click();
        hp.lastAddedFolder.click();

        hp.add_plus_icon.click();
        BrowserUtils.sleep(2);



                hp.uploadFileIcon.sendKeys(path);





        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.invisibilityOf(hp.uploadBar));







    }
}
