import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Links {


    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size() ; i++) {

            String clickOnLinkTable = Keys.chord(Keys.CONTROL,Keys.ENTER);

            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTable);
            Thread.sleep(5000);


        }
        Set<String> links = driver.getWindowHandles();
        Iterator<String> it = links.iterator();

        while(it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }



    }



}
