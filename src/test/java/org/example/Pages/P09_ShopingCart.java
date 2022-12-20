package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P09_ShopingCart {
    public WebElement addToShopingCartFiled(WebDriver driver){
        WebElement addToShopingCart= driver.findElement(By.xpath("//div[@data-productid=\"18\"]//button[@class=\"button-2 product-box-add-to-cart-button\"]"));
        return addToShopingCart;
    }
    public WebElement checkAddToShopingCart(WebDriver driver){
        WebElement addToShopingCart= driver.findElement(By.className("content"));
        return addToShopingCart;
    }
    public WebElement addtoShoppingCartBTN(WebDriver driver){
        WebElement addtoShoppingCartBTNLoc= driver.findElement(By.xpath("//p[@class=\"content\"]/a"));
        return addtoShoppingCartBTNLoc;
    }
    public WebElement checkaddToShopingCartFiled2(WebDriver driver){
        WebElement addToShopingCart2= driver.findElement(By.xpath("//td[@class=\"quantity\"]/input"));
        return addToShopingCart2;
    }
    public WebElement CheckTermsOfService(WebDriver driver){
        WebElement CheckTermsOfServiceLoc= driver.findElement(By.id("termsofservice"));
        return CheckTermsOfServiceLoc;
    }
    public WebElement CheckoutBTN(WebDriver driver){
        WebElement CheckoutBTNLoc= driver.findElement(By.id("checkout"));
        return CheckoutBTNLoc;
    }
}
