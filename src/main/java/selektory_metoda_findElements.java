import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class selektory_metoda_findElements {

    public static WebDriver driver;

    @Test
    public void weryfikacjaGrafikiwSklepie(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.selenium-shop.pl/");

        driver.findElement(By.linkText("SKLEP")).click();

        List<WebElement> wszystkieGrafiki = driver.findElements(By.xpath("//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image']"));

        int liczbaGrafik = wszystkieGrafiki.size();

        System.out.println("Liczba grafik produkowanych na stronie =  " + liczbaGrafik);

        Assert.assertEquals(liczbaGrafik, 12);

        for (int i=0; i < liczbaGrafik; i++){
            System.out.println(((java.util.List) wszystkieGrafiki).get(i));

         driver.quit();
        }
    }
}
