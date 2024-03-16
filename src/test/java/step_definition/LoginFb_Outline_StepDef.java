package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFb_Outline_StepDef {

    @Given("User navigates to Facebook")
    public void user_navigates_to_facebook() {
        System.out.println("User navigates to Facebook");
    }

    @When("User enter username {string} and password {string}")
    public void user_enter_username_and_password(String userName, String Password) {
        System.out.println("User enter username " + userName + " and password " + Password);

    }

    @Then("login should be successful")
    public void login_should_be_successful() {
        System.out.println("login should be successful");
    }

}
