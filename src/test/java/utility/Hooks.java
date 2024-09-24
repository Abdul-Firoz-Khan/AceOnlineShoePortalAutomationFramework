package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {
    public static BrowserDriver driver;

    @Before
    public void setUp() {
        driver = new BrowserDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }

}
