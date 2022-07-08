import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Reto01 {


    SoftAssert obj_softAssert = new SoftAssert();

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("--------------------     INICIO DE LA EJECUCIÓN   -------------------------------");
        System.out.println("---------------------------------------------------------------------------------");
    }

    @BeforeTest
    public void beforeTest(){


    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("INICIO DE LAS PRUEBAS SOBRE EL MODULO: AGENDAR ASESORIA");
    }

    @BeforeMethod
    public void beforeMethod() throws InterruptedException{
        System.out.println("INICIO DE LA PRUEBA");

        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bedu.org/");
        Thread.sleep(2000);

        By bnt_asesoria = By.xpath("//button[contains(.,'Consulta gratuita')]");
        assertTrue(isButtonDisplayed(bnt_asesoria, driver));
        driver.findElement(bnt_asesoria).click();
        Thread.sleep(2000);


    }

    @Test (priority = 1)
    public void test_cancelar() {

        System.out.println("Click sobre cancelar..");
        driver.findElement(By.xpath("//button[contains(.,'Cancelar')]")).click();


    }

    @Test (priority = 3)
    public void test_agendarcita() {

        System.out.println("Click sobre cancelar..");
        //driver.findElement(By.xpath("//button[contains(.,'Consulta gratuita')]")).click();
        driver.findElement(By.xpath("//button[contains(.,'Consulta gratuita')]"));


    }
    @Test (priority = 2)
    public void test_agendar() {
        System.out.println("prueba de test_agendar");


    }


    @Test
    public void anotherTest(){

        driver.get("https://google.com.mx");
        driver.findElement(By.name("q")).sendKeys("BEDU" + Keys.ENTER);
        WebElement FindResult = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.className("g")));
       System.out.println(FindResult.getText());
    }

    @Test
    public void localWeb(){
        driver.get("file:///C:/Users/nomarlo/Desktop/ServicioRMI/web-automation/index.html");
      //        WebElement modal = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.tagName("p")));
        WebElement modal = new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> driver.findElement(By.tagName("p")));
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

         //        driver.findElement(By.tagName("p"));
    }

    @Test
    public void Login() {
        driver.get("https://www.mercadolibre.com.mx/");
        driver.findElement(By.linkText("Ingresa")).click();
        String actualStr = driver.findElement(By.cssSelector(".center-card__title")).getText();
        System.out.println("actualStr = " + actualStr);
        String expectStr = "¡Hola! Ingresa tu teléfono, e‑mail o usuario";
        System.out.println("expectStr = " + expectStr);
        //obj_softAssert.assertEquals(actualStr,expectStr);
        //obj_softAssert.assertAll();
        Assert.assertEquals(actualStr, expectStr);
    }

    @Test
    //Metodo que recibe el localizador y el driver y retorna true o false si isDisplayed()
    public boolean isButtonDisplayed(By objeto, WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Validando si el objeto isDispayed()...");
        return driver.findElement(objeto).isDisplayed();
    }



    @AfterMethod
    public void afterMethod() throws InterruptedException {
        System.out.println("Cerrando navegador..");
        Thread.sleep(2000);
        driver.close();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("FIN DE LAS PRUEBAS SOBRE EL MODULO: AGENDAR ASESORIA");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("FIN DEL LAS DE PRUEBAS");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("--------------------     FIN DE LA EJECUCIÓN     --------------------------------");
        System.out.println("---------------------------------------------------------------------------------");
    }
}
