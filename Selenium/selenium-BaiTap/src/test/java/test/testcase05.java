/*
Test Steps:
1. Goto https://hemstore.vn/
2. On the menu bar move the mouse and drop some product categories -> click on the shirt
3. Click on seen detail Áo Thun STS Oversize SATS 108
4. Choose size
5. Choose quantity
6. click ADD TO CART for the " Áo Thun STS Oversize SATS 108"
 */
package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class testcase05 {
    public static void testcase05() throws InterruptedException {
        //1. Goto https://hemstore.vn/
        WebDriver driver = driverFactory.getChromeDriver();
        driver.get("https://hemstore.vn/");
        //2. On the menu bar move the mouse and drop some product categories -> click on the shirt
        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > header:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
        Thread.sleep(2000);
        //3. Click on seen detail Áo Thun STS Oversize SATS 108
        driver.findElement(By.cssSelector("body > div:nth-child(2) > main:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1)")).click();
        Thread.sleep(2000);
        //4.Choose size
        driver.findElement(By.cssSelector("div[class='select-swap attr-size req'] div:nth-child(2) label:nth-child(1) span:nth-child(1)")).click();
        //5.Quantity
        driver.findElement(By.cssSelector("#quantity")).sendKeys("1");
        Thread.sleep(5000);
        //6.click ADD TO CART for the " Áo Thun STS Oversize SATS 108"
        driver.findElement(By.cssSelector("button[id='add-to-cart'] span")).click();
        Thread.sleep(7000);
        driver.quit();
    }
}
