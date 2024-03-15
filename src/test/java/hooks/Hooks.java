package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    @Before(order = 0, value="@smoke")
    public void setup(){
        System.out.println("+++++++++Setup maximize browser");
    }

    @Before(order = 1)
    public void setupTwo(){
        System.out.println("+++++++++Setup Two -- 200 px width and 30 px length" );
    }


    @After("not @smoke")
    public void tearDown(){
        System.out.println("+++++++++TearDown");
    }
    @BeforeStep
    public void beforeStep(){
        System.out.println("+++++++++Before Step");
    }
    @AfterStep
    public void afterStep(){
        System.out.println("+++++++++After Step");
    }


}
