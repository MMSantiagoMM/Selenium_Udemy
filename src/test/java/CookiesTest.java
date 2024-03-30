import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CookiesTest {

    @Test
    public void test(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        System.out.println(driver.manage().getCookies().size());

        driver.manage().deleteAllCookies();
        System.out.println(driver.manage().getCookies().size());



    }




}
