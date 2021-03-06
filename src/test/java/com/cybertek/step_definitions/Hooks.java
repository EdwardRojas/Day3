package com.cybertek.step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before(order = 2)
    public void setUpScenario(){
        System.out.println("------> Before annotation: Setting up browser");
    }

    @Before(value = "@db",order = 1)
    public void setUpDataBaseConnection(){
        System.out.println("------> BEFORE ANNOTATION: DB CONNECTION CREATED <------");

    }

    @After
    public void tearDownScenario(){
        System.out.println("------> After annotation: Closing browser");
    }

    @After("@db")
    public void tearDownDatabaseConnection(){
        System.out.println("------> AFTER ANNOTATION: DB CONNECTION CLOSED <------");

    }
    @BeforeStep
    public void setUpStep(){
        System.out.println("==========> BEFORESTEP: TAKING SCREENSHOT <==========");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("==========> AFTERSTEP: TAKING SCREENSHOT <==========");

    }
}
