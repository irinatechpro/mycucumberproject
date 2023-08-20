package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    /*
    Hooks is used to run before or after each scenario
    this class should only have @Before or @After annotations
    by default these methods runs for all scenarios automatically
    but conditional hooks can be used for running specific tags @Before("@smoke")
    Note :
     */
    @Before
    public void setUpScenarios(){
        System.out.println("Before Hooks>>>>>>>>>");
    }
    @After
    public void tearDown(Scenario scenario){
        System.out.println("After Hooks>>>>>>>>>>");


    }
}
