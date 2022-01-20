package day04_XPathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CssSelector {

    //1 ) Bir class oluşturun : Locators_css
    //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //    a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
    //    b. Locate email textbox
    //    c. Locate password textbox ve
    //    d. Locate signin button
    //    e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
    //        i. Username : testtechproed@gmail.com
    //        ii. Password : Test1234!
    //NOT: cssSelector kullanarak elementleri locate ediniz.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //    a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        //    b. Locate email textbox
        WebElement emailTextBox = driver.findElement(By.cssSelector("input[id='session_email']"));
        // id icin #session_email de yazilabilir Class icin => .

        //    c. Locate password textbox ve
        WebElement passwordTextBox = driver.findElement(By.cssSelector("input[type='Password']"));

        //    d. Locate signin button
        WebElement signinTextBox = driver.findElement(By.cssSelector("input[name='commit']"));

        //    e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signinTextBox.click();
        driver.close();

    }
}
