package inventaire;

import ingredients.Ingredient;

import java.util.ArrayList;

public class Inventaire {
    private ArrayList<Ingredient> lesIngredients = new ArrayList<Ingredient>();

    public void ajouter(Ingredient ingredient) {
        lesIngredients.add(ingredient);
    }

    public void supprimer(Ingredient ingredient, int quantity) {
        try {
            lesIngredients.get(lesIngredients.indexOf(ingredient)).substractIngredient(quantity);
        } catch (Exception e) {
            System.out.println("La qte d'ingredient: " + ingredient + " est insuffisante");
        }
    }

    public void ajouter(Ingredient ingredient, int quantity) {
        lesIngredients.get(lesIngredients.indexOf(ingredient)).addIngredient(quantity);
    }

    public void setQuantity(Ingredient ingredient, int quantity) {
        lesIngredients.get(lesIngredients.indexOf(ingredient)).setQuantity(quantity);
    }

}