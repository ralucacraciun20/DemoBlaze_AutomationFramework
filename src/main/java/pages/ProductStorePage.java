package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class ProductStorePage extends BasePage {

    public ProductStorePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnProduct() {
        driver.findElement(By.xpath("(//img[@src=\"imgs/galaxy_s6.jpg\"])[1]")).click();
    }

    public void clickOnAddToCard() {
        driver.findElement(By.xpath("//a[@onclick='addToCart(1)']")).click();
    }

   public void clickOnPlaceOrder() {
       driver.findElement(By.xpath("//button[@data-target='#orderModal']")).click();
   }
}
