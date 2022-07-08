import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ejemplo02 {
    private WebDriver driver;


    @BeforeTest
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(2000);
    }

    @Test
    public void test() {
        driver.findElement(By.xpath("//input[@type='submit']"));
        driver.findElement(By.name("q"));
        driver.findElement(By.className("gNO89b"));
        driver.findElement(By.xpath("//input[@type='submit']"));
    }

    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
