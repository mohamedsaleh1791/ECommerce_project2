package stepDefinition;

import Pages.LoginPage;
import Pages.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


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
        Select selectDay=new Select(registerPage.dayIP(driver));
        Select selectMonth=new Select(registerPage.monthIP(driver));
        Select selectYear=new Select(registerPage.yearIP(driver));
        registerPage.genderIP(driver).click();
        registerPage.firstNameIP(driver).sendKeys("test");
        registerPage.lastNameIP(driver).sendKeys("test");
        selectDay.selectByValue("1");
        selectMonth.selectByValue("2");
        selectYear.selectByValue("1991");
        Thread.sleep(300);
        registerPage.emailIP(driver).sendKeys("test15@test.com");
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
    @After("@closeRegister")
    public void closeDriver(){
        driver.quit();
    }
}
