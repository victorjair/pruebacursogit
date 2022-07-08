
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo04 {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

    }

    @Test
    public void test() {

        System.out.println("findElement() = " + driver.findElement(By.xpath("//input[@type='submit']")));
        System.out.println("findElements() = " + driver.findElements(By.xpath("//input[@type='submit']")));

    }

    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
