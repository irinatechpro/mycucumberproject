package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources",//path of feature file
        glue = "stepdefinitions",//path of the step definitions
        tags = "@google",
        dryRun = false


)
public class Runner {
}