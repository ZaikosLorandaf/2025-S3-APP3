package menufact;

import ingredients.*;
import inventaire.Inventaire;
import menufact.facture.Facture;
import menufact.facture.FactureController;
import menufact.facture.FactureView;
import menufact.facture.exceptions.FactureException;
import menufact.plats.*;

import javax.naming.InvalidNameException;

public class TestUnitaires {

    public static void main(String[] args) {
        Chef Marc = new Chef("Marc");
        ChefHandler.getInstance().addObserver(Marc);

        System.out.println("--------CHEFS----------");
        System.out.println(ChefHandler.getInstance());

        Ingredient steak = IngredientFactory.getIngredient(TypeIngredient.VIANDE, "T BONE", "Steak de boeuf");

        Ingredient frite = IngredientFactory.getIngredient(TypeIngredient.LEGUME, "Frites", "Frites 200g");

        Ingredient salade = IngredientFactory.getIngredient(TypeIngredient.LEGUME, "Salade", "Salde Cesar");

        try{
            Inventaire.getInstance().nouveau(steak, 3);
            Inventaire.getInstance().nouveau(frite, 3);
            Inventaire.getInstance().nouveau(salade, 10);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("--------INVENTAIRE----------");
        System.out.println(Inventaire.getInstance());


        PlatSante saladeCesar = new PlatSante(1, "Salade CESART", 8.5, 200, 3, 55);

        PlatEnfant fritesSalade = new PlatEnfant(2, "FRITE ET SALADE", 10, 3);

        PlatAuMenu steakFriteSalade= new PlatAuMenu(3, "STEAK TRIO", 20);

        steakFriteSalade.addIngredient(new IngredientPlat(frite,3));
        steakFriteSalade.addIngredient(new IngredientPlat(salade, 2));
        steakFriteSalade.addIngredient(new IngredientPlat(steak,1));

        Menu.getSingleton("MENU").ajoute(steakFriteSalade);
        Menu.getSingleton("MENU").ajoute(saladeCesar);
        Menu.getSingleton("MENU").ajoute(fritesSalade);

        System.out.println("-------------MENU-------------------");
        System.out.println(Menu.getSingleton(""));

        Client client = new Client(2020, "SARAH", "999999999");
        System.out.println("-------------CLIENT-------------------");
        System.out.println(client);

        FactureController facController = new FactureController(new Facture("TEST"), new FactureView());

        facController.setClient( client);
        System.out.println("-------------FACTURE-CONTROLLER-----------");
        facController.displayFacture();

        try {
            facController.addPlat(new PlatChoisi.PlatChoisiBuilder().setPlat(steakFriteSalade).setQuantite(1).build());
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("-----------TRAITER LA COMMANDE-----------");
        try {
            Marc.traiter();
            System.out.println(Marc);
            Marc.traiter();
            System.out.println(Marc);
        } catch (PlatException e) {
            System.out.println(e);
        }

        System.out.println("-------------INVENTAIRE FINAL---------------");
        System.out.println(Inventaire.getInstance());


        facController.displayFacture();


    }
}
