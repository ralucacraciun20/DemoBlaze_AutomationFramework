package test;

import data.Constants;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import utils.Wait;

public class CreateAccountTest extends TestBase {

    @Test
    public void signUpTest() {
        driver.findElement(By.xpath("//a[@id='signin2']")).click();
        Wait.waitInSeconds(1);
        driver.findElement(By.xpath("//input[@id='sign-username']"))
                .sendKeys(Constants.USERNAME.getValue());
        driver.findElement(By.xpath("//input[@id='sign-password']"))
                .sendKeys(Constants.PASSWORD.getValue());
        driver.findElement(By.xpath("//button[@onclick='register()']")).click();
        Wait.waitInSeconds(1);
        driver.switchTo().alert().accept();
    }
}
