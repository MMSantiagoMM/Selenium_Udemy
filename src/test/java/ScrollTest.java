import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ScrollTest {

    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,700)");

        Thread.sleep(5000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        List<WebElement> elements = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

        Integer sum = 0;
        for (WebElement element: elements){

            Integer numInt = Integer.valueOf(element.getText());

            sum = numInt +sum;
        }


        WebElement total = driver.findElement(By.className("totalAmount"));

        Integer numTotal = Integer.valueOf(total.getText().split(":")[1].trim());



        Assert.assertEquals(sum,numTotal);

    }


}
