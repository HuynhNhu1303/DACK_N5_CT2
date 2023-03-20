/*Test Steps:
       Step 1. Go to https://hemstore.vn/
       Step 2. Click on menu choose Blog
       Step 3. Click on menu choose view and read 4 KIỂU DÁNG QUẦN JEANS NAM PHỔ BIẾN NHẤT
 */
package test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class testcase02 {

    public static void testcase02() throws InterruptedException {
        //1. Goto https://hemstore.vn/
        WebDriver driver = driverFactory.getChromeDriver();
        driver.get("https://hemstore.vn/");
        //2. Click on menu choose Blog
        driver.findElement(By.linkText("BLOG")).click();
        Thread.sleep(2000);
        //3. Click on menu choose view and read 4 KIỂU DÁNG QUẦN JEANS NAM PHỔ BIẾN NHẤT
        driver.findElement(By.linkText("4 KIỂU DÁNG QUẦN JEANS NAM PHỔ BIẾN NHẤT")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
