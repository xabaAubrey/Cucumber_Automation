package org.example.multiplescenarioSD;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MultipleScenarioSD {

    WebDriver driver;
    @Given("^User needs to be on Facebook login page$")
    public void userNeedsToBeOnFacebookLoginPage() throws Throwable{

        System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32_95\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();


    }

    @And("^User clicks on button Create New Account$")
    public void userClicksOnButtonCreateNewAccount() throws Throwable {
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(1000);
    }

    @When("^User enters user first name$")
    public void userEntersUserFirstName() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div//form[@id='reg']//div//input[@name='firstname']")).sendKeys("Donald");
        Thread.sleep(1000);

    }

    @Then("^User checks user first name is present$")
    public void userChecksUserFirstNameIsPresent() throws Throwable{

        String userNameActual =driver.findElement(By.xpath("//div//form[@id='reg']//div//input[@name='firstname']")).getAttribute("value");

        Assert.assertEquals("Donald",userNameActual);
        Thread.sleep(1000);
        //driver.quit();

    }

    @And("^User enters user surname$")
    public void userEntersUserSurname() throws Throwable{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div//form[@id='reg']//div//input[@name='lastname']")).sendKeys("Xaba");
    }

    @Then("^User Mobile field should be blank$")
    public void userMobileFieldShouldBeBlank() throws Throwable {
        String mobileActual =driver.findElement(By.xpath("//div//form[@id='reg']//div//input[@name='reg_email__']")).getAttribute("value");

        Assert.assertEquals("",mobileActual);
        Thread.sleep(1000);
        //driver.quit();
    }

    @Then("^close browser$")
    public void closeBrowser() {
        driver.quit();
        driver =null;
    }
}
