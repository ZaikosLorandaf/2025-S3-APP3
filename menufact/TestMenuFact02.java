package menufact;

import ingredients.*;
import inventaire.Inventaire;
import menufact.facture.Facture;
import menufact.facture.FactureController;
import menufact.facture.FactureView;
import menufact.facture.exceptions.FactureException;
import menufact.plats.*;

public class TestMenuFact02 {

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

        fritesSalade.addIngredient(new IngredientPlat(frite,2));
        fritesSalade.addIngredient(new IngredientPlat(salade,1));

        saladeCesar.addIngredient(new IngredientPlat(salade,2));

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

        System.out.println("-------------INVENTAIRE FINAL 1---------------");
        System.out.println(Inventaire.getInstance());


        System.out.println("-----------ESSAIE PLAT AVEC MANQUE D'INGREG ----------");

        try {
            facController.addPlat(new PlatChoisi.PlatChoisiBuilder().setPlat(fritesSalade).setQuantite(1).build());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Marc.traiter();
            System.out.println(Marc);
            Marc.traiter();
            System.out.println(Marc);
        } catch (PlatException e) {
            System.out.println(e);
        }

        System.out.println("------ESSAIE AJOUTER QTE NEG-------------------");
        try{
            Inventaire.getInstance().setQuantity(frite, -1);
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println("-----------ESSAIE PLAT SANTE ----------");

        try {
            facController.addPlat(new PlatChoisi.PlatChoisiBuilder().setPlat(saladeCesar).setQuantite(3).build());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Marc.traiter();
            System.out.println(Marc);
            Marc.traiter();
            System.out.println(Marc);
        } catch (PlatException e) {
            System.out.println(e);
        }

        System.out.println("-------------INVENTAIRE FINAL 2---------------");
        System.out.println(Inventaire.getInstance());

        System.out.println("-------FERMER LA FACTURE -------");

        facController.displayFacture();
        System.out.println("-------------FACTURE ETAT FINAL---------------");

        facController.fermerFacture();
        facController.displayFacture();

        System.out.println("-------PAYER LA FACTURE-------");
        facController.payeFacture();
        System.out.println(facController.genererFacture());

        System.out.println("-------OUVERTURE DE FACTURE PAYE-------------");
        try {
            facController.ouvrirFacture();
        } catch (FactureException e) {
            System.out.println(e);
        }


    }


}
