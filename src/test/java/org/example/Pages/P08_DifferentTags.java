package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P08_DifferentTags {
    public WebElement openProduct(WebDriver driver){
        WebElement openProductLoc= driver.findElement(By.xpath("//div[@data-productid=\"18\"]/div[@class=\"picture\"]/a"));
        return openProductLoc;
    }
    public WebElement TagName(WebDriver driver) {
        WebElement TagNameLoc = driver.findElement(By.xpath("//div[@class=\"product-tags-list\"]//li[@class=\"tag\"][1]/a[1]"));
        return TagNameLoc;
    }
    public WebElement checkTagName(WebDriver driver) {
        WebElement checkTagNameLoc = driver.findElement(By.xpath("//div[@class=\"page product-tag-page\"]/div[@class=\"page-title\"]/h1"));
        return checkTagNameLoc;
    }
}
