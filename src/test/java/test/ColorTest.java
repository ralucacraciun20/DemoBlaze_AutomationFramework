package test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

import utils.Wait;

public class ColorTest extends TestBase {

    @Test
    public void checkProductTitleColorTest() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[@class='card-title'])[1]/a")));
        Wait.waitInSeconds(2);
        String actualColor = driver.findElement(By.xpath("(//h4[@class='card-title'])[1]/a"))
                .getCssValue("color");
        String expectedColor = "rgba(2, 117, 216, 1)";
        Assert.assertEquals(actualColor, expectedColor);
    }

    @Test
    public void checkLogInColorTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginLink();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#logInModalLabel")));
        LoginPage loginPage = new LoginPage(driver);
        Wait.waitInSeconds(2);
        String actualColor = loginPage.getLoginButtonColor();
        String expectedColor = "rgba(2, 117, 216, 1)";
        Assert.assertEquals(actualColor, expectedColor, "Error: Colors don't match!");
    }
}
