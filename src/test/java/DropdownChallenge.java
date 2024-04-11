import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownChallenge {

    @Test
    public void testChallenge(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        WebElement checkBoxSide = driver.findElement(By.id("checkbox-example"));

        List<WebElement> options = checkBoxSide.findElements(By.tagName("label"));

        WebElement option2Text = options.get(1);

        WebElement checkBoxOption2 = option2Text.findElement(By.tagName("input"));

        checkBoxOption2.click();


        WebElement select = driver.findElement(By.id("dropdown-class-example"));

        Select selectDropdown = new Select(select);

        selectDropdown.selectByVisibleText(option2Text.getText());

        String option2Dropdown = selectDropdown.getFirstSelectedOption().getText();

        driver.findElement(By.cssSelector("#name")).sendKeys(option2Dropdown);

        driver.findElement(By.cssSelector("#alertbtn")).click();

        String text = driver.switchTo().alert().getText().split(",")[0].split(" ")[1];

        System.out.println(text);

    }


}
