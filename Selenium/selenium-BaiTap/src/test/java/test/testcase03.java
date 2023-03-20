/*
Test Steps:
1. Go to https://hemstore.vn/
2. On the menu bar move the mouse and drop some product categories -> click on pants
3. Enter the keyword you want to search in the input tag
4. Click on the magnifying glass icon to submit
*/
package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

@Test
public class testcase03{
    public static void testcase03() throws InterruptedException {
        //1. Goto https://hemstore.vn/
        WebDriver driver = driverFactory.getChromeDriver();
        driver.get("https://hemstore.vn/");
        //2. On the menu bar move the mouse and drop some product categories -> click on pants
        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > header:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")).click();
        //3. Enter the keyword you want to search in the input tag
        driver.findElement(By.cssSelector("input[class='searchInput']")).sendKeys("Quần tây nam");
        //4. Click on the magnifying glass icon to submit
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}