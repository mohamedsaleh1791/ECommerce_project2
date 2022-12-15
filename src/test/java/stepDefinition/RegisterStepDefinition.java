package stepDefinition;

import Pages.LoginPage;
import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegisterStepDefinition {
    WebDriver driver = null;
    LoginPage loginPage=null;
    RegisterPage registerPage=null;


    @Given("user navigate to signup page")
    public void user_navigate_to_signup_page() throws InterruptedException {
        driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\TestingAutomation\\Testing\\src\\resources\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(300);
        loginPage=new LoginPage();
        registerPage=new RegisterPage();
        loginPage.signinBTN(driver).click();
        Thread.sleep(500);
        registerPage.registerBTN(driver).click();
        Thread.sleep(500);
    }

    @When("user enter valid data")
    public void user_enter_valid_data() throws InterruptedException {

        registerPage.genderIP(driver).click();
        registerPage.firstNameIP(driver).sendKeys("test");
        registerPage.lastNameIP(driver).sendKeys("test");
        registerPage.emailIP(driver).sendKeys("test10@test.com");
        registerPage.passwordIP(driver).sendKeys("123456");
        registerPage.confirmPasswordIP(driver).sendKeys("123456");

    }
    @And("user click create account button")
    public void user_click_create_account_button() throws InterruptedException {
        registerPage.createAccount(driver).click();
        Thread.sleep(500);//using long time due to low performance of website
    }

    @Then("user can create account successfully and go to homepage")
    public void user_can_create_account_successfully_and_go_to_homepage(){
        String registerDoneText="Your registration completed";
        Assert.assertTrue(registerPage.registationDone(driver).getText().contains(registerDoneText));
    }
    public void closeDriver(){
        driver.quit();
    }
}
