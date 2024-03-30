import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CertificationWindows {

    @Test
    public void test(){

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());


    }



}
