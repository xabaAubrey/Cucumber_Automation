package org.example.multiSD;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleStepDef {
    WebDriver driver;

    @Given("^User needs to be on Google page$")
    public void userNeedsToBeOnGooglePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32_95\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @When("^User enters search string$")
    public void userEntersSearchString() throws Throwable{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Appium");
        //Thread.sleep(1000);
    }

//    @Then("^User click Search button$")
//    public void clickSearchButton() throws Throwable {
//
//        driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")).click();
//
//    }
}
