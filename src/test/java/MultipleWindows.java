import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MultipleWindows {


    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://rahulshettyacademy.com");

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();

        driver.switchTo().window(childWindow);


        Thread.sleep(5000);
        String courseName = driver.findElements(By.cssSelector("h2>a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();

        driver.switchTo().window(parentWindow);

        driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);

        driver.quit();





    }
}
