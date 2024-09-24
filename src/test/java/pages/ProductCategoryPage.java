package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class ProductCategoryPage {
    public static String ProductCategoryHeadingXpath ="//*[@id=\"ShoeType\"]";

    public static String visibilityProductCategory() throws InterruptedException {Thread.sleep(2000);

        return driver.findElement(By.xpath(ProductCategoryHeadingXpath)).getText();

    }
}
