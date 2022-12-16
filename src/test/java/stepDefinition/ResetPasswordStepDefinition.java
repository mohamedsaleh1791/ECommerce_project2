package stepDefinition;

import Pages.LoginPage;
import Pages.ResetPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResetPasswordStepDefinition {
    WebDriver driver = null;
    LoginPage loginPage;
    ResetPasswordPage resetPasswordPage;

    @Given("user navigate to home page")
    public void user_navigate_to_home_page() throws InterruptedException {
        driver=new ChromeDriver();
        loginPage=new LoginPage();
        System.setProperty("webdriver.chrome.driver", "D:\\TestingAutomation\\Testing\\src\\resources\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");
        Thread.sleep(300);
        loginPage.signinBTN(driver).click();
    }
    @When("user click forget password button")
    public void user_click_forget_password_button() throws InterruptedException {
        loginPage.forgetBTN(driver).click();
    }
    @And("user enter valid Email and user click recover Button")
    public void user_enter_valid_Email_and_user_click_recover_Button(){
        resetPasswordPage = new ResetPasswordPage();
        resetPasswordPage.recoveEmailField(driver).sendKeys("victoria_victoria@nopCommerce.com");
        resetPasswordPage.recoveEmailBTN(driver).click();

    }
    @Then("user recieve Instruction mail to rest password")
    public void  user_recieve_Instruction_mail_to_rest_password(){
        String actualResult=resetPasswordPage.recoveEmailDoneFiled(driver).getText();
        String expectedResult="Email with instructions has been sent to you.";
        Assert.assertTrue(actualResult.contains(expectedResult));


    }
    public void closeDriver(){
        driver.quit();
    }
}
