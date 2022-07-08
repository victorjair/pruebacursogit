import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Ejemplo06Soft {
    //Creación del objecto SoftAssert
    SoftAssert obj_softAssert = new SoftAssert();

    @Test(priority=1)
    public void test1() {
        System.out.println("Se abre Google Chrome");

        //soft Assert
        obj_softAssert.assertEquals(true, false); // Esto retorna error ya que no coincide -> true <> false

        //Esta linea no se ejecutará
        System.out.println("Se abre la pagina");

        //assertAll en las softAssert se usa para lanzar las excepciones capturadas.
        obj_softAssert.assertAll();
    }

    @Test(priority=2)
    public void test2() {
        System.out.println("Se abre el Firefox");

        // Esto retorna error ya la condicion es un boolean false
        obj_softAssert.assertTrue(false, "soft assert");  //Nota: en assertTrue los mensajes solo se imprimen cuando la asercion falla

        //Esta linea tampoco ejecutara
        System.out.println("Se abre la pagina 2");

        //assertAll en las softAssert se usa para lanzar las excepciones capturadas.
        obj_softAssert.assertAll();
    }

}
