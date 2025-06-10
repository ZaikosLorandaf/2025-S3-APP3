package menufact.plats;

import ingredients.Fruit;
import ingredients.Ingredient;
import ingredients.IngredientPlat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlatAuMenuTest {
    @Test
    void testAjoutIngredient() {
        PlatAuMenu menu = new PlatAuMenu();
        Ingredient tomate = new Fruit();
        IngredientPlat soupe = new IngredientPlat(tomate, 10);
        try {
            menu.addIngredient(soupe);
            assertTrue(true);
        } catch (Exception e) {
            fail();
        }
    }
}