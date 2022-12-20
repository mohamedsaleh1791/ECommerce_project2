package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Login;
import org.example.Pages.P09_ShopingCart;
import org.example.Pages.P10_WishList;
import org.junit.Assert;

public class D09_ShopingCart {
    P02_Login loginPage;
    P09_ShopingCart shoppingCartPage;
    @Given("user login with valid username and valid password to add to Shopping Cart")
    public void user_login_with_valid_username_and_valid_password() throws InterruptedException {
        loginPage=new P02_Login();
        loginPage.signinBTN(Hooks.driver).click();
        loginPage.emailField(Hooks.driver).sendKeys("victoria_victoria@nopCommerce.com");
        loginPage.passwordField(Hooks.driver).sendKeys("123456");
        loginPage.loginBTN(Hooks.driver).click();
        Thread.sleep(300);

    }
    @When("press on add to cart Button on any product from Home Page")
    public void press_on_addToShoppingCart_Button_on_any_product_from_Home_Page(){
        shoppingCartPage=new P09_ShopingCart();
        shoppingCartPage.addToShopingCartFiled(Hooks.driver).click();
    }
    @Then("product added to shopping cart")
    public void product_added_to_shoppingCart() throws InterruptedException {
        Assert.assertTrue(shoppingCartPage.checkAddToShopingCart(Hooks.driver).getText().contains("The product has been added to your"));

        shoppingCartPage.addtoShoppingCartBTN(Hooks.driver).click();
        Thread.sleep(300);
        int quantityValue=Integer.parseInt(shoppingCartPage.checkaddToShopingCartFiled2(Hooks.driver).getAttribute("value"));
        Assert.assertTrue(quantityValue>0);

    }
}
