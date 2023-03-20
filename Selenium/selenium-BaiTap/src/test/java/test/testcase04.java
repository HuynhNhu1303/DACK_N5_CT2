/*
Test Steps:
1. Go to https://hemstore.vn/
2. On the menu bar move the mouse and drop some product categories -> click on the shirt
3. Click view Thun STS Oversize SATS 108
4. Read the  Thun STS Oversize SATS 108 shirt from the details page.
*/
package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

@Test
public class testcase04 {
    public static void testcase04() throws InterruptedException {
        //1. Goto https://hemstore.vn/
        WebDriver driver = driverFactory.getChromeDriver();
        driver.get("https://hemstore.vn/");
        //2. On the menu bar move the mouse and drop some product categories -> click on the shirt
        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > header:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
        Thread.sleep(2000);
        //3. Click view Áo Thun STS Oversize SATS 108
        driver.findElement(By.linkText("Áo Thun STS Oversize SATS 108")).click();
        Thread.sleep(2000);
        //4. Read the Sony Xperia mobile from detail page.
        String price_detail = driver.findElement(By.cssSelector(".price']")).getText();
        System.out.println("Áo Thun STS Oversize SATS 108: " + price_detail);
        Thread.sleep(2000);
        driver.quit();
    }
}