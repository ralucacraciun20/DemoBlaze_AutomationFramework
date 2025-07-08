package utils;

import org.openqa.selenium.WebDriver;

public class AlertBox {

    private AlertBox() {}

    public static void accept(WebDriver driver) {
        driver.switchTo().alert().accept();
    }
}
