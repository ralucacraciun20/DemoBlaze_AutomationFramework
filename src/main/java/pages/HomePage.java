package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    WebElement loginLink = driver.findElement(By.xpath("//a[@id='login2']"));
    WebElement welcomeMessage = driver.findElement(By.xpath("//a[@id='nameofuser']"));
    WebElement signInButton = driver.findElement(By.xpath("//a[@id='signin2']"));
    WebElement categoriesDropDown = driver.findElement(By.xpath("(//a[@id='itemc'])[1]"));
    WebElement cartButton = driver.findElement(By.xpath("//a[@id='cartur']"));

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginLink() {
        loginLink.click();
    }

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public void clickOnCategories() {
        categoriesDropDown.click();
    }

    public void clickOnCart() {
        cartButton.click();
    }
}
