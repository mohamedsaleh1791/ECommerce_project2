package stepDefinition;

import Pages.LoginPage;
import Pages.WishListProductsPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addToWishListStepDefinition {
    WebDriver driver = null;
    LoginPage loginPage;
    WishListProductsPage wishListProductsPage;
    @Given("user login with valid username and valid password")
    public void user_login_with_valid_username_and_valid_password() throws InterruptedException {
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
    @When("press on wishList Button on any product from Home Page")
            public void press_on_wishList_Button_on_any_product_from_Home_Page(){
                wishListProductsPage=new WishListProductsPage();
                wishListProductsPage.addToWishListFiled(driver).click();
            }
    @Then("product added to whishList")
    public void product_added_to_whishList(){
        Assert.assertTrue(wishListProductsPage.checkToWishListFiled(driver).getText().contains("The product has been added to your"));

    }
    @After("@closeWhishList")
    public void closeDriver(){
        driver.quit();
    }
}
