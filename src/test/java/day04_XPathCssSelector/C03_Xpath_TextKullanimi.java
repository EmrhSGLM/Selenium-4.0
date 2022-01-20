package day04_XPathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Xpath_TextKullanimi {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin

        driver.findElement(By.xpath("//button[text()='Add Element']")).click();

        //3- Delete butonu’nun gorunur oldugunu test edin
        // WebElement deleteButonu = driver.findElement(By.xpath("//button[@class='added-manually']"));
        boolean varMi =   driver.findElement(By.xpath("//button[text()='Delete']")).isDisplayed();
        System.out.println(varMi ? "Delete Button gorunuyor testi PASS" : "Delete Button gorunuyor testi FAIL");

        //4- Delete tusuna basin
        driver.findElement(By.xpath("//button[text()='Delete']")).click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addYazisiElementi1 = driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));
        WebElement addYazisiElementi2 = driver.findElement(By.tagName("h3"));
        if(addYazisiElementi1.isDisplayed()) {
            System.out.println("Add Yazisi gorunuyor testi PASS");
        }else {
            System.out.println("Add Yazisi gorunuyor testi FAIL");
        }
        driver.close();
    }
}
