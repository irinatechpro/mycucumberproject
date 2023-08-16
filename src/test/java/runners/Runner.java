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
                "junit:target/xml-report/cucumber.xml"

        },
        //monochrome = true,// it makes the report on console readable
        features = "./src/test/resources",//path of feature file
        glue = "stepdefinitions", //path of the step definitions
        tags = "@data_tables",//this marks which feature file or scenario to run.
        dryRun = false//dryRun is used to check if there is any MISSING JAVA CODE(STEP DEFINITIONS)

)
public class Runner {

}