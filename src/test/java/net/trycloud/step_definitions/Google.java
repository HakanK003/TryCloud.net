package net.trycloud.step_definitions;

import io.cucumber.java.en.Given;
import net.trycloud.utilities.Driver;

public class Google {

    @Given("user on google")
    public void user_on_google() {
        Driver.getDriver().get("http://google.com");
    }
}
