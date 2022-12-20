package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_SearchProduct {
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
    public List<WebElement> searchResultField(WebDriver driver){
        By searchResultLoc= By.cssSelector("h2[class=\"product-title\"]");
        List<WebElement> searchResultElement= driver.findElements(searchResultLoc);
        return searchResultElement;
    }
    public WebElement nextPageBTN(WebDriver driver){
        By nextPageLoc= By.className("next-page");
        WebElement nextPageLocElement= driver.findElement(nextPageLoc);
        return nextPageLocElement;
    }
}
