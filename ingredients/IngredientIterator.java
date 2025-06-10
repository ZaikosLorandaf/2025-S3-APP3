package ingredients;

import java.util.ArrayList;
import java.util.Iterator;

public class IngredientIterator implements Iterable<Ingredient> {

    ArrayList<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public Iterator<Ingredient> iterator() {
        return ingredients.iterator();
    }

    @Override
    public String toString() {
        return ingredients.toString();
    }
}
