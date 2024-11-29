import TP.LimiteVisiteurException;
import TP.TypeAnimal;
import TP.Zoo;

public class AppTest {

    public void testNombreMaxOK(){
        Zoo zoo = new Zoo();
        zoo.ajouterSecteur(TypeAnimal.CHAT);
        Exception exc = null;

        try{
            zoo.nouveauVisiteur();
            zoo.nouveauVisiteur();
        }catch (LimiteVisiteurException e){
            exc = e;
        }

        assertNull(exc);
        System.out.println("Test 1 "+ exc);
    }
}
