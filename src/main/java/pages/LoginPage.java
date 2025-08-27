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

    public void inputWrongUsername() {
        driver.findElement(By.xpath("//input[@id='loginusername']"))
                .sendKeys(Constants.WRONG_USERNAME.getValue());
    }

    public void inputWrongPassword() {
        driver.findElement(By.xpath("//input[@id='loginpassword']"))
                .sendKeys(Constants.WRONG_PASSWORD.getValue());
    }

    public void clickLoginButton() {
        driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
    }

    public String getLoginButtonColor(){
        return driver.findElement(By.cssSelector("button[onclick='logIn()']"))
                .getCssValue("background-color");
    }
}
