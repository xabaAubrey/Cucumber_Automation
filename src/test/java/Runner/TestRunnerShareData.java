package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
            monochrome = true,
            //dryRun = false,
            //tags={"@Important"}, //All scenarios if this is tag for feature file
            //tags={"@Smoke"}, //only Smoke tests
            //tags={"@Smoke","@Regression"}, // And condition
            //tags={"@Smoke,@Regression"}, //OR condition
            features = {"src/test/java/org/example/resources/sharedataFF"},

            glue = {"org.example.sharedataSD"},

            plugin = {"pretty","html:target/cucumber-htmlreport",
                    "json:target/cucumber-report9.json",
                    "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport9.html"})

public class TestRunnerShareData extends AbstractTestNGCucumberTests {
}
