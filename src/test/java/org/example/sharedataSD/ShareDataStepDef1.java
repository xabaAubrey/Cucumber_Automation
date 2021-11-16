package org.example.sharedataSD;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ShareDataStepDef1 {

    WebDriver driver;

    public ShareDataStepDef1(SharedClass share){
        driver =share.setup();
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

    @Then("^User Mobile field should be blank$")
    public void userMobileFieldShouldBeBlank() throws Throwable {
        String mobileActual =driver.findElement(By.xpath("//div//form[@id='reg']//div//input[@name='reg_email__']")).getAttribute("value");

        Assert.assertEquals("",mobileActual);
        Thread.sleep(1000);
    }
}
