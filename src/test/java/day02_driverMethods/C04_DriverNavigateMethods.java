package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        // driver.get ile ayni islemi yapar. driver.get'e gore daha  hizlidir

        driver.navigate().to("https://www.techproeducation.com");
        driver.navigate().back(); // geldigi yere doner
        driver.navigate().forward(); // bir sonraki sayfaya gider

        driver.navigate().refresh();// Sayfayi yeniler
    }
}
