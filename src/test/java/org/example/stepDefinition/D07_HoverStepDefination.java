package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P07_Hover;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class D07_HoverStepDefination {
    P07_Hover hoverPage=new P07_Hover();
    int categoryNumber=new Random().nextInt(3);
    String actualResult;
    @Given("user open home page")
    public void user_open_home_page(){

    }

    @When("user hover on category and user click on sub category")
    public void userHoverOnCategory() throws InterruptedException {


        Actions action =new Actions(Hooks.driver);
        action.moveToElement(hoverPage.categories(Hooks.driver).get(categoryNumber)).perform();
        Thread.sleep(300);
        actualResult=hoverPage.subCategories(Hooks.driver,categoryNumber).get(0).getText();
        hoverPage.subCategories(Hooks.driver,categoryNumber).get(0).click();
        Thread.sleep(300);


    }


    @Then("user redirect to the page of selected sub-category")
    public void userRedirectToThePageOfSelectedSubCategory() {

        System.out.println("a:"+actualResult);
        String expectedResult=hoverPage.pageTitle(Hooks.driver).getText();
        System.out.println("E :"+expectedResult);
        Assert.assertTrue(expectedResult.equals(actualResult));
    }
}
