package step_definition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

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
//        System.out.println("Username is : " + loginCreds.get(0).get(0));
//        System.out.println("Password is : " + loginCreds.get(0).get(1));
//        System.out.println("Username is : " + loginCreds.get(1).get(0));
//        System.out.println("Password is : " + loginCreds.get(1).get(1));

        //Using for each to loop throught each of the item inside the list
//        for(List<String> val : loginCreds){
//            for(String creds : val){
//                System.out.println("Creds are : " + creds);
//            }
//        }

        for(int i  = 0 ; i < loginCreds.size() ; i++){
            for(int j = 0 ; j < loginCreds.get(i).size() ; j++){
                if( j ==  0 ){
                    System.out.println("Username is : " + loginCreds.get(i).get(j));
                }else{
                    System.out.println("Password is : " + loginCreds.get(i).get(j));
                }
            }
        }


    }


    @Given("I login with these following credentials")
    public void i_login_with_these_following_credentials(DataTable dataTable) {
        List<Map<String,String>> loginCreds = dataTable.asMaps();
        System.out.println(loginCreds);
//        System.out.println(loginCreds.get(0).get("username"));
//        System.out.println(loginCreds.get(0).get("password"));
//        System.out.println(loginCreds.get(1).get("username"));
//        System.out.println(loginCreds.get(1).get("password"));
//        System.out.println(loginCreds.get(2).get("username"));
//        System.out.println(loginCreds.get(2).get("password"));

        for(Map<String,String> user : loginCreds){
            String userName = user.get("username");
            String password = user.get("password");
            System.out.println("Username is : " + userName +" ---- Password is : " + password);
        }



    }






}
