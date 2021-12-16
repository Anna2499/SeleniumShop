import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Zadanie2a {

    public static WebDriver driver;

    @Test
    public void testSKLEP() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.selenium-shop.pl/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("SKLEP")).click();
        String adresUrl = driver.getCurrentUrl();
        System.out.println("Adres url: " + adresUrl);
        Assert.assertEquals(adresUrl, "http://www.selenium-shop.pl/sklep/");

        driver.quit();

    }

    @Test
    public void testANKIETA() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.selenium-shop.pl/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("ANKIETA")).click();
        String adresUrl = driver.getCurrentUrl();
        System.out.println("Adres url: " + adresUrl);
        Assert.assertEquals(adresUrl, "http://www.selenium-shop.pl/o-nas/");

        driver.quit();

    }

    @Test
    public void testKOSZYK() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.selenium-shop.pl/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("KOSZYK")).click();
        String adresUrl = driver.getCurrentUrl();
        System.out.println("Adres url: " + adresUrl);
        Assert.assertEquals(adresUrl, "http://www.selenium-shop.pl/koszyk/");

        driver.quit();
    }
}
