package org.example.datatableSD;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class DatatableSD {

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

    @When("^User enters user \"([^\"]*)\" first name$")
    public void userEntersUserFirstName(String firstname) throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div//form[@id='reg']//div//input[@name='firstname']")).sendKeys(firstname);
        Thread.sleep(1000);

    }

    @Then("^User checks user \"([^\"]*)\" first name is present$")
    public void userChecksUserFirstNameIsPresent(String firstname) throws Throwable {
        String userNameActual =driver.findElement(By.xpath("//div//form[@id='reg']//div//input[@name='firstname']")).getAttribute("value");
        Assert.assertEquals(firstname,userNameActual);
        Thread.sleep(1000);
    }

    @And("^User enters user \"([^\"]*)\" surname$")
    public void userEntersUserSurname(String surname) throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div//form[@id='reg']//div//input[@name='lastname']")).sendKeys(surname);
    }

    @But("^User Mobile field should be blank$")
    public void userMobileFieldShouldBeBlank() throws Throwable {
        String mobileActual =driver.findElement(By.xpath("//div//form[@id='reg']//div//input[@name='reg_email__']")).getAttribute("value");

        Assert.assertEquals("",mobileActual);
        Thread.sleep(1000);
    }

    @Then("^close browser$")
    public void closeBrowser() {
        driver.quit();
        driver =null;
    }

    @When("^Enter following data$")
    public void enterFollowingData(DataTable table) throws Throwable{
        List<List<String>> data = table.raw();

        String values1 = data.get(0).get(0);
        String values2 = data.get(0).get(1);
        String values3 = data.get(0).get(2);

        String firstname = data.get(1).get(0);
        String surname = data.get(1).get(1);
        String mobileno = data.get(1).get(2);

        driver.findElement(By.xpath("//div//form[@id='reg']//div//input[@name='firstname']")).sendKeys(firstname);
        driver.findElement(By.xpath("//div//form[@id='reg']//div//input[@name='lastname']")).sendKeys(surname);
        driver.findElement(By.xpath("//div//form[@id='reg']//div//input[@name='reg_email__']")).sendKeys(mobileno);
        Thread.sleep(2000);
    }
}
