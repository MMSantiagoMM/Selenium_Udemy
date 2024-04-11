import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class FriendlyLocators {


    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        WebElement element = driver.findElement(By.cssSelector("[name='name']"));

        WebElement element2 = driver.findElement(with(By.tagName("label")).above(element));

        System.out.println(element2.getText());

        WebElement dateOfBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));

        driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();

        WebElement iceCream = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

        driver.findElement(with(By.tagName("input")).toLeftOf(iceCream)).click();




    }



}
