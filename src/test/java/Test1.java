import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void myFirst(){
        //WebDriver driver = new ChromeDriver();
        //WebDriver driver1 = new FirefoxDriver();
        System.setProperty("webDriver.chrome.driver","C:\\Users\\s.mosquera\\Documents\\Selenium\\selenium_1\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/");
        String title = driver.getTitle();
        System.out.println(title);


    }




}
