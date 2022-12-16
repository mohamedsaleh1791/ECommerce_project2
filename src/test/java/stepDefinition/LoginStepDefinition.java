package stepDefinition;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.LoginPage;




public class LoginStepDefinition {

    WebDriver driver = null;
    LoginPage loginPage;

    @Given("user navigate to login page")
    public void user_navigate_to_login_page() throws InterruptedException {
        driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\TestingAutomation\\Testing\\src\\resources\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");
        Thread.sleep(300);
    }
    @When("user enter valid username and valid password")
    public void user_enter_valid_username_and_valid_password() throws InterruptedException {
        loginPage=new LoginPage();
        loginPage.signinBTN(driver).click();
        loginPage.emailField(driver).sendKeys("victoria_victoria@nopCommerce.com");
        loginPage.passwordField(driver).sendKeys("123456");

    }
    @And("user click login button")
    public void user_click_login_button() throws InterruptedException {
        loginPage.loginBTN(driver).click();
        Thread.sleep(20000);//using long time due to low performance of website
    }
    @Then("user can login successfully and go homepage")
    public void user_can_login_successfully_and_go_homepage(){
        Assert.assertTrue(loginPage.logoutLink(driver).getText().contains("Log out"));
    }


    @After("@closeLogin")
    public void closeDriver(){
        driver.quit();
    }
}
