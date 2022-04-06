package net.trycloud.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.HomePage;
import net.trycloud.pages.LoginPage;
import net.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Adrian_Step_Defs {

    HomePage hp = new HomePage();


    @Given("User on the dashboard page")
    public void user_on_the_dashboard_page() {

        LoginPage lp = new LoginPage();
        lp.logInWithSuccess();
    }

    @When("user clicks the -Files- module")
    public void the_user_clicks_the_module() {

        hp.fileFolderIcon.click();
    }

    @Then("verify the page title is -Files - Trycloud QA-")
    public void verify_the_page_title_is_files_trycloud_qa() {

        String expectedTitle = "Files - Trycloud QA";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }


    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        hp.selectAllFilesCheckBox.click();
    }

    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {

        for (WebElement each : hp.listOfCheckBoxElements) {
            Assert.assertTrue(each.isSelected());
        }


    }

}
