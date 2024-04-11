import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class LoginChallenge {


    @Test
    public void testChallenge(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();

        WebElement element1 = driver.findElement(By.cssSelector("p.text-center"));

        String[] arrayTest = element1.getText().split(" ");

        String userName= arrayTest[2].trim();
        String passWord= arrayTest[6].trim();


        String passWord2 = passWord.split("\\)")[0];

        WebElement userInput = driver.findElement(By.id("username"));
        userInput.sendKeys(userName);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(passWord2);

        List<WebElement> checkBoxes = driver.findElements(By.className("customradio"));

        for (int i = 0; i < checkBoxes.size() ; i++) {
            if(checkBoxes.get(i).getText().contains("User")){
                driver.findElements(By.cssSelector("span.checkmark")).get(i).click();
            }
        }

        WebElement okButton = driver.findElement(By.id("okayBtn"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.elementToBeClickable(okButton)).click();

        WebElement selectLocator = driver.findElements(By.cssSelector(".form-control")).get(2);

        Select select = new Select(selectLocator);
        select.selectByIndex(2);

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> buttons = driver.findElements(By.cssSelector(".card-footer .btn"));

        for (WebElement btn:buttons){
            btn.click();
        }

        driver.findElement(By.cssSelector(".nav-item.active")).click();

        driver.findElement(By.className("btn-success"))
                .click();

        driver.findElement(By.cssSelector(".checkbox.checkbox-primary")).click();


        WebElement locationInput = driver.findElement(By.id("country"));
        wait.until(ExpectedConditions.elementToBeClickable(locationInput)).sendKeys("Anywhere");



        WebElement purchaseButton = driver.findElement(By.cssSelector("input[type='submit']"));
        wait.until(ExpectedConditions.elementToBeClickable(purchaseButton)).click();









    }


}
