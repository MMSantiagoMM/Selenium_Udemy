import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class EcommerceTest {


    @Test
    public void addProductsToCart() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();

        String[] veggies = {"Cucumber","Brocolli"};

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        /*
        for (int i = 0; i <= products.size(); i++){
            String name = products.get(i).getText();
            if(name.contains("Cucumber")){
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                break;
            }
        }*/

        for (int i = 0; i < products.size(); i++){

            String [] name = products.get(i).getText().split("-");
            String formatterName = name[0].trim();
            System.out.println(formatterName);


            List listVeggies = Arrays.asList(veggies);

            if(listVeggies.contains(formatterName)){
                
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

            }
        }
    }




}
