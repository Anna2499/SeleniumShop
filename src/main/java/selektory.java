import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selektory {

    public static WebDriver driver;

    @Test
    public void lokalizowanieElementow_Test() throws InterruptedException {

        //Konfiguracja poczatkowa
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.selenium-shop.pl/");


        //Krok 1
        WebElement sklepMenu = driver.findElement(By.linkText("SKLEP"));
        sklepMenu.click();

        //Krok 2
        WebElement koszulkaChelsea = driver.findElement(By.xpath("//h2[contains(text(),'Chelsea')]"));
        koszulkaChelsea.click();

        //Krok 3
        WebElement quantityField = driver.findElement(By.xpath("//*[starts-with(@id,'quantity_')]"));
        quantityField.clear();
        quantityField.sendKeys("2");;

        //Krok 4
        WebElement dodajDoKoszykaButton = driver.findElement(By.xpath("//button[@name='add-to-cart']"));
        dodajDoKoszykaButton.click();

        //Krok 5
        WebElement zobaczKoszykLink = driver.findElement(By.linkText("Zobacz koszyk"));
        zobaczKoszykLink.click();

        //Krok 6
        WebElement kodKuponuInput = driver.findElement(By.id("coupon_code"));
        kodKuponuInput.clear();
        kodKuponuInput.click();

        //Krok 7
        WebElement zostosujKuponButton = driver.findElement(By.name("apply_coupon"));
        zostosujKuponButton.click();

        driver.close();
        driver.quit();
    }

}
