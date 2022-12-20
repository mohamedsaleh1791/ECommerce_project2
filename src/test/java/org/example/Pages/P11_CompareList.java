package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P11_CompareList {
    public WebElement addCompareFiled(WebDriver driver){
        WebElement addCompareLoc= driver.findElement(By.xpath("//div[@data-productid=\"18\"]//button[@class=\"button-2 add-to-compare-list-button\"]"));
        return addCompareLoc;
    }
    public WebElement checkAddCompareFiled(WebDriver driver){
        WebElement checkaddCompare= driver.findElement(By.className("content"));
        return checkaddCompare;
    }

}
