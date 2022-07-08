import org.testng.annotations.Test;

public class Agrupamiento {

    @Test(groups = { "Pruebas_Login" })
    public static void FirstTest()
    {
        System.out.println("pertenece al grupo: Pruebas_Login");
    }

    @Test(groups = { "Pruebas_Login" })
    public static void SecondTest()
    {
        System.out.println("pertenece al grupo: Pruebas_Login");
    }

    @Test
    public static void ThirdTest()
    {
        System.out.println("no pertenece al grupo: Pruebas_Login");
    }
}
