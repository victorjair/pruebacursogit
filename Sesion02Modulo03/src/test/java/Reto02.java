import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Reto02 {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://bedu.org/");
        //Thread.sleep(2000);
    }

    @Test
    public void test() {
        driver.get("https://bedu.org");
        driver.findElement(By.xpath("//button[contains(.,'Consulta gratuita')]"));
        driver.findElement(By.linkText("Términos y condiciones"));
        driver.findElement(By.partialLinkText("Términos"));
    }

    @Test
    public void anotherTest(){

        driver.get("https://google.com.mx");
        driver.findElement(By.name("q")).sendKeys("BEDU" + Keys.ENTER);
        WebElement FindResult = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.className("g")));
        System.out.println(FindResult.getText());
    }
    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
