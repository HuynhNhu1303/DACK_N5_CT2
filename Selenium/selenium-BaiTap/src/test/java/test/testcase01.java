/*
Test Steps:
Step 1. Go to https://hemstore.vn/
Step 2. On the menu bar move the mouse and drop some product categories -> click on the shirt
Step 3. Click -> Sort -> Ascending price -> Confirm all products are sorted by ascending price
*/
package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

@Test
public class testcase01 {
    public static void testcase01() throws InterruptedException {
         // 1. Go to https://hemstore.vn/
        WebDriver driver = driverFactory.getChromeDriver();
        driver.get("https://hemstore.vn/");
         // 2. On the menu bar move the mouse and drop some product categories -> click on the shirt
        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > header:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
         //  3. Click -> Sort -> Ascending price -> Confirm all products are sorted by ascending price
        new Select(driver.findElement(By.cssSelector(".sort-by.custom-dropdown__select"))).selectByVisibleText("Giá tăng dần");
        Thread.sleep(3000);
        driver.quit();
    }
}