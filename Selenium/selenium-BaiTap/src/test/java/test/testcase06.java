/*
1. Go to https://hemstore.vn/
2. Click on account link
3. Click on the signup link and fill in the New User information except Email ID
4. Click Sign Up
5. Verify Registration is complete. Expected account registration completed
6. Click OK
*/
package test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class testcase06{
    public static void testcase06() throws InterruptedException {
        WebDriver driver = driverFactory.getChromeDriver();
//        1. Go to https://hemstore.vn/
        driver.get("https://hemstore.vn/");
//        2. Click on account link
        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1) > span:nth-child(2)")).click();

//        3. Click Create an Account link and fill New User information except Email ID
        driver.findElement(By.linkText("ĐĂNG KÝ")).click();

        driver.findElement(By.cssSelector("#fullName")).sendKeys("Mỹ Tâm");

        driver.findElement(By.cssSelector("#mobile")).sendKeys("0123456789");

        driver.findElement(By.cssSelector("#email")).sendKeys("Tam123@gmail.com");

        driver.findElement(By.cssSelector("#password")).sendKeys("123456");


//      4. Click Sign Up
        driver.findElement(By.cssSelector("#btnsingup")).click();
        Thread.sleep(2000);
//      5. Verify Registration is complete. Expected account registration completed
        driver.findElement(By.linkText("OK")).click();

//      6. Click OK
        driver.findElement(By.cssSelector("##username")).sendKeys("Tam123@gmail.com");

        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        Thread.sleep(2000);
        driver.quit();

    }
}