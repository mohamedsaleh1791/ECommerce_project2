package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Login;
import org.example.Pages.P09_ShopingCart;
import org.example.Pages.P12_CreateOrder;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D12_CreateOrder {
    P02_Login loginPage;
    P09_ShopingCart shoppingCartPage;
    P12_CreateOrder createOrderPage;
    @Given("user login with valid username and valid password and product add to Shopping Cart")
    public void user_login_with_valid_username_and_valid_password() throws InterruptedException {
        loginPage=new P02_Login();
        loginPage.signinBTN(Hooks.driver).click();
        loginPage.emailField(Hooks.driver).sendKeys("victoria_victoria@nopCommerce.com");
        loginPage.passwordField(Hooks.driver).sendKeys("123456");
        loginPage.loginBTN(Hooks.driver).click();
        Thread.sleep(300);
        shoppingCartPage=new P09_ShopingCart();
        shoppingCartPage.addToShopingCartFiled(Hooks.driver).click();


    }
    @When("Open Shopping cart and  check Term of Services")
    public void Open_Shopping_cart_and_check_term_of_services() throws InterruptedException {
        shoppingCartPage.addtoShoppingCartBTN(Hooks.driver).click();
        shoppingCartPage.CheckTermsOfService(Hooks.driver).click();
//        Thread.sleep(300);

    }
    @And("Click checkout Button")
    public void Click_checkout_Button() throws InterruptedException {
        shoppingCartPage.CheckoutBTN(Hooks.driver).click();
//        Thread.sleep(100);
    }
    @And("choose address and Click Continue Button")
    public void choose_address_and_Click_ContinueButton() throws InterruptedException {
        createOrderPage=new P12_CreateOrder();
        createOrderPage.addressStepBTN(Hooks.driver).click();
//        Thread.sleep(100);
    }
    @And("Choose shipping method and Click Continue Button")
    public void choose_shippingMethod_and_Click_ContinueButton() throws InterruptedException {
        createOrderPage.shippingMethodBTN(Hooks.driver).click();
//        Thread.sleep(500);
    }
    @And("Choose payment method and Click Continue Button")
    public void choose_paymentMethod_and_Click_ContinueButton() throws InterruptedException {
        createOrderPage.paymentMethodBTN(Hooks.driver).click();
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }
    @And("check personal information and Click Continue Button")
    public void check_info_and_Click_ContinueButton() throws InterruptedException {
        WebElement element = createOrderPage.paymentInfoBTN(Hooks.driver);
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//        Actions builder = new Actions(Hooks.driver);
//        builder.moveToElement(element).click().perform();
        JavascriptExecutor executor = (JavascriptExecutor) Hooks.driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }
    @And("Click Confirm Button")
    public void Confirm_Button() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(createOrderPage.confirmOrderBTN(Hooks.driver)));
//        Hooks.driver.findElement(createOrderPage.confirmOrderBTN()).click();

        WebElement element = Hooks.driver.findElement(createOrderPage.confirmOrderBTN(Hooks.driver));
        Actions builder = new Actions(Hooks.driver);
        builder.moveToElement(element).click().perform();

//        createOrderPage.confirmOrderBTN(Hooks.driver).click();
//        Thread.sleep(500);

    }
    @Then("Order is processed successfully")
    public void Order_is_processed_successfully(){
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        String x=createOrderPage.checkConfirmOrder(Hooks.driver).getText();
        System.out.println(x);
        Assert.assertTrue(createOrderPage.checkConfirmOrder(Hooks.driver).getText().contains("Your order has been successfully processed!"));

    }
}
