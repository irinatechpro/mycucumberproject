package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GoogleHomePage;
import utilities.Driver;

public class CommonStepDefs {
    GoogleHomePage googleHomePage = new GoogleHomePage();
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @Given("user navigates to {string}")
    public void userNavigatesTo(String arg0) {
        Driver.getDriver().get(arg0);
        //Google has a confirmation popup for cookie terms, we locate and accept it
        googleHomePage.acceptCookies.click();
    }
}