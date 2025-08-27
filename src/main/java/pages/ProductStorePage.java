package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductStorePage extends BasePage {

    WebElement productButton = driver.findElement(By.xpath("(//img[@src=\"imgs/galaxy_s6.jpg\"])[1]"));
    WebElement addToCartButton = driver.findElement(By.xpath("//a[@onclick='addToCart(1)']"));
    WebElement placeOrderButton = driver.findElement(By.xpath("//button[@data-target='#orderModal']"));

    public ProductStorePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnProduct() {
        productButton.click();
    }

    public void clickOnAddToCart() {
        addToCartButton.click();
    }

   public void clickOnPlaceOrder() {
       placeOrderButton.click();
   }
}
