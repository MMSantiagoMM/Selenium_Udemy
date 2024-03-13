import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameChallenge {


    @Test
    public void test(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        System.out.println(driver.findElements(By.tagName("frameset")).size());

        driver.switchTo().frame(driver.findElement(By.name("frame-top")));

        driver.switchTo().frame(driver.findElement(By.name("frame-middle")));

        System.out.println(driver.findElement(By.id("content")).getText());








    }
}
