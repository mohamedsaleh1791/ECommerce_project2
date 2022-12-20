package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_Currencies {
    public WebElement currencySelector(WebDriver driver){
        WebElement currencyElement= driver.findElement(By.id("customerCurrency"));
        return currencyElement;
    }
    public List<WebElement> currencyChanged(WebDriver driver){
        List<WebElement> currencyElements= driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return currencyElements;
    }
}
