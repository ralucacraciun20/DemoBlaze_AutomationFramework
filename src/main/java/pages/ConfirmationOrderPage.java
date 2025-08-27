package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationOrderPage extends BasePage {

    WebElement purchaseMessageText = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
    WebElement okButton = driver.findElement(By.xpath("//button[@style='display: inline-block;']"));

    public ConfirmationOrderPage(WebDriver driver) {
        super(driver);
    }

    public String getPurchaseMessage() {
        return purchaseMessageText.getText();
    }

    public void clickOnOkButton() {
        okButton.click();
    }
}


