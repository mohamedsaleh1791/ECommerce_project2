package org.example.stepDefinition;

import org.example.Pages.P02_Login;
import org.example.Pages.P10_WishList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class D10_addToWishListStepDefinition {

    P02_Login loginPage;
    P10_WishList wishListProductsPage;
    @Given("user login with valid username and valid password")
    public void user_login_with_valid_username_and_valid_password() throws InterruptedException {


    }
    @When("press on wishList Button on any product from Home Page")
            public void press_on_wishList_Button_on_any_product_from_Home_Page(){
                wishListProductsPage=new P10_WishList();
                wishListProductsPage.addToWishListFiled(Hooks.driver).click();
            }
    @Then("product added to whishList")
    public void product_added_to_whishList() throws InterruptedException {
        Assert.assertTrue(wishListProductsPage.checkToWishListFiled(Hooks.driver).getText().contains("The product has been added to your"));
        Thread.sleep(10000);
        wishListProductsPage.wishListBTN(Hooks.driver).click();
        Thread.sleep(300);
        int quantityValue=Integer.parseInt(wishListProductsPage.checkToWishListFiled2(Hooks.driver).getAttribute("value"));
        Assert.assertTrue(quantityValue>0);

    }

}
