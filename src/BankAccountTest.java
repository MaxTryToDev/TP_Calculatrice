import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    public void setup() {
        account = new BankAccount("Maxime", 0);
    }

    // La création d’un compte avec un solde initial valide
    @Test
    public void testSoldeInitial() {
        double balance = account.getBalance();
        assertEquals(0, balance, "Le solde devrait être de 0");
    }

    // Le refus de création avec un solde initial négatif
    @Test
    public void testSoldeNegatif() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount("Maxime", -2);
        }, "Initial balance cannot be negative.");
    }

    // Le bon fonctionnement du dépôt d’argent
    @Test
    public void testDepotValide() {
        account.deposit(100);
        assertEquals(100, account.getBalance(), "Le solde devrait être de 100");
    }

    // Le refus de dépôt d’un montant négatif ou nul
    @Test
    public void testDepotInvalide() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(0);
        }, "Deposit amount must be positive.");

        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50);
        }, "Deposit amount must be positive.");
    }

    // Le retrait correct d’un montant disponible
    @Test
    public void testRetraitValide() {
        account.deposit(200);
        account.withdraw(50);
        assertEquals(150, account.getBalance(), "Le solde devrait être de 150 après retrait de 50.");
    }

    // Le refus de retrait supérieur au solde
    @Test
    public void testRetraitSuperieurAuSolde() {
        account.deposit(50);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(100);
        }, "Insufficient funds.");
    }

    // Le refus de retrait d’un montant négatif ou nul
    @Test
    public void testRetraitInvalide() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(0);
        }, "Withdrawal amount must be positive.");

        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-30);
        }, "Withdrawal amount must be positive.");
    }
}
