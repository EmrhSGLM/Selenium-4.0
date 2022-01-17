package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {

    // Normalde selenium'un kendi IDE'si de var fakat biz daha kullanisli oldugu icin Intellij kullaniyoruz
    // Intellij'de yeni bir proje actigimizda oncelikle selenium kutuphanelerini projeye eklememiz gerekir
    // Biz en ilkel haliyle projemize kutuphaneleri jar dosyalari olarak yukledik
    // Bu ekledigimiz dosyalarla artik driver'in ayarlarini yapabiliriz

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        // setProperty meyhodu 2 parametre ister.
        // Ilki kullanacagimiz browser'a ait driver
        // Ikinci parametre ise Selenium sitesinde indirip projemize ekledigimiz chromedriver'in path'i
        // Windows kullanicilari sona .exe eklerken, apple kullananlar .exe eklememeli

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(5000);
        // Java'dan gelir, icine yazilan mili saniye kadar kodlarin calismasini durdurur

        driver.close();
        // driver.close() class'in sonuna yazilir.Cunku bu kod calisinca driver'imiz kapanir
        // bu koddan sonra yeniden bir browser açmak istiyorsak driver'a yeni bir deger atamaliyiz






    }





}
