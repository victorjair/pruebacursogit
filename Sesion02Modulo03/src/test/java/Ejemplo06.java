import org.testng.Assert;
import org.testng.annotations.Test;

public class Ejemplo06 {
    @Test(priority=1)
    public void test1() {

        System.out.println("Se abre Google Chrome");

        //Hard Assert
        Assert.assertEquals(true, false); // Esto retorna error ya que no coincide -> true <> false

        //Esta linea no se ejecutará
        System.out.println("Se abre la pagina");
    }

    @Test(priority=2)
    public void test2() {

        System.out.println("Se abre el Firefox");

        // Esto retorna error ya la condicion es un boolean false
        Assert.assertTrue(false, "hard assert");  //Nota: en assertTrue los mensajes solo se imprimen cuando la asercion falla

        //Esta linea tampoco ejecutara
        System.out.println("Se abre la pagina 2");
    }
}
