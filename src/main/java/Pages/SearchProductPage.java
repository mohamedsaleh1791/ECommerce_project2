package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchProductPage {
    public WebElement searchProductField(WebDriver driver){
        By serachProductLoc= By.id("small-searchterms");
        WebElement searchProductElement= driver.findElement(serachProductLoc);
        return searchProductElement;
    }
    public WebElement searchProductBTN(WebDriver driver){
        By serachProductLoc= By.className("search-box-button");
        WebElement searchProductElement= driver.findElement(serachProductLoc);
        return searchProductElement;
    }
    public WebElement searchResultField(WebDriver driver){
        By searchResultLoc= By.className("product-title");
        WebElement searchResultElement= driver.findElement(searchResultLoc);
        return searchResultElement;
    }
}
