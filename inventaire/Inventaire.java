package inventaire;

import ingredients.Ingredient;
import ingredients.exceptions.IngredientException;
import menufact.exceptions.NegativeQuantity;

import java.util.ArrayList;

public class Inventaire {
    private ArrayList<Ingredient> lesIngredients = new ArrayList<Ingredient>();

    private static Inventaire instance = null;

    public static Inventaire getInstance() {
        if (instance == null) {
            instance = new Inventaire();
        }
        return instance;
    }

    public void nouveau(Ingredient ingredient) throws IngredientException {
        if (lesIngredients.contains(ingredient))
            throw new IngredientException("L'ingredient " + ingredient + " existe deja");
        lesIngredients.add(ingredient);
    }

    public void nouveau(Ingredient ingredient, int quantity) throws IngredientException, NegativeQuantity {
        if (lesIngredients.contains(ingredient)) {
            lesIngredients.get(lesIngredients.indexOf(ingredient)).addIngredient(quantity);
            throw new IngredientException("L'ingredient " + ingredient + " existe deja");
        }
        lesIngredients.add(ingredient);
        lesIngredients.get(lesIngredients.indexOf(ingredient)).setQuantity(quantity);
    }

    public void supprimer(Ingredient ingredient) throws IngredientException {
        if (!lesIngredients.contains(ingredient))
            throw new IngredientException("L'ingredient " + ingredient + " n'existe pas");
        lesIngredients.remove(ingredient);
    }


    public void retirer(Ingredient ingredient, int quantity) throws NegativeQuantity {
        lesIngredients.get(lesIngredients.indexOf(ingredient)).substractIngredient(quantity);
    }

    public void ajouter(Ingredient ingredient, int quantity) {
        lesIngredients.get(lesIngredients.indexOf(ingredient)).addIngredient(quantity);
    }

    public void setQuantity(Ingredient ingredient, int quantity) throws NegativeQuantity {
        lesIngredients.get(lesIngredients.indexOf(ingredient)).setQuantity(quantity);
    }

    public int getQuantity(Ingredient ingredient) {
        return lesIngredients.get(lesIngredients.indexOf(ingredient)).getQuantity();
    }

    @Override
    public String toString() {
        return lesIngredients.toString();
    }

}