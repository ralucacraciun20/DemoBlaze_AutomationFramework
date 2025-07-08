package utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import org.openqa.selenium.WebDriver;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AlertBox {

    public static void accept(WebDriver driver) {
        driver.switchTo().alert().accept();
    }
}
