import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Test4 {

    @Test
    public void testCheckBoxes(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        WebElement checkBoxOne = driver.findElement(By.id("checkBoxOption1"));

        checkBoxOne.click();
        Assert.assertTrue(checkBoxOne.isSelected());

        checkBoxOne.click();
        Assert.assertFalse(checkBoxOne.isSelected());

        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        Assert.assertEquals(checkBoxes.size(),3);
    }
}
