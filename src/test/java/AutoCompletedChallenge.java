import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.event.KeyEvent;
import java.util.List;

public class AutoCompletedChallenge {


    @Test
    public void test() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        driver.findElement(By.id("autocomplete")).sendKeys("United");

        Thread.sleep(2000);

        /*
        List<WebElement> elements = driver.findElements(By.cssSelector("li.ui-menu-item"));

        for (WebElement element: elements){
            if(element.getText().equals("United Arab Emirates")){
                Actions actions = new Actions(driver);
                System.out.println("hello");
                actions.moveToElement(element).sendKeys(Keys.chord(Keys.ENTER)).build().perform();
            }
        }


         */
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

        driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);

    }


}
