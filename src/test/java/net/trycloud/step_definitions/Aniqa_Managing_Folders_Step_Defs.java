package net.trycloud.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.HomePage;
import net.trycloud.pages.LoginPage;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Aniqa_Managing_Folders_Step_Defs {


    HomePage hp = new HomePage();
    Faker faker = new Faker();
    String textToVerify = faker.superhero().name();


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        LoginPage lp = new LoginPage();
        lp.logInWithSuccess();
    }

    @When("the user clicks the -Files- module")
    public void the_user_clicks_the_module() {

        hp.fileFolderIcon.click();

    }

    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        hp.add_plus_icon.click();
    }

    @When("user click -new folder-")
    public void user_click() {
        hp.newFolderIcon.click();
    }

    @When("user write a folder name")
    public void user_write_a_folder_name() {
        hp.newFolderIconInputTextField.sendKeys(textToVerify);
    }

    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        hp.submitIcon_Arrow.click();
    }

    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {

        BrowserUtils.sleep(3);
        Assert.assertEquals(textToVerify, hp.lastAddedFolder.getText());
    }


    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {
        hp.lastAddedFolder.click();
    }

    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {

        String path = "/Users/maximcherepanov/Desktop/wildlife.jpg";

        hp.add_plus_icon.click();


        hp.uploadFileIcon.sendKeys(path);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.invisibilityOf(hp.uploadBar));


    }


    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        Assert.assertTrue(hp.lastAddedFile.isDisplayed());
    }


}
