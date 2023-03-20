/*
Test Steps:
1. Go to https://hemstore.vn/
2. Click on my account link
3. Sign in to the app using previously created credentials
4. CLick ok
5. On the menu bar move the mouse and drop some product categories -> click on the shirt -> click product
6. Choose size, quantity
7. Click "Add to Cart"
8. Select "View Cart Details"

 */
package test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

@Test
public class testcase08 {
    public static void testcase08() throws InterruptedException{
        WebDriver driver = driverFactory.getChromeDriver();
//        1. Go to https://hemstore.vn/
        driver.get("https://hemstore.vn/");
//        2. Click on account link
        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1) > span:nth-child(2)")).click();
//        3. Enter the correct information just created
        driver.findElement(By.cssSelector("#username")).sendKeys("Tam123@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
//        4. CLick ok
        driver.findElement(By.cssSelector("#btnsignin")).click();
//        5. On the menu bar move the mouse and drop some product categories -> click on the shirt -> click product
        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > header:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > div:nth-child(2) > main:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1)")).click();
        Thread.sleep(2000);
//        6. Choose size, quantity
        driver.findElement(By.cssSelector("div[class='select-swap attr-size req'] div:nth-child(2) label:nth-child(1) span:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#quantity")).sendKeys("1");
        Thread.sleep(3000);
//        7. Click "Add to Cart"
        driver.findElement(By.cssSelector("button[id='add-to-cart'] span")).click();
        Thread.sleep(3000);
//        8. Select "View Cart Details"
        driver.findElement(By.cssSelector(".linktocart.button.dark")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}