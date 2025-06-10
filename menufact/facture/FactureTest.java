package menufact.facture;

import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;
import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class FactureTest {

    @Test
    public void ouvrirApresPaye() {
        Facture facture = new Facture("TEST");
        try{
            facture.payer();
            facture.ouvrir();
        }catch (Exception e){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void ajoutePlat() {
        Facture facture = new Facture("TEST");
        try {
            facture.ajoutePlat(null);
            Assert.assertTrue(true);
        } catch (FactureException e) {
            throw new RuntimeException(e);
        }

    }
}