import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ejemplo03 {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test
    public void test() {

        driver.findElement(By.name("q")).sendKeys("bedu" + Keys.ENTER);  //Keys.ENTER simula un enter, proviene de la clase Keys

        //inicializamos un objeto de tipo WebDriverWait
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']"))); //este elemento no esta en la pantalla asi que generara un TimeoutException

        //Vemos el resultado
        System.out.println(firstResult.getText());
    }

    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
