import javafx.scene.layout.Priority;
import org.testng.annotations.*;

public class BaseTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("El método anotado con @BeforeSuite se ejecutará antes de que se hayan ejecutado todas las pruebas de la suite.");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("El método anotado con @BeforeTest se ejecutará antes de que se ejecute cualquier método de prueba que pertenezca a una clase.");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("El método anotado con @BeforeClass se ejecutará una vez antes de que se invoque el primer método de prueba en la clase actual.");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("El método anotado con @BeforeMethod se ejecutará antes de que se ejecute cualquier método de prueba dentro de una clase.");
    }

    /*@Test
    public void test() {
        System.out.println("El método anotado con @Test es el método de prueba principal en todo el programa. Se ejecutarán otros métodos anotados en torno a este método.");
    }*/

    @Test(priority=2)
    public static void PrimeraPrueba()
    {
        System.out.println("Este es el SEGUNDO caso de prueba porque la prioridad = 2");
    }

    @Test(priority=1,enabled = false)
    public static void SegundaPrueba()
    {
        System.out.println("Este es el PRIMER caso de prueba porque la prioridad = 1 pero esta deshabilitado asi que no se ejecuta");
    }

    @Test(priority =3)
    public static void Prueba()
    {
        System.out.println("Este es el último caso de prueba porque no tiene prioridad");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("El método anotado con @AfterMethod se ejecutará después de que se ejecute cada método de prueba dentro de una clase.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("El método anotado con @AfterClass se ejecutará una vez después de que se hayan ejecutado todos los métodos de prueba de la clase actual.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("El método anotado con @AfterTest se ejecutará después de que se hayan ejecutado todos los métodos de prueba que pertenecen a una clase.");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("El método anotado con @AfterSuite se ejecutará después de que se hayan ejecutado todas las pruebas de la suite.");
    }
}
