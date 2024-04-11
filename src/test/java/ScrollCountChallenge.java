import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollCountChallenge {


    @Test
    public void test(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,700)");

        js.executeScript("document.querySelector('.table-display')");

        Integer rows = driver.findElements(By.cssSelector(".table-display tr")).size();

        System.out.println(rows);

        Integer columns = driver.findElements(By.cssSelector(".table-display tr th")).size();

        System.out.println(columns);

        String secondRow = driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText();

        System.out.println(secondRow);

    }

}
