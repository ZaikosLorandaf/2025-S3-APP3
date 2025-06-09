package ingredients;

import menufact.exceptions.NegativeQuantity;

public class Ingredient {
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;
    private int quantity;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeIngredient getTypeIngredient() {
        return typeIngredient;
    }

    public void setTypeIngredient(TypeIngredient typeIngredient) {
        this.typeIngredient = typeIngredient;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws NegativeQuantity {
        if (quantity < 0)
            throw new NegativeQuantity("Quantite d'ingredient: " + this.nom + " est insuffisante");
        this.quantity = quantity;
    }

    public void substractIngredient(int quantity) throws NegativeQuantity {
        if (quantity < 0)
            throw new NegativeQuantity("Quantite d'ingredient: " + this.nom + " est insuffisante");
        this.quantity -= quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }
}