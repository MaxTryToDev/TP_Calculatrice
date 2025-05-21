import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @BeforeEach
    public void setup() {
        ShoppingCart shoppingCart = new ShoppingCart();
    }
/*
    //Création d’un panier vide
    @Test
    public void testPanierVide() {
        Product product = new Product("Disque", 10);
        assertEquals(0, balance, "Le solde devrait être de 0");
    }

 */
    //Ajout de produits
    //Total du panier correct après ajout
    //Gestion des cas limites :
    //addProduct(null) → exception attendue
    //Product avec prix négatif → exception attendue
    //Vider le panier
}
