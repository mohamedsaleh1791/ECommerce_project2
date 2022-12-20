package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Login;
import org.example.Pages.P08_DifferentTags;
import org.example.Pages.P09_ShopingCart;
import org.junit.Assert;

public class D08_DifferentTags {
    P02_Login loginPage;
    P08_DifferentTags differentTagsPage;
    String tagName;
    @Given("user login with valid username and valid password choose different tags")
    public void user_login_with_valid_username_and_valid_password() throws InterruptedException {
        loginPage=new P02_Login();
        loginPage.signinBTN(Hooks.driver).click();
        loginPage.emailField(Hooks.driver).sendKeys("victoria_victoria@nopCommerce.com");
        loginPage.passwordField(Hooks.driver).sendKeys("123456");
        loginPage.loginBTN(Hooks.driver).click();
        Thread.sleep(300);

    }
    @When("press on any product from Home Page")
    public void press_on_any_product_from_Home_Page(){
        differentTagsPage=new P08_DifferentTags();
        differentTagsPage.openProduct(Hooks.driver).click();
    }
    @And("choose any tag")
    public void choose_any_tag(){
         tagName=differentTagsPage.TagName(Hooks.driver).getText();
        differentTagsPage.TagName(Hooks.driver).click();
    }
    @Then("rdirect to page of products that have same choosen tag")
    public void rdirect_to_page_of_products_that_have_same_choosen_tag(){
        Assert.assertTrue(differentTagsPage.checkTagName(Hooks.driver).getText().contains(tagName));

    }
}
