/*
Test Steps:
1. Go to https://hemstore.vn/
2. Click on my account link
3. Sign in to the app using previously created credentials
4. Successful login
5. On the menu bar move the mouse and drop some product categories -> click on the shirt
6. click view product
7. Choose size, quantity
8. Click "Add to Cart"
9. click vào tiến hành đặt hàng
10. Enter information in the data input box
11.Select the payment method "pay on delivery"
12. Complete your order
 */
package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

@Test
public class testcase09 {
    public static void testcase09() throws InterruptedException{
        WebDriver driver = driverFactory.getChromeDriver();
//        1. Go to https://hemstore.vn/
        driver.get("https://hemstore.vn/");
//        2. Click on account link
        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1) > span:nth-child(2)")).click();
//        3. Enter the correct information just created
        driver.findElement(By.cssSelector("#username")).sendKeys("Tam123@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
//        4. Successful login
        driver.findElement(By.cssSelector("#btnsignin")).click();
        Thread.sleep(2000);
//        5. On the menu bar move the mouse and drop some product categories -> click on the shirt
        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > header:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
        Thread.sleep(2000);
//        6. click view product
        driver.findElement(By.cssSelector("body > div:nth-child(2) > main:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1)")).click();
        Thread.sleep(2000);
//        7. Choose size, quantity
        driver.findElement(By.cssSelector("div[class='select-swap attr-size req'] div:nth-child(2) label:nth-child(1) span:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#quantity")).sendKeys("1");
        Thread.sleep(3000);
//        8. Click "Add to Cart"
        driver.findElement(By.cssSelector("button[id='add-to-cart'] span")).click();
        Thread.sleep(3000);
//        9. click vào tiến hành đặt hàng
        driver.findElement(By.cssSelector(".checkLimitCart.linktocheckout.button.dark")).click();
        Thread.sleep(2000);
//        10. Enter information in the data input box
        driver.findElement(By.cssSelector("#customerMobile")).sendKeys("0123456789");
        driver.findElement(By.cssSelector("#billing_address_address1")).sendKeys("12 Trịnh Đình Thảo");

        new Select(driver.findElement(By.cssSelector("#cityId"))).selectByVisibleText("Hồ Chí Minh");
        Thread.sleep(1000);
        new Select(driver.findElement(By.cssSelector("#districtId"))).selectByVisibleText("Quận Tân Phú");
        Thread.sleep(1000);
        new Select(driver.findElement(By.cssSelector("#wardId"))).selectByVisibleText("Phường Phú Thạnh");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("textarea[placeholder='Ghi chú']")).sendKeys("");

//      11.Select the payment method "pay on delivery"
        driver.findElement(By.cssSelector("input[value='1'][name='paymentMethod']")).click();
//      12. Complete your order
        // driver.findElement(By.cssSelector("button[type='submit'] span[class='btn-content']")).click();

        driver.quit();
    }
}