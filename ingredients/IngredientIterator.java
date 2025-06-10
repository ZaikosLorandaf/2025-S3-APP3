package ingredients;

import java.util.ArrayList;
import java.util.Iterator;

public class IngredientIterator implements Iterable<IngredientPlat> {

    ArrayList<IngredientPlat> ingredients = new ArrayList<>();

    public void addIngredient(IngredientPlat ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public Iterator<IngredientPlat> iterator() {
        return ingredients.iterator();
    }

    @Override
    public String toString() {
        return ingredients.toString();
    }
}
