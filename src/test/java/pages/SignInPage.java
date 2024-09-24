package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class SignInPage {


    public static String UserNameTxtXpath="//input[@id='usr']";
    public static String PasswordTxtXpath="//input[@id='pwd']";
    public static String LoginBtnXpath="//input[@value='Login']";
    public static String RegistrationBtnXpath="//button[@id='NewRegistration']";
    public static void sendKeysUserNameTxt() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(UserNameTxtXpath)).sendKeys("sa");
    }
    public static void sendKeysPasswordTxt() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(PasswordTxtXpath)).sendKeys("sa");
    }
    public static void clickLoginBtn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(LoginBtnXpath)).click();
    }
    public static void clickRegistrationBtn() throws InterruptedException {Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.xpath(RegistrationBtnXpath)).click();}
}
