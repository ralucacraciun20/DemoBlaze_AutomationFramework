package test;

import data.Constants;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

import utils.Wait;

public class LoginTest extends TestBase {

    @Test
    public void logInTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginLink();
        Wait.waitInSeconds(1);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        Wait.waitInSeconds(1);
        String actualMessage = homePage.getWelcomeMessage();
        String expectedMessage = Constants.LOGIN_MESSAGE.getValue();
        Wait.waitInSeconds(2);
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
