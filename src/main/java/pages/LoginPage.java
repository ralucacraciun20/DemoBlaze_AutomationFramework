package pages;

import data.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    WebElement usernameInputField = driver.findElement(By.xpath("//input[@id='loginusername']"));
    WebElement passwordInputField = driver.findElement(By.xpath("//input[@id='loginpassword']"));
    WebElement loginButton = driver.findElement(By.xpath("//button[@onclick='logIn()']"));

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputUsername() {
        usernameInputField.sendKeys(Constants.USERNAME.getValue());
    }

    public void inputPassword() {
        passwordInputField.sendKeys(Constants.PASSWORD.getValue());
    }

    public void inputWrongUsername() {
        usernameInputField.sendKeys(Constants.WRONG_USERNAME.getValue());
    }

    public void inputWrongPassword() {
        passwordInputField.sendKeys(Constants.WRONG_PASSWORD.getValue());
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getLoginButtonColor(){
        return loginButton.getCssValue("background-color");
    }
}
