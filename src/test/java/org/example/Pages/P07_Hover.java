package org.example.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P07_Hover {
   public List<WebElement> categories(WebDriver driver){
       List<WebElement> categoriesLoc=driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[position() >= 1 and not(position() > 3)]"));
       return categoriesLoc;
   }
    public List<WebElement> subCategories(WebDriver driver,int category){
       category+=1;
        List<WebElement> subCategoriesLoc=driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+category+"]/ul/li[1]"));
        return subCategoriesLoc;
    }
    public WebElement pageTitle(WebDriver driver){
       WebElement pageTitleLoc= driver.findElement(By.className("page-title"));
       return  pageTitleLoc;
    }
}
