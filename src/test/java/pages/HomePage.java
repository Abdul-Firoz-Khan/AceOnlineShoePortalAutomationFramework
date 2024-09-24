package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class HomePage {
    public static String HamburgerMenuXpath="//input[@type='checkbox']";
    public static String SignInLinkXpath="//*[@id=\"menu\"]/a[2]/li";
    public static void clickHamburgerMenu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(HamburgerMenuXpath)).click();
    }
    public static void clickSignInLink() throws InterruptedException {Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.xpath(SignInLinkXpath)).click();}
}
