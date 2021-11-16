package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
            monochrome = true,
            //dryRun = true,
            //tags={"@Important"}, //All scenarios if this is tag for feature file
            //tags={"@Smoke"}, //only Smoke tests
            //tags={"@Smoke","@Regression"}, // And condition
            //tags={"@Smoke,@Regression"}, //OR condition
            features = {"src/test/java/org/example/resources/multiFF"},

            glue = {"org.example.multiSD"},

            plugin = {"pretty","html:target/cucumber-htmlreport",
                    "json:target/cucumber-report7.json",
                    "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html"})

public class TestRunnerMulti extends AbstractTestNGCucumberTests {
}
