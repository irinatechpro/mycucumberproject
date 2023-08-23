package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class GridStepDefs {

    WebDriver driver;

    @Given("user navigates to {string} by using {string} browser")
    public void user_navigates_to_by_using_browser(String url, String browser) throws MalformedURLException {
        //Create URL Object
        URL remoteURL = new URL("http://192.168.1.111:4444");

        if (browser.equalsIgnoreCase("chrome")){
            driver = new RemoteWebDriver(remoteURL, new ChromeOptions());
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new RemoteWebDriver(remoteURL, new FirefoxOptions());
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new RemoteWebDriver(remoteURL, new EdgeOptions());
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //The only difference between Selenium WebDriver and Selenium Grid is RemoteWebDriver
        //Rest is same
        driver.get(url);

    }

    @Then("verify title contains {string}")
    public void verify_title_contains(String title) {

        assertTrue(driver.getTitle().contains(title));

    }

    @Then("close the remote driver")
    public void close_the_remote_driver() {

        driver.close();

    }

}