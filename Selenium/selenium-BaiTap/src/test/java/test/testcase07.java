/*
    Test step:
    1. Go to https://hemstore.vn/
    2. Click the account link -> login
    3. Enter the correct information just created
    4. Successful login
* */
package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class testcase07 {
    public static void testcase07() throws InterruptedException {

        WebDriver driver = driverFactory.getChromeDriver();
//        1. Go to https://hemstore.vn/
        driver.get("https://hemstore.vn/");
//        2. Click the account link -> login
        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1) > span:nth-child(2)")).click();
//        3. Enter the correct information just created
        driver.findElement(By.cssSelector("#username")).sendKeys("Tam123@gmail.com");

        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
//         4. Successful login
        driver.findElement(By.cssSelector("#btnsignin")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}