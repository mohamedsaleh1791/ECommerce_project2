package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Login;
import org.example.Pages.P10_WishList;
import org.example.Pages.P11_CompareList;
import org.junit.Assert;

public class D11_CompareList {
    P02_Login loginPage;
    P11_CompareList compareList;
    @Given("user navigate to home page URL")
    public void user_navigate_to_home_page_URL() throws InterruptedException {


    }
    @When("press on to compare List Button on any product from Home Page")
    public void press_on_addProduct_Button_on_any_product_from_Home_Page(){
        compareList=new P11_CompareList();
        compareList.addCompareFiled(Hooks.driver).click();
    }
    @Then("product added to Compare List")
    public void product_added_to_compareList() throws InterruptedException {
        Assert.assertTrue(compareList.checkAddCompareFiled(Hooks.driver).getText().contains("The product has been added to your"));


    }
}
