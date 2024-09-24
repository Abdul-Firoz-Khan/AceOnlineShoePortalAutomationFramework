package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class RegistrationPage {
    public static String RegistrationPageHeadingXpath = "//h1[normalize-space()='User Registration Page']";

    public static String visibilityRegistrationPage() throws InterruptedException {


        return driver.findElement(By.xpath(RegistrationPageHeadingXpath)).getText();
    }
}