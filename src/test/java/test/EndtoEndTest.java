package test;

import data.Constants;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.Wait;

public class EndtoEndTest extends TestBase {

    @Test
    public void endToEndTest() {
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
        driver.findElement(By.xpath("(//a[@id='itemc'])[1]"));
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("(//img[@src=\"imgs/galaxy_s6.jpg\"])[1]")).click();
        Wait.waitInSeconds(1);
        driver.findElement(By.xpath("//a[@onclick='addToCart(1)']")).click();
        driver.findElement(By.xpath("//a[@id='cartur']")).click();
        driver.findElement(By.xpath("//button[@data-target='#orderModal']")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Constants.NAME.getValue());
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys(Constants.COUNTRY.getValue());
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys(Constants.CITY.getValue());
        driver.findElement(By.xpath("//input[@id='card']")).sendKeys(Constants.CARD.getValue());
        driver.findElement(By.xpath("//input[@id='month']")).sendKeys(Constants.MONTH.getValue());
        driver.findElement(By.xpath("//input[@id='year']")).sendKeys(Constants.YEAR.getValue());
        driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();
        Wait.waitInSeconds(1);
        driver.findElement(By.xpath("(//button[@data-dismiss='modal'])[6]")).click();
        String actualSuccessMessage1 = driver.findElement(
                By.xpath("//h2[contains(text(),'Thank you for your purchase!')]")
        ).getText();
        String expectedSuccessMessage1 = Constants.PURCHASE_MESSAGE.getValue();
        Wait.waitInSeconds(2);
        Assert.assertEquals(actualSuccessMessage1, expectedSuccessMessage1);
        driver.findElement(By.xpath("//button[@style='display: inline-block;']")).click();
    }
}
