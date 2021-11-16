package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
            monochrome = true,
            //dryRun = false,
            features = {"src/test/java/org/example/resources/backgroundFF"},

            glue = {"org.example.backgroundSD"},

            plugin = {"pretty","html:target/cucumber-htmlreport",
                    "json:target/cucumber-report2.json",
                    "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport2.html"})

public class TestRunnerBackground extends AbstractTestNGCucumberTests {
}