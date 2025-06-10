package inventaire;

import ingredients.Ingredient;
import ingredients.Legume;
import ingredients.exceptions.IngredientException;
import menufact.exceptions.NegativeQuantity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class InventaireTest {

    @Test
    void testNouveauPos() throws NegativeQuantity {
        Ingredient legume = new Legume();
        Inventaire inventaire = new Inventaire();
        try {
            inventaire.nouveau(legume, 10);
            assertTrue(true);
        } catch (IngredientException e) {
            fail();
        }

    }

    @Test
    void testNouveauNeg() throws NegativeQuantity {
        Ingredient legume = new Legume();
        Inventaire inventaire = new Inventaire();
        try {
            inventaire.nouveau(legume, -2);
            fail();
        } catch (IngredientException e) {
            assertTrue(true);
        }

    }
}