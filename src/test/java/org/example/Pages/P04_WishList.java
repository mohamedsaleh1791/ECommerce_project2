package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P04_WishList {
    public WebElement addToWishListFiled(WebDriver driver){
        WebElement addToWishList= driver.findElement(By.xpath("//div[@data-productid=\"18\"]//button[@class=\"button-2 add-to-wishlist-button\"]"));
        return addToWishList;
    }
    public WebElement checkToWishListFiled(WebDriver driver){
        WebElement checkToWishList= driver.findElement(By.className("content"));
        return checkToWishList;
    }
}
