package ingredients;

import menufact.exceptions.NegativeQuantity;

public class IngredientFactory {

    /**
     * Cette fonction créer un modèle de base pour les ingrédients
     * @param type Type d'ingrédient
     * @param name Nom de l'ingrédient
     * @param description Description
     * @return Retourne une instance de l'ingrédient
     */
    public static Ingredient getIngredient(TypeIngredient type, String name, String description) {
        Ingredient ingredient;
        switch (type) {
            case EPICE:
                ingredient = new Epice();
                break;
            case VIANDE:
                ingredient = new Viande();
                break;
            case LAITIER:
                ingredient = new Laitier();
                break;
            case LEGUME:
                ingredient = new Legume();
                break;
            case FRUIT:
                ingredient = new Fruit();
                break;
            default:
                ingredient = new Ingredient();
                break;
        }

        ingredient.setNom(name);
        ingredient.setDescription(description);
        return ingredient;
    }
}
