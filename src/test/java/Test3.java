import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Test3 {


    @Test
    public void test3() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("autosuggest")).sendKeys("ind");

        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu .ui-corner-all"));

        for (WebElement option:options){
            if(option.getText().equals("India")){
                option.click();
                break;
            }
        }

        driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();


        Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());

        driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());



    }



}
