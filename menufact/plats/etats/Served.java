package menufact.plats.etats;

import menufact.plats.PlatChoisi;
import menufact.plats.PlatState;

/**
 * État de plat de type servi
 */
public class Served implements PlatState {

    @Override
    public void treatement(PlatChoisi plat){
        System.out.println("Served");
        plat.setEtat(null);
    }

    @Override
    public String toString(){
        return "Served";
    }
}
