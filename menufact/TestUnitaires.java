package menufact;

import ingredients.*;
import inventaire.Inventaire;

import javax.naming.InvalidNameException;

public class TestUnitaires {

    public static void main(String[] args) {
        Chef Marc = new Chef("Marc");
        ChefHandler.getInstance().addObserver(Marc);

        System.out.println("--------CHEFS----------");
        System.out.println(ChefHandler.getInstance());

        Ingredient steak = new Viande();
        steak.setNom("Steak");
        steak.setDescription("T Bone");

        Ingredient frite = new Legume();
        frite.setNom("Frite");
        frite.setDescription("Frite 200g");

        Ingredient salade = new Legume();
        salade.setNom("Salade");
        salade.setDescription("Salade cesar");

        Ingredient salde = IngredientFactory.getIngredient(TypeIngredient.LEGUME, "Salade", "Salde Cesar");

        try{
            Inventaire.getInstance().nouveau(steak, 3);
            Inventaire.getInstance().nouveau(frite, 10);
            Inventaire.getInstance().nouveau(salade, 10);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("--------INVENTAIRE----------");
        System.out.println(Inventaire.getInstance());

    }
}
