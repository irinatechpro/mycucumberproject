package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class CommonStepDefs {

    @Then("close the application")
    public void close_the_application() {

        Driver.closeDriver();

    }

    @Given("user navigates to {string}")
    public void userSearchFor (String wordToSearch) {
        google
    }
}