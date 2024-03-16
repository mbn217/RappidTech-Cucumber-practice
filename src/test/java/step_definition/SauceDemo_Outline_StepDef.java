package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemo_Outline_StepDef {
    @Given("I am on the Sauce Demo login page")
    public void i_am_on_the_sauce_demo_login_page() {
        System.out.println("I am on the Sauce Demo login page");
    }

    @When("I enter invalid username {string} and password {string}")
    public void i_enter_invalid_username_and_password(String string, String string2) {
        System.out.println("I enter invalid username " + string + " and password " + string2);
    }

    @And("I click the login button")
    public void i_click_the_login_button() {
        System.out.println("I click the login button");
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String string) {
        System.out.println("I should see an error message " + string);
    }

}
