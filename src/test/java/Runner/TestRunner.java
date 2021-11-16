package Runner;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(
            monochrome = true,
            //dryRun = false,
            features = {"src/test/java/org/example/Features"},

            glue = {"org.example.Steps"},

            plugin = {"pretty","html:target/cucumber-htmlreport",
                    "json:target/cucumber-report1.json",
                    "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"})

public class TestRunner extends AbstractTestNGCucumberTests {
}
