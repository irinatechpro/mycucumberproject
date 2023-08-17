package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.BlueRentalHomePage;
import pages.BlueRentalLoginPage;
import utilities.WaitUtils;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class BlueRentalStepDefs {

    BlueRentalLoginPage blueRentalLoginPage = new BlueRentalLoginPage();
    BlueRentalHomePage blueRentalHomePage = new BlueRentalHomePage();
    @When("user enters the admin email and password")
    public void user_enters_the_admin_email_and_password(DataTable dataTable) {

        List<String> credentials = dataTable.row(1);

        String email = credentials.get(0);
        String password = credentials.get(1);

        blueRentalLoginPage.email.sendKeys(email);
        blueRentalLoginPage.password.sendKeys(password);

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        WaitUtils.waitFor(2);
        blueRentalLoginPage.loginButton.click();

    }
    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {
        WaitUtils.waitFor(2);
        assertTrue(blueRentalHomePage.userId.isDisplayed());
        assertTrue(false);

    }
}
