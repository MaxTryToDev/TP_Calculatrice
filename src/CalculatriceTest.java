import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatriceTest {

    private Calculatrice calc;

    @BeforeEach
    public void setup() {
        calc = new Calculatrice();
    }

    @Test
    public void testAddition() {
        int resultat = calc.addition(10, 5);
        assertEquals(15, resultat, "L'addition de 10 et 5 devrait donner 15");
    }

    @Test
    public void testSoustraction() {
        int resultat = calc.soustraction(10, 5);
        assertEquals(5, resultat, "La soustraction de 10 et 5 devrait donner 5");
    }

    @Test
    public void testMultiplication() {
        int resultat = calc.multiplication(10, 5);
        assertEquals(50, resultat, "La multiplication de 10 et 5 devrait donner 50");
    }

    @Test
    public void testDivision() {
        double resultat = calc.division(10, 5);
        assertEquals(2, resultat, "La division de 10 et 5 devrait donner 2");
    }

}