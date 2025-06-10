package ingredients;

import menufact.exceptions.NegativeQuantity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {

    @Test
    void setQTEIngredient() {
        Ingredient ingredient = new Ingredient();
        try {
            ingredient.setQuantity(1);
            assertEquals(1, ingredient.getQuantity());
        } catch (NegativeQuantity e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testNegQTE(){
        Ingredient ingredient = new Ingredient();
        try{
            ingredient.setQuantity(-1);
            fail();
        } catch (NegativeQuantity e) {
            assertTrue(true);
        }
    }

    @Test
    void testSubQTE(){
        Ingredient ingredient = new Ingredient();
        try {
            ingredient.setQuantity(10);
            ingredient.substractIngredient(10);
            assertEquals(0, ingredient.getQuantity());
        } catch (NegativeQuantity e) {
            fail(e.getMessage());
        }
    }

}