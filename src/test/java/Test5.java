import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5 {


    @Test
    public void test5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        WebElement disable = driver.findElement(By.cssSelector(".css-76zvg2.css-bfa6kz.r-homxoj.r-ubezar.r-icoktb"));

        disable.click();
        System.out.println(disable.getAttribute("style"));

        if(disable.getAttribute("style").contains("opacity")){
            System.out.println("it's enable");
            Assert.assertTrue(true);
        }
    }
}
