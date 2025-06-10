package menufact.plats.etats;

import menufact.plats.PlatChoisi;
import menufact.plats.PlatState;

/**
 * État de plat de type terminé
 */
public class Terminated implements PlatState {

    @Override
    public void treatement(PlatChoisi plat){
        System.out.println("Terminated");
        plat.setEtat(new Served());
    }

    @Override
    public String toString(){
        return "Termine";
    }
}
