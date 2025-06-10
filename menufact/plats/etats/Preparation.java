package menufact.plats.etats;

import ingredients.Ingredient;
import ingredients.IngredientPlat;
import inventaire.Inventaire;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatState;

/**
 * État de plat de type Preparation
 */
public class Preparation implements PlatState {
    @Override
    public void treatement(PlatChoisi plat){
        System.out.println("Preparation");
        for(IngredientPlat ing : plat.getPlat().getIngredients()){
            if(Inventaire.getInstance().getQuantity(ing.getIngredient()) < ing.getQuantity()*plat.getQuantite()){
                //Pas assez d'ingrédient
                plat.setEtat(new ErrorState());
                return;
            }
        }


        for(IngredientPlat ing : plat.getPlat().getIngredients()){
            try{
                Inventaire.getInstance().retirer(ing.getIngredient(), ing.getQuantity()*plat.getQuantite());

            }catch(Exception e){
                e.printStackTrace();
            }
        }

        plat.setEtat(new Terminated());
    }

    @Override
    public String toString(){
        return "Preparation";
    }
}
