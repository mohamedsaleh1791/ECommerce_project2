package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    public WebElement registerBTN(WebDriver driver){
        By registerLOC= By.className("register-button");
        WebElement registerElement= driver.findElement(registerLOC);
        return registerElement;
    }
    public WebElement genderIP(WebDriver driver){
        By genderLOC= By.id("gender-male");
        WebElement genderElement= driver.findElement(genderLOC);
        return genderElement;
    }

    public WebElement firstNameIP(WebDriver driver){
        By firstNameLOC= By.id("FirstName");
        WebElement firstNameElement= driver.findElement(firstNameLOC);
        return firstNameElement;
    }
    public WebElement lastNameIP(WebDriver driver){
        By lastNameLOC= By.id("LastName");
        WebElement lastNameElement= driver.findElement(lastNameLOC);
        return lastNameElement;
    }
//    DOB
    public WebElement emailIP(WebDriver driver){
        By emailLOC= By.id("Email");
        WebElement emailElement= driver.findElement(emailLOC);
        return emailElement;
    }
    public WebElement passwordIP(WebDriver driver){
        By passwordLOC= By.id("Password");
        WebElement passwordElement= driver.findElement(passwordLOC);
        return passwordElement;
    }
    public WebElement confirmPasswordIP(WebDriver driver){
        By confirmPasswordLOC= By.id("ConfirmPassword");
        WebElement confirmPasswordElement= driver.findElement(confirmPasswordLOC);
        return confirmPasswordElement;
    }


    public WebElement createAccount(WebDriver driver){
        By createAccountLOC= By.id("register-button");
        WebElement createAccountElement= driver.findElement(createAccountLOC);
        return createAccountElement;
    }
    public WebElement registationDone(WebDriver driver){
        By registationDoneLOC= By.className("result");
        WebElement registationDoneElement= driver.findElement(registationDoneLOC);
        return registationDoneElement;
    }

}
