package org.example.sharedataSD;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedClass { // driver provided to both Step definition

    WebDriver driver =null;

    @Before
    public WebDriver setup(){

        if(driver==null){
            System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32_95\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        return driver;
    }

    @After
    public void tearDown(){
        driver.quit();
        driver =null;
    }

}
