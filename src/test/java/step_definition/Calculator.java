package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class Calculator {
    @Given("I have the following numbers")
    public void i_have_the_following_numbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(" Number is :  **** "+numbers.get(i));
        }


    }

    @When("I add them together")
    public void i_add_them_together() {
        System.out.println("I add them together");
    }

    @Then("the result should be {int}")
    public void the_result_should_be(Integer int1) {
        System.out.println("the result should be " + int1);
    }

}
