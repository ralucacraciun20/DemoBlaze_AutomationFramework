package test;

import data.Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

import utils.AlertBox;

public class LoginTest extends TestBase {

    @Test
    public void logInTest() {
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
    }

    @Test
    public void emptyUserAndPasswordTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginLink();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#logInModalLabel")));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
        wait.until(ExpectedConditions.alertIsPresent());
        AlertBox.accept(driver);
    }

    @Test
    public void wrongUserAndPasswordTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginLink();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#logInModalLabel")));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputWrongUsername();
        loginPage.inputWrongPassword();
        loginPage.clickLoginButton();
        wait.until(ExpectedConditions.alertIsPresent());
        AlertBox.accept(driver);
    }

    @Test
    public void wrongUsernameTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginLink();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#logInModalLabel")));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputWrongUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        wait.until(ExpectedConditions.alertIsPresent());
        AlertBox.accept(driver);
    }

    @Test
    public void wrongPasswordTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginLink();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#logInModalLabel")));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername();
        loginPage.inputWrongPassword();
        loginPage.clickLoginButton();
        wait.until(ExpectedConditions.alertIsPresent());
        AlertBox.accept(driver);
    }
}