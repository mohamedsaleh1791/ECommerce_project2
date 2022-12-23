package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P07_FilterColors {
    public WebElement searchFileld(WebDriver driver){
        WebElement searchLoc=driver.findElement(By.id("small-searchterms"));
        return searchLoc;
    }
    public WebElement chooseProductFiled(WebDriver driver){
        WebElement chooseProductLoc=driver.findElement(By.xpath("//div[@data-productid=\"25\"]/div[@class=\"picture\"]/a[1]"));
        return chooseProductLoc;
    }
    public WebElement selectColorFiled(WebDriver driver){
        WebElement selectColorLoc=driver.findElement(By.xpath("//span[@title=\"Blue\"]"));
        return selectColorLoc;
    }
    public WebElement checkSelectColorFiled(WebDriver driver){
        WebElement checkSelectColordLoc=driver.findElement(By.xpath("//li[@data-attr-value=\"26\"]"));
        return checkSelectColordLoc;
    }
}
