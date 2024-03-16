package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"@target/failed_scenarios.txt"}, // path to failed the feature files
        glue = {"step_definition"}  // path to the step definition files
)
public class FailedTestRunner {
}
