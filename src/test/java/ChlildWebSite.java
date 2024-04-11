import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ChlildWebSite {


        @Test
        public void test1(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

            driver.findElement(By.cssSelector(".example a[target='_blank']")).click();

            Set<String> windows = driver.getWindowHandles();

            Iterator<String> iterator = windows.iterator();

            String parentID = iterator.next();

            String childID = iterator.next();

            driver.switchTo().window(childID);

            System.out.println(driver.findElement(By.tagName("h3")).getText());

            driver.switchTo().window(parentID);

            System.out.println(driver.findElement(By.tagName("h3")).getText());







    }
}
