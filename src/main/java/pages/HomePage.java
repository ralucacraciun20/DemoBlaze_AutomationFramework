package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginLink() {
        driver.findElement(By.xpath("//a[@id='login2']")).click();
    }

    public String getWelcomeMessage() {
        return driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
    }
}
