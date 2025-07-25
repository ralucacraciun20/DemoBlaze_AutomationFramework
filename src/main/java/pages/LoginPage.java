package pages;

import data.Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputUsername() {
        driver.findElement(By.xpath("//input[@id='loginusername']"))
                .sendKeys(Constants.USERNAME.getValue());
    }

    public void inputPassword() {
        driver.findElement(By.xpath("//input[@id='loginpassword']"))
                .sendKeys(Constants.PASSWORD.getValue());
    }

    public void clickLoginButton() {
        driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
    }
}
