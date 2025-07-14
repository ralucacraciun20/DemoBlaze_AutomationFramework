package pages;

import data.Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void inputUsername() {
        driver.findElement(By.xpath("//input[@id='sign-username']"))
                .sendKeys(Constants.RANDOM_USERNAME.getValue());
    }

    public void inputPassword() {
        driver.findElement(By.xpath("//input[@id='sign-password']"))
                .sendKeys(Constants.PASSWORD.getValue());
    }

    public void clickRegisterButton() {
        driver.findElement(By.xpath("//button[@onclick='register()']")).click();
    }
}
