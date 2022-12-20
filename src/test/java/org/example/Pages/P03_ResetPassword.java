package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P03_ResetPassword {
    public WebElement recoveEmailField(WebDriver driver){
        By recoveEmailLoc= By.id("Email");
        WebElement recoverEmailElement= driver.findElement(recoveEmailLoc);
        return recoverEmailElement;
    }
    public WebElement recoveEmailBTN(WebDriver driver){
        By recoveEmailLoc= By.className("password-recovery-button");
        WebElement recoverEmailElement= driver.findElement(recoveEmailLoc);
        return recoverEmailElement;
    }
    public WebElement recoveEmailDoneFiled(WebDriver driver){
        By recoveEmailLoc= By.className("content");
        WebElement recoverEmailElement= driver.findElement(recoveEmailLoc);
        return recoverEmailElement;
    }
}
