package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                        "pretty",//generate the report on console colorfully
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"

        },
        features = "@target/failedRerun.txt",//path of the failedRerun.txt
        glue = "stepdefinitions", //path of the step definitions
        tags = "@data_tables",//this marks which feature file or scenario to run.
        dryRun = false//dryRun is used to check if there is any MISSING JAVA CODE(STEP DEFINITIONS)

)
public class FailedTestRunner {

}