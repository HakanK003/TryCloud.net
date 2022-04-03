package net.trycloud.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.HomePage;
import net.trycloud.pages.LoginPage;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.ConfigurationReader;
import net.trycloud.utilities.Driver;
import org.junit.Assert;

public class ContactsModuleAccessStepDefinitions {

     LoginPage loginPage = new LoginPage();
     HomePage homePage = new HomePage();



     @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("mainPageURL"));

       // loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
       // loginPage.passwordInput.sendKeys( ConfigurationReader.getProperty("password") );
      //  loginPage.LogInBTN.click();
    }


    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

        homePage.contactsModule.click();

    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {

        BrowserUtils.sleep(3);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("contacts trycloud qa"));



    }

}
