package net.trycloud.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.DeleteFilePage;
import net.trycloud.pages.LoginPage;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.ConfigurationReader;
import net.trycloud.utilities.Driver;
import org.junit.Assert;

public class DeleteFile {

    DeleteFilePage deleteFilePage = new DeleteFilePage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("mainPageURL"));
        LoginPage loginPage = new LoginPage();
        loginPage.logInWithSuccess();


    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

     deleteFilePage.fileButton.click();


    }
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
     deleteFilePage.fileCheckbox.click();
     deleteFilePage.actionButton.click();
    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

        deleteFilePage.deleteButton.click();
    }

    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String string) {
      deleteFilePage.subModuleDeleteFile.click();
    }
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {
       // Assert.assertTrue(deleteFilePage.talkButton.isDisplayed());
    }

}
