package test;

import data.Constants;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.Wait;

public class LoginTest extends TestBase {

    @Test
    public void logInTest() {
        driver.findElement(By.xpath("//a[@id='login2']")).click();
        Wait.waitInSeconds(1);
        driver.findElement(By.xpath("//input[@id='loginusername']"))
                .sendKeys(Constants.USERNAME.getValue());
        driver.findElement(By.xpath("//input[@id='loginpassword']"))
                .sendKeys(Constants.PASSWORD.getValue());
        driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
        Wait.waitInSeconds(1);
        String actualMessage = driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
        String expectedMessage = Constants.LOGIN_MESSAGE.getValue();
        Wait.waitInSeconds(2);
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
