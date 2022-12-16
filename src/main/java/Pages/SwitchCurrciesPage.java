package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SwitchCurrciesPage {
    public WebElement currencySelector(WebDriver driver){
        WebElement currencyElement= driver.findElement(By.id("customerCurrency"));
        return currencyElement;
    }
    public WebElement currencyChanged(WebDriver driver){
        WebElement currencyElement= driver.findElement(By.className("actual-price"));
        return currencyElement;
    }
}
