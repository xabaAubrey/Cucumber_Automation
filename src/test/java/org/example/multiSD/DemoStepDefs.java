package org.example.multiSD;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoStepDefs {

    WebDriver driver;

    @Given("^User needs to be on Demo Site Page$")
    public void userNeedsToBeOnDemoSitePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32_95\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");
    }

    @When("^User enters first name$")
    public void userEntersFirstName() throws Throwable{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Dawn");
        //Thread.sleep(1000);
    }

    @And("^User enters last name$")
    public void userEntersLastName() throws Throwable{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Soap");
        //Thread.sleep(1000);
    }
}
