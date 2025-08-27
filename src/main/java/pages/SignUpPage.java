package pages;

import data.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {

    WebElement inputUsername = driver.findElement(By.xpath("//input[@id='sign-username']"));
    WebElement inputPassword = driver.findElement(By.xpath("//input[@id='sign-password']"));
    WebElement registerButton = driver.findElement(By.xpath("//button[@onclick='register()']"));
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void inputUsername() {
        inputUsername.sendKeys(Constants.RANDOM_USERNAME.getValue());
    }

    public void inputPassword() {
        inputPassword.sendKeys(Constants.PASSWORD.getValue());
    }

    public void clickRegisterButton() {
        registerButton.click();
    }
}
