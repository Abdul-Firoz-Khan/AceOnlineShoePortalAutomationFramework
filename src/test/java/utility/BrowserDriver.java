package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriver {
    public static WebDriver driver;

    public BrowserDriver(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

    }
    public void close(){
        driver.close();
    }
}
