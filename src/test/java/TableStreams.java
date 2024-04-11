import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class TableStreams {


    @Test
    public void test(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));

        List<String> elementsText =  elementList.stream().map(WebElement::getText).toList();

        List<String> listSorted = elementsText.stream().sorted().toList();

        Assert.assertFalse(elementsText.equals(listSorted));

        List<String> price;
        do {
            List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
            price = elementsList.stream().filter(s -> s.getText().contains("Beans"))
                    .map(this::getPriceVeggie).toList();

            price.forEach(System.out::println);

            if (price.isEmpty()) {
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }
        }while (price.isEmpty());

    }

    private String getPriceVeggie(WebElement element) {

        return element.findElement(By.xpath("following-sibling::td[1]")).getText();



    }


}
