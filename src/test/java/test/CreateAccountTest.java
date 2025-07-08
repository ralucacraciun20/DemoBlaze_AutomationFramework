package test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignUpPage;

import utils.AlertBox;
import utils.Wait;

public class CreateAccountTest extends TestBase {

    @Test
    public void signUpTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();
        Wait.waitInSeconds(1);
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.inputUsername();
        signUpPage.inputPassword();
        signUpPage.clickRegisterButton();
        Wait.waitInSeconds(1);
        AlertBox.accept(driver);
    }
}
