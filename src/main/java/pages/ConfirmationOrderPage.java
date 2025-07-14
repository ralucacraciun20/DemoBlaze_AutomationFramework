package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class ConfirmationOrderPage extends BasePage {

    public ConfirmationOrderPage(WebDriver driver) {
        super(driver);
    }

    public String getPurchaseMessage() {
       return driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]")).getText();
    }

    public void clickOnOkButton() {
        driver.findElement(By.xpath("//button[@style='display: inline-block;']")).click();
    }
}


