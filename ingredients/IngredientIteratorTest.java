package ingredients;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientIteratorTest {

    @Test
    void insertTest() {
        IngredientPlat p = new IngredientPlat(null, 0);
        IngredientIterator it = new IngredientIterator();

        it.addIngredient(p);

        Assertions.assertEquals(it.iterator().next(), p);
    }




}