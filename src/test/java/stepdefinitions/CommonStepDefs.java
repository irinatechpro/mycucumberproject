package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GoogleHomePage;
import utilities.Driver;

public class CommonStepDefs {
    GoogleHomePage googleHomePage = new GoogleHomePage();
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }
//    @Then("accept Google popup") from Slack Furkan
//    public void acceptPopup() {
//        try{
//            googlePage.popupAccept.click();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }

    @Given("user navigates to {string}")
    public void userNavigatesTo(String arg0) {
        Driver.getDriver().get(arg0);
        try{
            //Google has a confirmation popup for cookie terms, we locate and accept it
            googleHomePage.acceptCookies.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}