import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Frame {


    @Test
    public void test(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");

        //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        //System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0);

        WebElement drag = driver.findElement(By.id("draggable"));

        WebElement drop = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);

        action.dragAndDrop(drag,drop).build().perform();

        driver.switchTo().defaultContent();


    }

}
