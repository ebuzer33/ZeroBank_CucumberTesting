package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions
        (
                tags = {"@RegressionTest"},
                features = {"src/test/java/FeatureFiles"},
                glue = {"StepDefinitions"}
        )
public class regressionTest extends AbstractTestNGCucumberTests {
}
