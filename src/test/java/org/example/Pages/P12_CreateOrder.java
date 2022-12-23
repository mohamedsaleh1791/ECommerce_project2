package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P12_CreateOrder {
    public WebElement addressStepBTN(WebDriver driver){
        WebElement addressStepBTNLoc= driver.findElement(By.cssSelector("button[class=\"button-1 new-address-next-step-button\"]"));
        return addressStepBTNLoc;
    }
    public WebElement shippingMethodBTN(WebDriver driver){
        WebElement shippingMethodBTNLoc= driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]"));
        return shippingMethodBTNLoc;
    }
    public WebElement paymentMethodBTN(WebDriver driver){
        WebElement paymentMethodBTNLoc= driver.findElement(By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]"));
        return paymentMethodBTNLoc;
    }
    public WebElement paymentInfoBTN(WebDriver driver){
        WebElement paymentInfoBTNLoc= driver.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]"));
        return paymentInfoBTNLoc;
    }
    public By confirmOrderBTN(WebDriver driver){
        By ConfirmOrderBTNLoc=By.cssSelector("div[id=\"confirm-order-buttons-container\"] button");
        return ConfirmOrderBTNLoc;
    }
    public WebElement checkConfirmOrder(WebDriver driver){
        WebElement checkConfirmOrderLoc= driver.findElement(By.cssSelector("div[class=\"section order-completed\"] div[class=\"title\"] strong"));
        return checkConfirmOrderLoc;
    }
}
