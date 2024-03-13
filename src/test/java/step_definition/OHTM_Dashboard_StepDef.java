package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OHTM_Dashboard_StepDef {
    @Given("I am on the OHRM Main Dashboard")
    public void iAmOnTheOHRMMainDashboard() {
        System.out.println("I am on the OHRM Main Dashboard");
    }

    @Then("I should see the following label {string}")
    public void iShouldSeeTheFollowingLabel(String value) {
        System.out.println("I should see the following label " + value);
    }
}
