package stepDefinition;

import Pages.P02_Login;
import Pages.P01_Register;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class D01_RegisterStepDefinition {
    WebDriver driver = null;
    P02_Login loginPage=null;
    P01_Register p01Register =null;


    @Given("user navigate to signup page")
    public void user_navigate_to_signup_page() throws InterruptedException {
        driver=new ChromeDriver();
        String chromePath=System.getProperty("user.dir")+"/src/resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(300);
        loginPage=new P02_Login();
        p01Register =new P01_Register();
        loginPage.signinBTN(driver).click();
        Thread.sleep(500);
        p01Register.registerBTN(driver).click();
        Thread.sleep(500);
    }

    @When("user enter valid data")
    public void user_enter_valid_data() throws InterruptedException {
        Select selectDay=new Select(p01Register.dayIP(driver));
        Select selectMonth=new Select(p01Register.monthIP(driver));
        Select selectYear=new Select(p01Register.yearIP(driver));
        p01Register.genderIP(driver).click();
        p01Register.firstNameIP(driver).sendKeys("test");
        p01Register.lastNameIP(driver).sendKeys("test");
        selectDay.selectByValue("1");
        selectMonth.selectByValue("2");
        selectYear.selectByValue("1991");
        Thread.sleep(300);
        p01Register.emailIP(driver).sendKeys("test20@test.com");
        p01Register.passwordIP(driver).sendKeys("123456");
        p01Register.confirmPasswordIP(driver).sendKeys("123456");

    }
    @And("user click create account button")
    public void user_click_create_account_button() throws InterruptedException {
        p01Register.createAccount(driver).click();
        Thread.sleep(500);//using long time due to low performance of website
    }

    @Then("user can create account successfully and go to homepage")
    public void user_can_create_account_successfully_and_go_to_homepage(){
        String registerDoneText="Your registration completed";
        Assert.assertTrue(p01Register.registationDone(driver).getText().contains(registerDoneText));
    }
    @After("@closeRegister")
    public void closeDriver(){
        driver.quit();
    }
}
