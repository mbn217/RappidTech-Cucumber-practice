package step_definition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class Datatable_Example_StepDef {
    @Given("I have the following list of fruit")
    public void i_have_the_following_list_of_fruit(DataTable dataTable) {
        List<String> listOfFruit = dataTable.asList();
        for(int i= 1; i < listOfFruit.size(); i++){
            System.out.println(" Fruit are : "+ listOfFruit.get(i));
        }

    }

    @When("I go to the market")
    public void i_go_to_the_market() {
        System.out.println("I go to the market");
    }

    @Then("I should have {int} fruits in my basket")
    public void i_should_have_fruits_in_my_basket(Integer int1) {
        System.out.println("I should have " + int1 + " fruits in my basket");
    }



    @Given("user is on the dropdown page of kayak website")
    public void user_is_on_the_dropdown_page_of_kayak_website() {
        System.out.println("user is on the dropdown page of kayak website");
    }
    @Then("user should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

        for(int i= 0; i < expectedMonths.size(); i++){
            System.out.println(" Months are : "+ expectedMonths.get(i));
        }

    }




}
