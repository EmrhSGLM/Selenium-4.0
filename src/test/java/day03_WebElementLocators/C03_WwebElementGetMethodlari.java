package day03_WebElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WwebElementGetMethodlari {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com ");

        // sigIn linkini locate edelimit
        WebElement signInLinki = driver.findElement(By.id("sign-in"));

        System.out.println("size : "+signInLinki.getSize());
        System.out.println("aria role : "+signInLinki.getAriaRole());
        System.out.println("accassible name : "+signInLinki.getAccessibleName());
        System.out.println("id attribute value'su : "+signInLinki.getAttribute("id"));
        System.out.println("location : "+signInLinki.getLocation());
        System.out.println("genislik : "+signInLinki.getRect().width);
        System.out.println("color : "+signInLinki.getCssValue("color"));



        driver.close();

    }
}
