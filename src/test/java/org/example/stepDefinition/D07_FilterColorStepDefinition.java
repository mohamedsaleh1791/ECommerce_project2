package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Login;
import org.example.Pages.P07_FilterColors;
import org.example.Pages.P09_ShopingCart;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class D07_FilterColorStepDefinition {
    P02_Login loginPage;
    P07_FilterColors filterColors;
    @Given("user login with valid username and valid password Filter Color")
    public void user_login_with_valid_username_and_valid_password() throws InterruptedException {
        loginPage=new P02_Login();
        loginPage.signinBTN(Hooks.driver).click();
        loginPage.emailField(Hooks.driver).sendKeys("victoria_victoria@nopCommerce.com");
        loginPage.passwordField(Hooks.driver).sendKeys("123456");
        loginPage.loginBTN(Hooks.driver).click();
        Thread.sleep(300);
        


    }

    @When("Type {string} in search Box choose second product")
    public void typeInSearchBoxChooseSecondProduct(String arg0) {
        filterColors=new P07_FilterColors();
        filterColors.searchFileld(Hooks.driver).sendKeys(arg0);
        filterColors.searchFileld(Hooks.driver).sendKeys(Keys.ENTER);
        
    }

    @And("open product page adn choose any color")
    public void openProductPageAdnChooseAnyColor() throws InterruptedException {
        filterColors.chooseProductFiled(Hooks.driver).click();
        Thread.sleep(300);
        filterColors.selectColorFiled(Hooks.driver).click();
        Thread.sleep(300);
        
    }

    @Then("image of selected color is appear")
    public void imageOfSelectedColorIsAppear() {
       String classValue= filterColors.checkSelectColorFiled(Hooks.driver).getAttribute("class");
        System.out.println(classValue);
        Assert.assertTrue(classValue.contains("selected-value"));
    }
}
