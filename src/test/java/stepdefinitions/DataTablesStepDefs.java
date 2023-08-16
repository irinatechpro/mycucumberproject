package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DataTablesPage;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class DataTablesStepDefs {

    DataTablesPage dataTablesPage = new DataTablesPage();

    @When("user clicks on new button")
    public void user_clicks_on_new_button() {
        WaitUtils.waitFor(1);
        dataTablesPage.newButton.click();

    }

    @When("user enters first name as {string}")
    public void user_enters_first_name_as(String firstname) {
        WaitUtils.waitFor(1);
        dataTablesPage.firstname.sendKeys(firstname);

    }

    @When("user enters last name as {string}")
    public void user_enters_last_name_as(String lastname) {
        WaitUtils.waitFor(1);
        dataTablesPage.lastname.sendKeys(lastname);

    }

    @When("user enters position as {string}")
    public void user_enters_position_as(String position) {
        WaitUtils.waitFor(1);
        dataTablesPage.position.sendKeys(position);
    }

    @When("user enters office as {string}")
    public void user_enters_office_as(String office) {
        WaitUtils.waitFor(1);
        dataTablesPage.office.sendKeys(office);
    }

    @When("user enters extension as {string}")
    public void user_enters_extension_as(String extension) {
        WaitUtils.waitFor(1);
        dataTablesPage.extension.sendKeys(extension);
    }

    @When("user enters start date as {string}")
    public void user_enters_start_date_as(String startDate) {
        WaitUtils.waitFor(1);
        dataTablesPage.startDate.sendKeys(startDate);
    }

    @When("user enters salary as {string}")
    public void user_enters_salary_as(String salary) {
        WaitUtils.waitFor(1);
        dataTablesPage.salary.sendKeys(salary);
    }

    @When("user clicks on create button")
    public void user_clicks_on_create_button() {
        WaitUtils.waitFor(1);
        dataTablesPage.createButton.click();
    }

    @Then("user searches for the firstname {string}")
    public void userSearchesForTheFirstname(String firstname) {

        dataTablesPage.searchBox.sendKeys(firstname);

    }

    @And("verify the name field contains the firstname {string}")
    public void verifyTheNameFieldContainsTheFirstname(String firstname) {

        dataTablesPage.nameField.getText().contains(firstname);

    }

    @And("verify the name field contains the lastname {string}")
    public void verifyTheNameFieldContainsTheLastname(String lastname) {

        dataTablesPage.nameField.getText().contains(lastname);

    }

    @And("verify the position field contains the position {string}")
    public void verifyThePositionFieldContainsThePosition(String position) {

        assertTrue(dataTablesPage.position.getText().contains(position));
    }
}