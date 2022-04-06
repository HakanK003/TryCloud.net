package net.trycloud.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.FilesPage;
import net.trycloud.pages.HomePage;
import net.trycloud.pages.LoginPage;
import net.trycloud.utilities.ConfigurationReader;
import net.trycloud.utilities.Driver;

public class Manage_Folders_StepDefinitions {

    HomePage homepage= new HomePage();
    LoginPage loginPage= new LoginPage();

    @Given("user on the dashboard page")
    public void user_is_on_the_dashboard_page() {

        loginPage.logInWithSuccess();

    }
    @When("the user clicks the -Files- module")
    public void the_user_clicks_the_module() {




    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {

    }
    @When("user click \"new folder”")
    public void user_click_new_folder() {


    }
    @When("user write a folder name")
    public void user_write_a_folder_name() {


    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {

    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {

    }


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

    }

    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {

    }

    @When("user click \"new folder”")
    public void user_click_new_folder() {

    }

    @When("user write a folder name")
    public void user_write_a_folder_name() {

    }

    @When("the user click submit icon")
    public void the_user_click_submit_icon() {

    }

    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {

    }

}
