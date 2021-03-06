package day05_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {

    //1-C01_TekrarTesti isimli bir class olusturun
    //2- https://www.amazon.com/ adresine gidin
    //3- Browseri tam sayfa yapin
    //4-Sayfayi “refresh” yapin
    //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
    //6- Gift Cards sekmesine basin
    //7- Birthday butonuna basin
    //8- Best Seller bolumunden ilk urunu tiklayin
    //9- Gift card details’den 25 $’i  secin
    //10-Urun ucretinin 25$ oldugunu test edin
    //10-Sayfayi kapatin

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedTitle="Spend less";
        System.out.println(actualTitle.contains(expectedTitle) ? "Title test PASS" : "Title test FAIL");
        //6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
        //7- Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday Gift Cards']")).click();
        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//span[@class='a-truncate-cut'][1]")).click();
        //9- Gift card details’den 25 $’i  secin
        driver.findElement(By.xpath("//button[@value='25.00']")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement priceElement = driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']"));
        String expectedPrice = "$25.00";
        String actualPrice=priceElement.getText();
        System.out.println(actualPrice);
        System.out.println(actualPrice.equals(expectedPrice) ? "Price testing PASS" : "Price testing FAIL");
        //10-Sayfayi kapatin
        driver.close();
    }
}
