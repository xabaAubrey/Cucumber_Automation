package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
            monochrome = true,
            //dryRun = false,
            features = {"src/test/java/org/example/resources/datatableFF"},

            glue = {"org.example.datatableSD"},

            plugin = {"pretty","html:target/cucumber-htmlreport",
                    "json:target/cucumber-report4.json",
                    "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html"})

public class TestRunnerDatatable extends AbstractTestNGCucumberTests {
}
