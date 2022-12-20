package org.example.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static  WebDriver driver=null;
    @Before
    public void openBrowser(){
        driver=new ChromeDriver();
        String chromePath=System.getProperty("user.dir")+"/src/resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com");
    }
    @After
    public void quitDriver(){
        driver.quit();
    }
}
