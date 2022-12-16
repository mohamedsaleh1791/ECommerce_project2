package stepDefinition;

import Pages.LoginPage;
import Pages.SearchProductPage;
import Pages.SwitchCurrciesPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchCurrenciesStepDefinition {
    WebDriver driver = null;
    LoginPage loginPage;
    SwitchCurrciesPage switchCurrciesPage;

    @Given("user login with valid username and password")
    public void user_login_with_valid_username_and_password() throws InterruptedException {
        driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\TestingAutomation\\Testing\\src\\resources\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");
        Thread.sleep(300);
        loginPage=new LoginPage();
        loginPage.signinBTN(driver).click();
        loginPage.emailField(driver).sendKeys("victoria_victoria@nopCommerce.com");
        loginPage.passwordField(driver).sendKeys("123456");
        loginPage.loginBTN(driver).click();
        Thread.sleep(300);//using long time due to low performance of website
    }
    @When("user switch between currencies")
    public void user_switch_between_currencies(){
        switchCurrciesPage=new SwitchCurrciesPage();
        Select selector=new Select(switchCurrciesPage.currencySelector(driver));
        selector.selectByIndex(1);
    }
    @Then("currency of product changed")
    public void currency_of_product_changed() throws InterruptedException {
        Thread.sleep(300);
        Assert.assertTrue(switchCurrciesPage.currencyChanged(driver).getText().contains("€"));

    }
    @After("@closeswitchCurrency")
    public void closeDriver(){
        driver.quit();
    }

}
