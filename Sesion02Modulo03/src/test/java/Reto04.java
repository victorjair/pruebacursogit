import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Reto04 {
    //Creación del objecto SoftAssert
    SoftAssert obj_softAssert = new SoftAssert();

    @Test(priority=1)
    public void test1() {
        obj_softAssert.assertEquals(true, false);

    }



}
