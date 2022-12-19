package stepDefinition;

import Pages.LoginPage;
import Pages.SearchProductPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProductStepDefinition {
    WebDriver driver = null;
    LoginPage loginPage;
    SearchProductPage searchProductPage;

    @Given("user navigate to login page and enter valid username and password")
    public void user_navigate_to_login_page_and_enter_valid_username_and_password() throws InterruptedException {
        driver=new ChromeDriver();
        String chromePath=System.getProperty("user.dir")+"/src/resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
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
    @When("user search for product by {string}")
    public void userSearchForProductBy(String arg0) {
        searchProductPage=new SearchProductPage();
        searchProductPage.searchProductField(driver).sendKeys(arg0);
    }
    @Then("redirect to search page that contain {string}")
    public void redirectToSearchPageThatContain(String arg0) throws InterruptedException {
        Thread.sleep(500);
        String actualResult=searchProductPage.searchResultField(driver).getText();
        Assert.assertTrue(actualResult.toLowerCase().contains(arg0));
    }



    @And("click search button")
    public void click_search_button() throws InterruptedException {
        searchProductPage.searchProductBTN(driver).click();
        Thread.sleep(500);//using long time due to low performance of website
    }

    @After("@QuitSearchProduct")
    public void closeDriver(){
        driver.quit();
    }



}
