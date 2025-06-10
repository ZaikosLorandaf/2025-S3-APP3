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
        } catch (NegativeQuantity e) {
            assertTrue(true);
        } catch (IngredientException e) {
            assertTrue(true);
        }

    }

    @Test
    void testSupprimer() throws IngredientException, NegativeQuantity {
        Ingredient legume = new Legume();
        Inventaire inventaire = new Inventaire();
        inventaire.nouveau(legume, 10);
        try {
            inventaire.supprimer(legume);
            assertTrue(true);
        } catch (IngredientException e) {
            fail();
        }
    }

    @Test
    void testSupprimerNull() throws IngredientException {
        Ingredient legume = new Legume();
        Inventaire inventaire = new Inventaire();
        try {
            inventaire.supprimer(legume);
            fail();
        } catch (IngredientException e) {
            assertTrue(true);
        }
    }

    @Test
    void testSetIngredient() throws IngredientException, NegativeQuantity {
        Ingredient legume = new Legume();
        Inventaire inventaire = new Inventaire();
        inventaire.nouveau(legume, 10);
        try {
            inventaire.setQuantity(legume, -1);
            fail();
        } catch (NegativeQuantity e) {
            assertTrue(true);
        }
    }

}