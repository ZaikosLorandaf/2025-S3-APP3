package ingredients;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Cette classe créer une itération pour les ingrédients
 */
public class IngredientIterator implements Iterable<IngredientPlat> {

    ArrayList<IngredientPlat> ingredients = new ArrayList<>();

    /**
     * Ajoute un ingrédient dans la liste
     * @param ingredient l'ingrédient à ajouter
     */
    public void addIngredient(IngredientPlat ingredient) {
        ingredients.add(ingredient);
    }

    /**
     * Redonne l'itérateur
     * @return l'itérateur de la liste
     */
    @Override
    public Iterator<IngredientPlat> iterator() {
        return ingredients.iterator();
    }

    @Override
    public String toString() {
        return ingredients.toString();
    }
}
