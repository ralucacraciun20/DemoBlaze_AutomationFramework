package pages;

import data.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlaceOrderPage extends BasePage {

    WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
    WebElement inputCountry = driver.findElement(By.xpath("//input[@id='country']"));
    WebElement inputCity = driver.findElement(By.xpath("//input[@id='city']"));
    WebElement inputCard = driver.findElement(By.xpath("//input[@id='card']"));
    WebElement inputMonth = driver.findElement(By.xpath("//input[@id='month']"));
    WebElement inputYear = driver.findElement(By.xpath("//input[@id='year']"));
    WebElement purchaseOrderButton = driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']"));
    WebElement dismissButton = driver.findElement(By.xpath("(//button[@data-dismiss='modal'])[6]"));

    public PlaceOrderPage(WebDriver driver) {
        super(driver);
    }

    public void inputName() {
        inputName.sendKeys(Constants.NAME.getValue());
    }

    public void inputCountry() {
        inputCountry.sendKeys(Constants.COUNTRY.getValue());
    }

    public void inputCity() {
        inputCity.sendKeys(Constants.CITY.getValue());
    }

    public void inputCard() {
        inputCard.sendKeys(Constants.CARD.getValue());
    }

    public void inputMonth() {
        inputMonth.sendKeys(Constants.MONTH.getValue());
    }

    public void inputYear() {
        inputYear.sendKeys(Constants.YEAR.getValue());
    }

    public void clickOnPurchaseOrderButton() {
        purchaseOrderButton.click();
    }

    public void clickOnDismissButton() {
        dismissButton.click();
    }
}
