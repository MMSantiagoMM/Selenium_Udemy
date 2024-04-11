import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class BrokenLinks {


    @Test
    public void test() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        List<WebElement> links = driver.findElements(By.cssSelector(".gf-t li > a"));


        for (WebElement link:links){
        String url = link.getAttribute("href");
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

            //connection.setRequestMethod(("HEAD"));
            //connection.connect();


            System.out.println(link.getText() + " " + connection.getResponseCode());




        }

    }


}
