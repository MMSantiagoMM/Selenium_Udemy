import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test2 {


    @Test
    public void test2() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.get("https://spicejet.com");
        driver.manage().window().maximize();
/*
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropDown = new Select(staticDropdown);
        dropDown.selectByVisibleText("AED");
        dropDown.selectByIndex(3);


        WebElement box = driver.findElement(By.id("divpaxinfo"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(box)).click();

        WebElement box2 = driver.findElement(By.id("hrefIncAdt"));




        for (int i = 0; i < 2 ; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(box2)).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();

 */

        driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'][1]")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'][1]")).click();









    }



}
