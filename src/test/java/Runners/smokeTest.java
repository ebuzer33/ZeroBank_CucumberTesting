package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
        (
                tags = {"@SmokeTest"},
                features ={"src/test/java/FeatureFiles"},
                glue = {"StepDefinitions"}
        )
public class smokeTest extends AbstractTestNGCucumberTests {
}
