package day03_WebElementLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {

    //1. Yeni bir class olusturun (TekrarTesti)
    //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
    //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
    //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
    //5. Youtube sayfasina geri donun
    //6. Sayfayi yenileyin
    //7. Amazon sayfasina donun
    //8. Sayfayi tamsayfa yapin
    //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
    //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
    //11.Sayfayi kapatin

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.navigate().to("https://www.youtube.com");
        String actualTitleYoutube = driver.getTitle();
        String expectedYoutubeTitle = "youtube";

        if(actualTitleYoutube.equals(expectedYoutubeTitle)){
            System.out.println("Youtube title testi PASS");
        }else {
            System.out.println("Youtube title testi PASS \nActual sayfa basligi : "+actualTitleYoutube);
        }

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String actualCurrentUrl = driver.getCurrentUrl();
        String expectedCurrentUrl = "youtube";

        if(actualCurrentUrl.contains(expectedCurrentUrl)){
            System.out.println("Youtube current testi PASS");
        }else {
            System.out.println("Youtube current testi PASS \nActual sayfa url'si : "+actualCurrentUrl);
        }


        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");

        //5. Youtube sayfasina geri donun
         driver.navigate().back();

        //6. Sayfayi yenileyin
        driver.navigate().refresh();

        //7. Amazon sayfasina donun
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa doğru başlığı(Actual Title) yazdırın.
        String actualTitleAmazon = driver.getTitle();
        String expectedYoutubeAmazon = "Amazon";

        if(actualTitleAmazon.equals(expectedYoutubeAmazon)){
            System.out.println("Amazon title testi PASS");
        }else {
            System.out.println("Amazon title testi PASS \nActual sayfa basligi : "+actualTitleAmazon);
        }

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın

        String actualCurrentUrlAmazon = driver.getCurrentUrl();
        String expectedCurrentUrlAmazon = "https://www.amazon.com/";

        if(actualCurrentUrlAmazon.equals(expectedCurrentUrlAmazon)){
            System.out.println("Amazon current testi PASS");
        }else {
            System.out.println("Amazon current testi PASS \nActual sayfa url'si : "+actualCurrentUrlAmazon);
        }

        //11.Sayfayi kapatin
        driver.quit();

    }


}
