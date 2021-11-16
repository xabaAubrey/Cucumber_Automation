package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
            monochrome = true,
            //dryRun = false,
            features = {"src/test/java/org/example/resources/parameterizationFF"},

            glue = {"org.example.parameterizationSD"},

            plugin = {"pretty","html:target/cucumber-htmlreport",
                    "json:target/cucumber-report8.json",
                    "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html"})

public class TestRunnerParameterization extends AbstractTestNGCucumberTests {
}
