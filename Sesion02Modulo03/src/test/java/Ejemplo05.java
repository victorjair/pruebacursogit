import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo05 {
    private WebDriver driver;
    private WebElement googleSearch;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test() {
        googleSearch = driver.findElement(By.name("q"));

        System.out.println("getClass = " + googleSearch.getClass());
        System.out.println("getSize = " + googleSearch.getSize());
        System.out.println("getTagName = " + googleSearch.getTagName());
        System.out.println("getDomAttribute = " + googleSearch.getDomAttribute("class"));
        System.out.println("getCssValue = " + googleSearch.getCssValue("background-color"));
        System.out.println("getLocation = " + googleSearch.getLocation());

        if(googleSearch.isDisplayed()) {
            googleSearch.click();
            googleSearch.sendKeys("Bedu");
            System.out.println("getText = " + googleSearch.getText());

            googleSearch.clear();

        }

    }

    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
