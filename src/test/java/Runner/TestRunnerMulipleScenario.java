package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
            monochrome = true,
            //dryRun = false,
            features = {"src/test/java/org/example/resources/multiplescenarioFF"},

            glue = {"org.example.multiplescenarioSD"},

            plugin = {"pretty","html:target/cucumber-htmlreport",
                    "json:target/cucumber-report6.json",
                    "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html"})

public class TestRunnerMulipleScenario extends AbstractTestNGCucumberTests {
}
