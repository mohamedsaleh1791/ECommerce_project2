package stepDefinition;

import Pages.P02_Login;
import Pages.P03_ResetPassword;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05_ResetPasswordStepDefinition {

    P02_Login loginPage;
    P03_ResetPassword resetPasswordPage;

    @Given("user navigate to home page")
    public void user_navigate_to_home_page() throws InterruptedException {

        loginPage=new P02_Login();
        loginPage.signinBTN(Hooks.driver).click();
    }
    @When("user click forget password button")
    public void user_click_forget_password_button() throws InterruptedException {
        loginPage.forgetBTN(Hooks.driver).click();
    }
    @And("user enter valid Email and user click recover Button")
    public void user_enter_valid_Email_and_user_click_recover_Button(){
        resetPasswordPage = new P03_ResetPassword();
        resetPasswordPage.recoveEmailField(Hooks.driver).sendKeys("victoria_victoria@nopCommerce.com");
        resetPasswordPage.recoveEmailBTN(Hooks.driver).click();

    }
    @Then("user recieve Instruction mail to rest password")
    public void  user_recieve_Instruction_mail_to_rest_password(){
        String actualResult=resetPasswordPage.recoveEmailDoneFiled(Hooks.driver).getText();
        String expectedResult="Email with instructions has been sent to you.";
        Assert.assertTrue(actualResult.contains(expectedResult));


    }


}
