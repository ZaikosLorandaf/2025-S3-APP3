package ingredients;

public class IngredientPlat {
    private Ingredient ingredient;
    private int quantity;

    public IngredientPlat(Ingredient ingredient, int quantity) {
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "IngredientPlat : {" + ingredient + " " + quantity+ "}";
    }
}
