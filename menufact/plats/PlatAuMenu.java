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

    public PlatAuMenu(int code, String description, double prix) {
        this.code = code;
        this.description = description;
        this.prix = prix;
        ingredients = new IngredientIterator();
    }

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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void addIngredient(IngredientPlat ingredient) {
        ingredients.addIngredient(ingredient);
    }

    public IngredientIterator getIngredients() {
        return ingredients;
    }
}
