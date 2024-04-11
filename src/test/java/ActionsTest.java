import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTest {

    @Test
    public void testOne() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("nav-link-accountList"));

        actions.moveToElement(element).build().perform();
    }

    @Test
    public void testTwo() {
        System.out.println("Hello");
    }


}
