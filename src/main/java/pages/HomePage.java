package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginLink() {
        driver.findElement(By.xpath("//a[@id='login2']")).click();
    }

    public String getWelcomeMessage() {
        return driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
    }

    public void clickSignIn() {
        driver.findElement(By.xpath("//a[@id='signin2']")).click();
    }

    public void clickOnCategories() {
        driver.findElement(By.xpath("(//a[@id='itemc'])[1]"));
    }

    public void clickOnCard() {
        driver.findElement(By.xpath("//a[@id='cartur']")).click();
    }
}
