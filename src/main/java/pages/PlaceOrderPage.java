package pages;

import data.Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage extends BasePage {

    public PlaceOrderPage(WebDriver driver) {
        super(driver);
    }

    public void inputName() {
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Constants.NAME.getValue());
    }

    public void inputCountry() {
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys(Constants.COUNTRY.getValue());
    }

    public void inputCity() {
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys(Constants.CITY.getValue());
    }

    public void inputCard() {
        driver.findElement(By.xpath("//input[@id='card']")).sendKeys(Constants.CARD.getValue());
    }

    public void inputMonth() {
        driver.findElement(By.xpath("//input[@id='month']")).sendKeys(Constants.MONTH.getValue());
    }

    public void inputYear() {
        driver.findElement(By.xpath("//input[@id='year']")).sendKeys(Constants.YEAR.getValue());
    }

    public void clickOnPurchaseOrderButton() {
        driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();
    }

    public void clickOnDismissButton() {
        driver.findElement(By.xpath("(//button[@data-dismiss='modal'])[6]")).click();

    }
}
