package menufact.plats.etats;

import menufact.plats.PlatChoisi;
import menufact.plats.PlatState;

/**
 * État de plat de type commande
 */
public class CommandeState implements PlatState {

    @Override
    public void treatement(PlatChoisi plat){
        System.out.println("CommandeState.treatement");
        plat.setEtat(new Preparation());
    }

    @Override
    public String toString(){
        return "Commande";
    }
}
