package menufact.facture;

import org.junit.jupiter.api.Test;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;
import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.jupiter.api.Assertions.*;

public class FactureTest {

    @Test
    public void ouvrirApresPaye() {
        Facture facture = new Facture("TEST");
        try{
            facture.payer();
            facture.ouvrir();
        }catch (Exception e){
            assertTrue(true);
        }
    }

    @Test
    public void ajoutePlat() {
        Facture facture = new Facture("TEST");
        try {
            facture.ajoutePlat(null);
            assertTrue(true);
        } catch (FactureException e) {
            fail();
        }
    }
}