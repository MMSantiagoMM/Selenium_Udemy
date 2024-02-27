import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Test6 {



    @Test
    public void testPractice(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.findElement(By.name("name")).sendKeys("Mahatma Gandhi");
        driver.findElement(By.name("email")).sendKeys("gandhi@hindu.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("secretPassword");
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        WebElement elementSelect = driver.findElement(By.id("exampleFormControlSelect1"));
        Select select = new Select(elementSelect);
        select.selectByIndex(1);
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.cssSelector("input[type='date']")).sendKeys("21234343");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).isEnabled());
        System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")));

    }
}
