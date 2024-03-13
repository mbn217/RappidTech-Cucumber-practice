package step_definition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.json.JsonOutput;

public class DiceSearch_StepDef {
    @Given("user is on dice homepage")
    public void user_is_on_dice_homepage() {
        System.out.println("++++++++User is on dice homepage");
    }

    @When("user enters keyword and zipcode")
    public void user_enters_keyword_and_zipcode() {
        System.out.println("++++++++user enters keyword and zipcode");
    }

    @Then("user should see search result")
    public void user_should_see_search_result() {
        System.out.println("++++++user should see search result");
    }


}
