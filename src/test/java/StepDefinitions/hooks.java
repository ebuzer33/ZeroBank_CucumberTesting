package StepDefinitions;

import Utilities.baseDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {

    @Before
    public void before()
    {

    }

    @After
    public void after()
    {
        if (baseDriver.getDriver()!=null)
        {
            baseDriver.DriverQuit();
        }
    }

}
