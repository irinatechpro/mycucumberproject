package stepdefinitions;

import io.cucumber.java.en.*;
import utilities.DBUtils;

public class JDBCStepDefs {
    @Given("user connects to the application database")
    public void user_connects_to_the_application_database() {
        DBUtils.createConnection();
    }
    @When("user gets the column {string} from the table {string}")
    public void user_gets_the_column_from_the_table(String columnName, String tableName) {

    }
    @Then("user reads all column {string} data")
    public void user_reads_all_column_data(String columnName) {

    }

}