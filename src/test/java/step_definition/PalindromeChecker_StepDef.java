package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PalindromeChecker_StepDef {
    String testPalindrome;
    boolean isPalindrome;

    @Given("I have a string {string}")
    public void i_have_a_string(String word) {
        System.out.println("I have a string " + word);
        testPalindrome = word;
    }

    @When("I check if it is a palindrome")
    public void i_check_if_it_is_a_palindrome() {
       //racecar.equal(reverse(racecar));
        isPalindrome = testPalindrome.equalsIgnoreCase(new StringBuilder(testPalindrome).reverse().toString());

    }

    @Then("the result should be {string}")
    public void the_result_should_be(String string) {
        boolean expectedResult = Boolean.parseBoolean(string);
        System.out.println("the result should be " + expectedResult + " and the actual result is " + isPalindrome);
        Assert.assertEquals(expectedResult, isPalindrome);
    }

}
