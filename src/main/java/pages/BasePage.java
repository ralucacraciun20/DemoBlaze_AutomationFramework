package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class BasePage {
    protected Logger log;
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        log = (Logger) LoggerFactory.getLogger(SignUpPage.class);
    }
}
