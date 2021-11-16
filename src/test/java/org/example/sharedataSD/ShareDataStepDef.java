package org.example.sharedataSD;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ShareDataStepDef {

    WebDriver driver;

    public ShareDataStepDef(SharedClass share){
        driver = share.setup();
    }

    @Given("^User needs to be on Facebook login page$")
    public void userNeedsToBeOnFacebookLoginPage() throws Throwable{

        driver.get("https://www.facebook.com/");
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
        //Thread.sleep(1000);

    }
}
