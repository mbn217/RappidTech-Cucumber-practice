package step_definition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.List;

public class Login_Datatables_StepDef {
    @Given("I open my application")
    public void i_open_my_application() {
        System.out.println("I open my application");
    }

    //This belongs to line 5 in the feature file
//    @And("I login with credentials {string} and {string}")
//    public void i_login_with_credentials_and(String string, String string2) {
//        System.out.println("I login with credentials " + string + " and " + string2);
//    }

    @Given("I login with following credentials")
    public void i_login_with_following_credentials(DataTable dataTable) {
        List<List<String>> loginCreds = dataTable.asLists(String.class);
        System.out.println("Username is : " + loginCreds.get(0).get(0));
        System.out.println("Password is : " + loginCreds.get(0).get(1));
        System.out.println("Username is : " + loginCreds.get(1).get(0));
        System.out.println("Password is : " + loginCreds.get(1).get(1));

    }

}
