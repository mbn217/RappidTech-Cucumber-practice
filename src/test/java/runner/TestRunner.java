package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"}, // path to the feature files
        glue = {"step_definition"},  // path to the step definition files
        plugin = {"pretty", "html:target/RappidTech-report.html",
                "rerun:target/failed_scenarios.txt",  // to generate a txt file with failed scenarios
                "json:target/RappidTech-report.json",
                "me.jvt.cucumber.report.PrettyReports:target/RappidTech-report"}, // to generate reports
        tags = "@wip"
        //monochrome = true // to make the console output in a better format
        //dryRun = true // to check if the mapping is proper between feature file and step definition file
        //publish = false // to publish the report


)
public class TestRunner {
}
