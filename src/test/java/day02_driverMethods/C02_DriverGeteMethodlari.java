package day02_driverMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGeteMethodlari {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());// Sayfanin title'ini dondurur

        System.out.println(driver.getCurrentUrl()); // Sayfanin url'ini dondurur

        System.out.println(driver.getWindowHandle());
        // Her bir sayfa icin Chrome'in urettigi benzersiz bir numara

        System.out.println(driver.getPageSource());




    }
}
