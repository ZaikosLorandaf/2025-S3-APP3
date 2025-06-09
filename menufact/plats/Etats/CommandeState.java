package menufact.plats.Etats;

import menufact.plats.PlatChoisi;
import menufact.plats.PlatState;

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
