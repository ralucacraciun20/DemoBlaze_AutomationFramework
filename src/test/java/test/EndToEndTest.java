package test;

import data.Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.PlaceOrderPage;
import pages.ProductStorePage;
import pages.ConfirmationOrderPage;

import utils.AlertBox;

public class EndToEndTest extends TestBase {

    @Test
    public void endToEndTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginLink();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#logInModalLabel")));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nameofuser")));
        String actualMessage = homePage.getWelcomeMessage();
        String expectedMessage = Constants.LOGIN_MESSAGE.getValue();
        Assert.assertEquals(actualMessage, expectedMessage);
        homePage.clickOnCategories();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cat:nth-child(1)")));
        ProductStorePage productStorePage = new ProductStorePage(driver);
        productStorePage.clickOnProduct();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-success.btn-lg")));
        productStorePage.clickOnAddToCart();
        wait.until(ExpectedConditions.alertIsPresent());
        AlertBox.accept(driver);
        homePage.clickOnCart();
        productStorePage.clickOnPlaceOrder();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#orderModalLabel")));
        PlaceOrderPage placeOrderPage = new PlaceOrderPage(driver);
        placeOrderPage.inputName();
        placeOrderPage.inputCountry();
        placeOrderPage.inputCity();
        placeOrderPage.inputCard();
        placeOrderPage.inputMonth();
        placeOrderPage.inputYear();
        placeOrderPage.clickOnPurchaseOrderButton();
        placeOrderPage.clickOnDismissButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sa-icon.sa-custom + h2")));
        ConfirmationOrderPage confirmationOrderPage = new ConfirmationOrderPage(driver);
        String actualSuccessMessage1 = confirmationOrderPage.getPurchaseMessage();
        String expectedSuccessMessage1 = Constants.PURCHASE_MESSAGE.getValue();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sa-icon.sa-custom + h2")));
        Assert.assertEquals(actualSuccessMessage1, expectedSuccessMessage1);
        confirmationOrderPage.clickOnOkButton();
    }
}
