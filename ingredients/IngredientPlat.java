package ingredients;

/**
 * Cette classe liste les quantités requises pour un plat contenant des ingrédients
 */
public class IngredientPlat {
    private Ingredient ingredient;
    private int quantity;

    /**
     * Cette classe est utilisé pour lister la quantité requise d'un ingrédient dans un plat
     * @param ingredient l'ingrédient modèle
     * @param quantity la quantité dans le plat
     */
    public IngredientPlat(Ingredient ingredient, int quantity) {
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    /**
     *
     * @return l'ingrédient
     */
    public Ingredient getIngredient() {
        return ingredient;
    }

    /**
     *
     * @return la quantité requise du plat
     */
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "IngredientPlat : {" + ingredient + " " + quantity+ "}";
    }
}
