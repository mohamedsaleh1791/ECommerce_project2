package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SwitchCurrciesPage {
    public WebElement currencySelector(WebDriver driver){
        WebElement currencyElement= driver.findElement(By.id("customerCurrency"));
        return currencyElement;
    }
    public List<WebElement> currencyChanged(WebDriver driver){
        List<WebElement> currencyElements= driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return currencyElements;
    }
}
