import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Zadanie3 {

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

        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.selenium-shop.pl/");
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.linkText("ANKIETA")).click();
        String adresUrl = driver.getCurrentUrl();
        System.out.println("Adres url: " + adresUrl);
        Assert.assertEquals(adresUrl, "http://www.selenium-shop.pl/o-nas/");

        driver.quit();

    }

    @Test
    public void testKOSZYK() {

        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("http://www.selenium-shop.pl/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("KOSZYK")).click();
        String adresUrl = driver.getCurrentUrl();
        System.out.println("Adres url: " + adresUrl);
        Assert.assertEquals(adresUrl, "http://www.selenium-shop.pl/koszyk/");

        driver.quit();
    }
}
