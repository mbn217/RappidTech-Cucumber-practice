package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BingSearch_StepDef {

    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {

        System.out.println("++++++user is on the Bing search page");
    }

    @When("user searches for {string}")
    public void user_searches_for(String string) {
        System.out.println("++++++user searches for " + string);
    }

    @Then("the search result title should contain {string}")
    public void the_search_result_title_should_contain(String string) {
        System.out.println("++++++the search result title should contain " + string);
    }

    @Then("the search result count should be greater than {int}")
    public void the_search_result_count_should_be_greater_than(Integer int1) {
        System.out.println("++++++the search result count should be greater than " + int1);
    }




}
