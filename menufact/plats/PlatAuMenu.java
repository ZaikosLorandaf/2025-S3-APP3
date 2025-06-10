package menufact.plats;

import ingredients.Ingredient;
import ingredients.IngredientIterator;
import ingredients.IngredientPlat;

import java.util.Iterator;

public class PlatAuMenu {
    private int code;
    private String description;
    private double prix;
    private IngredientIterator ingredients;

    /**
     * Cette classe est utilisé pour afficher les plats au menu (classe mère)
     * @param code Code de plat
     * @param description Description du plat
     * @param prix Prix du plat
     */
    public PlatAuMenu(int code, String description, double prix) {
        this.code = code;
        this.description = description;
        this.prix = prix;
        ingredients = new IngredientIterator();
    }

    /**
     * Constructeur par défault
     */
    public PlatAuMenu() {
        ingredients = new IngredientIterator();
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                "}\n";
    }

    /**
     *
     * @return Le code
     */
    public int getCode() {
        return code;
    }

    /**
     *
     * @param code Le nouveau code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     *
     * @return La description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Modifie la description
     * @param description la nouvelle descirption
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return Le prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Modifie le prix
     * @param prix Le nouveau prix
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * Ajoute des ingrédients au plat
     * @param ingredient l'ingrédient
     */
    public void addIngredient(IngredientPlat ingredient) {
        ingredients.addIngredient(ingredient);
    }

    /**
     * Retourne l'itérateur
     * @return l'itérateur
     */
    public IngredientIterator getIngredients() {
        return ingredients;
    }
}
