package stepDefinition;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.P02_Login;




public class D02_LoginStepDefinition {

    WebDriver driver = null;
    P02_Login loginPage;
    @When("user enter valid {string} and valid {string}")
    public void userEnterValidAndValid(String arg0, String arg1) {
        loginPage=new P02_Login();
        loginPage.signinBTN(driver).click();
        loginPage.emailField(driver).sendKeys(arg0);
        loginPage.passwordField(driver).sendKeys(arg1);
    }

    @Given("user navigate to login page")
    public void user_navigate_to_login_page() throws InterruptedException {
        driver=new ChromeDriver();
        String chromePath=System.getProperty("user.dir")+"/src/resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");
        Thread.sleep(300);
    }

    @And("user click login button")
    public void user_click_login_button() throws InterruptedException {
        loginPage.loginBTN(driver).click();
        Thread.sleep(300);//using long time due to low performance of website
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
