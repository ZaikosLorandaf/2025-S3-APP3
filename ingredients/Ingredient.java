package ingredients;

import menufact.exceptions.NegativeQuantity;

/**
 * Cette classe est la classe mère pour les ingrédients du programme
 */
public class Ingredient {
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;
    private int quantity;

    /**
     *
     * @return Retourne le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom Modifie le nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return Retourne la description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description Modifife la description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return Retourne le type
     */
    public TypeIngredient getTypeIngredient() {
        return typeIngredient;
    }

    /**
     *
     * @param typeIngredient Modifie le type d'ingrédient
     */
    public void setTypeIngredient(TypeIngredient typeIngredient) {
        this.typeIngredient = typeIngredient;
    }

    /**
     *
     * @return Retourne la quantité disponible
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity Modifie la quantité de l'ingrédient
     * @throws NegativeQuantity Si le nombre est négatif, lance une exception
     */
    public void setQuantity(int quantity) throws NegativeQuantity {
        if (quantity < 0)
            throw new NegativeQuantity("Quantite d'ingredient: " + this.nom + " est insuffisante");
        this.quantity = quantity;
    }

    /**
     * Soustrait la quantité à celle disponible
     * @param quantity la quantité à enlever
     * @throws NegativeQuantity Si le nombre est négatif, lance une exception
     */
    public void substractIngredient(int quantity) throws NegativeQuantity {
        if (quantity < 0 || quantity > this.quantity)
            throw new NegativeQuantity("Quantite d'ingredient: " + this.nom + " est insuffisante");
        this.quantity -= quantity;
    }

    /**
     * Ajoute une quantité d'ingrédient
     * @param quantity Le nombre à ajouter
     */
    public void addIngredient(int quantity) {
        this.quantity += quantity;
    }

    @Override
    public String toString() {
        return "Ingredient {nom="+ nom + ", description=" + description + ", typeIngredient=" + typeIngredient + ", quantity=" + quantity + "}";
    }
}