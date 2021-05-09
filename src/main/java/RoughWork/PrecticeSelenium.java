package RoughWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PrecticeSelenium {
    public static void main( String[] args ) {
        //System.setProperty("webdriver.chrome.driver", "/Users/hbhuiyan/Documents/TalentTEK/git/Jan2021_UI_FW/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://qa.taltektc.com/home/login");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("hasanyc@hotmail.com");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("test1234");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
    // Challenge
    // 1. Run only one time
    // 2. running in only in one browser
    // 3. Hard coded test data (not dynamic)
    // 4. time consuming
    // 5. browser doesn't get update and needs to update it manually
    // 6. patch is not dynamic
    // 7. browser exe file issue
    // 8. not suitebale for different env such as qa/stage/prod


}
