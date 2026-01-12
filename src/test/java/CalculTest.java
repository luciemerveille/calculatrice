import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculTest {
    // je test la methode  pour la somme
    @Test
    void TestAdd(){
        Calcul calc = new Calcul();
        assertEquals(5, calc.Somme(2, 3));
    }

    // je test la methode  pour la difference
    @Test
    void TestDif(){
        Calcul calc = new Calcul();
        assertEquals(1,calc.Difference(3,3));
    }

    @Test
    void TestPro(){
        Calcul calcul = new Calcul();
        assertEquals(4,calcul.Multiplication(2,2));
    }

    // implemente la methode pour la division

    @Test
    void TestDiv(){
        // implemente le test unitaire
        Calcul calcul = new Calcul();
        assertEquals(1,calcul.Division(2,2));
    }




}