package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
            monochrome = true,
            //dryRun = false,
            features = {"src/test/java/org/example/resources/datadrivenFF"},

            glue = {"org.example.datadrivenSD"},

            plugin = {"pretty","html:target/cucumber-htmlreport",
                    "json:target/cucumber-report3.json",
                    "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"})

public class TestRunnerdatadriven extends AbstractTestNGCucumberTests {
}
