package inventaire;

import ingredients.Ingredient;
import ingredients.exceptions.IngredientException;
import menufact.exceptions.NegativeQuantity;

import java.util.ArrayList;

/**
 * Cette classe gère l'inventaire des ingrédients
 */
public class Inventaire {
    private ArrayList<Ingredient> lesIngredients = new ArrayList<Ingredient>();

    private static Inventaire instance = null;

    /**
     * Fabrique ou retourne l'instance de la classe (singleton)
     * @return Retourne l'instance
     */
    public static Inventaire getInstance() {
        if (instance == null) {
            instance = new Inventaire();
        }
        return instance;
    }

    /**
     * Ajoute un ingrédient dans l'inventaire
     * @param ingredient l'ingrédient à ajouter
     * @throws IngredientException Si l'ingrédient est dans la liste, lance une exception.
     */
    public void nouveau(Ingredient ingredient) throws IngredientException {
        if (lesIngredients.contains(ingredient))
            throw new IngredientException("L'ingredient " + ingredient + " existe deja");
        lesIngredients.add(ingredient);
    }

    /**
     * Ajoute un ingrédient dans la liste
     * @param ingredient l'ingrédient à ajouter
     * @param quantity la quantité
     * @throws IngredientException Si l'ingrédient est dans la liste, lance une exception
     * @throws NegativeQuantity Si la quantité est négative, lance une exception
     */
    public void nouveau(Ingredient ingredient, int quantity) throws IngredientException, NegativeQuantity {
        if (lesIngredients.contains(ingredient)) {
            lesIngredients.get(lesIngredients.indexOf(ingredient)).addIngredient(quantity);
            throw new IngredientException("L'ingredient " + ingredient + " existe deja");
        }
        lesIngredients.add(ingredient);
        lesIngredients.get(lesIngredients.indexOf(ingredient)).setQuantity(quantity);
    }

    /**
     * Supprime un élément de la liste
     * @param ingredient l'ingrédient à supprimer
     * @throws IngredientException Si l'ingrédient n'est pas dans la liste, lance une exception.
     */
    public void supprimer(Ingredient ingredient) throws IngredientException {
        if (!lesIngredients.contains(ingredient))
            throw new IngredientException("L'ingredient " + ingredient + " n'existe pas");
        lesIngredients.remove(ingredient);
    }

    /**
     * Retire la quantité d'un ingrédient
     * @param ingredient l'ingrédient affecté
     * @param quantity La quantité à retirer
     * @throws NegativeQuantity Si la quantité est négative, lance une exception.
     */
    public void retirer(Ingredient ingredient, int quantity) throws NegativeQuantity {
        lesIngredients.get(lesIngredients.indexOf(ingredient)).substractIngredient(quantity);
    }

    /**
     * Ajoute une quantité d'ingrédient dans l'inventaire
     * @param ingredient l'ingrédient affecté
     * @param quantity La quantité à ajouter
     */
    public void ajouter(Ingredient ingredient, int quantity) {
        lesIngredients.get(lesIngredients.indexOf(ingredient)).addIngredient(quantity);
    }

    /**
     * Force une quantité dans l'inventaire
     * @param ingredient l'ingredient affecté
     * @param quantity la quantité à forcer
     * @throws NegativeQuantity si la quantité est négative, lance une exception
     */
    public void setQuantity(Ingredient ingredient, int quantity) throws NegativeQuantity {
        lesIngredients.get(lesIngredients.indexOf(ingredient)).setQuantity(quantity);
    }

    /**
     * Donne la quantité d'ingrédient
     * @param ingredient L'ingrédient concerné
     * @return La quantité
     */
    public int getQuantity(Ingredient ingredient) {
        return lesIngredients.get(lesIngredients.indexOf(ingredient)).getQuantity();
    }

    @Override
    public String toString() {
        return lesIngredients.toString();
    }

}