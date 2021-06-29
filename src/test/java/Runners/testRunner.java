package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
        (
                features = {"src/test/java/FeatureFiles"},
                glue = {"StepDefinitions"},

                plugin = {
                        "html:target/cucumber-report",
                        "json:target/cucumber.json",
                }
        )
public class testRunner extends AbstractTestNGCucumberTests {
}
