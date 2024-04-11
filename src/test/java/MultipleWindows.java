import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MultipleWindows {


    @Test
    public void test() throws InterruptedException, IOException {
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

        WebElement name = driver.findElement(By.cssSelector("[name='name']"));

        name.sendKeys(courseName);

        File file = name.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(file,new File("C:/Users/s.mosquera/Documents//screenshot.png"));


        System.out.println(name.getRect().getDimension().getHeight());





    }
}
