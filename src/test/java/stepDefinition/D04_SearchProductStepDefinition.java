package stepDefinition;

import Pages.P02_Login;
import Pages.P05_SearchProduct;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class D04_SearchProductStepDefinition {

    P02_Login loginPage;
    P05_SearchProduct searchProductPage;

    @Given("user navigate to login page and enter valid username and password")
    public void user_navigate_to_login_page_and_enter_valid_username_and_password() throws InterruptedException {

        loginPage=new P02_Login();
        loginPage.signinBTN(Hooks.driver).click();
        loginPage.emailField(Hooks.driver).sendKeys("victoria_victoria@nopCommerce.com");
        loginPage.passwordField(Hooks.driver).sendKeys("123456");
        loginPage.loginBTN(Hooks.driver).click();

        Thread.sleep(300);//using long time due to low performance of website
    }
    @When("user search for product by {string}")
    public void userSearchForProductBy(String arg0) {
        searchProductPage=new P05_SearchProduct();
        searchProductPage.searchProductField(Hooks.driver).sendKeys(arg0);
    }
    @Then("redirect to search page that contain {string}")
    public void redirectToSearchPageThatContain(String arg0) throws InterruptedException {
        Thread.sleep(500);
        for(int i=0;i<searchProductPage.searchResultField(Hooks.driver).size();i++) {
            String actualResult = searchProductPage.searchResultField(Hooks.driver).get(i).getText();
            System.out.println(actualResult);

            Thread.sleep(300);
            Assert.assertTrue(actualResult.toLowerCase().contains(arg0));
            if(searchProductPage.searchResultField(Hooks.driver).size()>6 && i==6){
                searchProductPage.nextPageBTN(Hooks.driver).click();
            }
        }
    }



    @And("click search button")
    public void click_search_button() throws InterruptedException {
        searchProductPage.searchProductBTN(Hooks.driver).click();
        Thread.sleep(500);//using long time due to low performance of website
    }





}
