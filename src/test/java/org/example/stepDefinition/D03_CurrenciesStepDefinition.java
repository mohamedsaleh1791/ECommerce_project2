package org.example.stepDefinition;

import org.example.Pages.P02_Login;
import org.example.Pages.P06_Currencies;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class D03_CurrenciesStepDefinition {

    P02_Login loginPage;
    P06_Currencies switchCurrciesPage;

    @Given("user login with valid username and password")
    public void user_login_with_valid_username_and_password() throws InterruptedException {

        loginPage=new P02_Login();
        loginPage.signinBTN(Hooks.driver).click();
        loginPage.emailField(Hooks.driver).sendKeys("victoria_victoria@nopCommerce.com");
        loginPage.passwordField(Hooks.driver).sendKeys("123456");
        loginPage.loginBTN(Hooks.driver).click();
        Thread.sleep(300);//using long time due to low performance of website
    }
    @When("user switch between currencies")
    public void user_switch_between_currencies(){
        switchCurrciesPage=new P06_Currencies();
        Select selector=new Select(switchCurrciesPage.currencySelector(Hooks.driver));
        selector.selectByIndex(1);
    }
    @Then("currency of product changed")
    public void currency_of_product_changed() throws InterruptedException {
        Thread.sleep(300);
        for (int i=0;i<switchCurrciesPage.currencyChanged(Hooks.driver).size();i++){
            System.out.println(switchCurrciesPage.currencyChanged(Hooks.driver).get(i).getText());
            Assert.assertTrue(switchCurrciesPage.currencyChanged(Hooks.driver).get(i).getText().contains("€"));
        }


    }


}
