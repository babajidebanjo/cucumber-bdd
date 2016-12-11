package com.bb;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    @Before
    public void setUp(Scenario scenario){
        System.out.println(String.format("Executing scenario [%s].", scenario.getName()));
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println(String.format("Scenario outcome [%s].", scenario.getStatus()));
    }
}
