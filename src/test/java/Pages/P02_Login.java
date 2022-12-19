package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class P02_Login {

    public WebElement signinBTN(WebDriver driver){
        By signInLoc= By.className("ico-login");
        WebElement signInElement= driver.findElement(signInLoc);
        return signInElement;
    }
    public WebElement emailField(WebDriver driver){
        By emailLOC= By.id("Email");
        WebElement emailElement= driver.findElement(emailLOC);
        return emailElement;
    }
    public WebElement passwordField(WebDriver driver){
        By passwordLOC= By.id("Password");
        WebElement passwordElement= driver.findElement(passwordLOC);
        return passwordElement;
    }
    public WebElement loginBTN(WebDriver driver){
        By loginLOC= By.className("login-button");
        WebElement loginElement= driver.findElement(loginLOC);
        return loginElement;
    }
    public WebElement logoutLink(WebDriver driver){
        By logoutLOC= By.className("ico-logout");
        WebElement logoutElement= driver.findElement(logoutLOC);
        return logoutElement;
    }
    public WebElement forgetBTN(WebDriver driver){
        By forgetLOC= By.className("forgot-password");
        WebElement forgetElement= driver.findElement(forgetLOC);
        return forgetElement;
    }
}
