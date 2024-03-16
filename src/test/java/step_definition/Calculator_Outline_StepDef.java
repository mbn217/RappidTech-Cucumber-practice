package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculator_Outline_StepDef {
    @Given("I have entered {int} into the calculator")
    public void i_have_entered_into_the_calculator(Integer int1) {
        System.out.println("I have entered " + int1 + " into the calculator");
    }

    @When("I press add")
    public void i_press_add() {
        System.out.println("I press add");
    }

    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(Integer int1) {
        System.out.println("the result should be " + int1 + " on the screen");

    }

}
