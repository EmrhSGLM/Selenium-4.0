package day04_XPathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_TekrarTesti {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //   Amazon web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com");

        //   Search(ara) “city bike”
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        // Search kutusuna "city bike" yazip aratin
        searchBox.sendKeys("city bike" + Keys.ENTER); // + da oluyor , de oluyor
        // searchBox.submit();

        //   Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement sonucYazisiElementi = driver.findElement(By.className("sg-col-inner"));
        // WebElement sonucYazisiElementi = driver.findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']"));
        // className ile daha once bu elementi locate edemedigimizhalde
        // xpath ile class attribute'nu kullanarak locate ettik
        System.out.println(sonucYazisiElementi.getText());

        /*
        //   Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        WebElement ilkUrunResmi = driver.findElement(By.className("s-image"));
        ilkUrunResmi.click();
        */

        // sadece click yapmak gibi basit bir islemde kullanacagimiz web elementler icin
        // variable olusturmadan direk locate edip, istedigimiz islemi yapabiliriz
        driver.findElement(By.className("s-image")).click();




    }
}
