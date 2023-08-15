package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.GoogleHomePage;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class GoogleStepDefs {

    GoogleHomePage googleHomePage = new GoogleHomePage();

    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
        Driver.getDriver().get("https://www.google.com");
    }


    @When("user search for iPhone")
    public void userSearchForIPhone() {

        googleHomePage.searchBox.sendKeys("iPhone" + Keys.ENTER);

    }

    @Then("verify the page title contains iPhone")
    public void verify_the_page_title_contains_i_phone() {

        assertTrue(Driver.getDriver().getTitle().contains("iPhone"));

    }

    @Given("user search for porcelain tea pot")
    public void user_search_for_porcelain_tea_pot() {

        googleHomePage.searchBox.sendKeys("porcelain tea pot" + Keys.ENTER);


    }

    @Then("verify the page title contains porcelain tea pot")
    public void verify_the_page_title_contains_porcelain_tea_pot() {

        assertTrue(Driver.getDriver().getTitle().contains("porcelain tea pot"));

    }


    @When("user search for {string}")
    public void userSearchFor(String wordToSearch) {

        googleHomePage.searchBox.sendKeys(wordToSearch + Keys.ENTER);

    }

    @Then("verify the page title contains {string}")
    public void verifyThePageTitleContains(String wordToVerify) {

        assertTrue(Driver.getDriver().getTitle().contains(wordToVerify));

    }
}