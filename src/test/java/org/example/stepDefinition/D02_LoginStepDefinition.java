package org.example.stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Login;
import org.junit.Assert;


public class D02_LoginStepDefinition {



    P02_Login loginPage;


    @Given("user navigate to login page")
    public void user_navigate_to_login_page() throws InterruptedException {

    }
    @When("user enter valid {string} and valid {string}")
    public void userEnterValidAndValid(String arg0, String arg1) {
        loginPage=new P02_Login();
        loginPage.signinBTN(Hooks.driver).click();
        loginPage.emailField(Hooks.driver).sendKeys(arg0);
        loginPage.passwordField(Hooks.driver).sendKeys(arg1);
    }

    @And("user click login button")
    public void user_click_login_button() throws InterruptedException {
        loginPage.loginBTN(Hooks.driver).click();
        Thread.sleep(300);//using long time due to low performance of website
    }
    @Then("user can login successfully and go homepage")
    public void user_can_login_successfully_and_go_homepage(){
        Assert.assertTrue(loginPage.logoutLink(Hooks.driver).getText().contains("Log out"));
    }







}
