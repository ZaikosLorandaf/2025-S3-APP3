package menufact.plats.etats;

import menufact.plats.PlatChoisi;
import menufact.plats.PlatState;

public class Preparation implements PlatState {
    @Override
    public void treatement(PlatChoisi plat){
        System.out.println("Preparation");
        plat.setEtat(new Terminated());
    }

    @Override
    public String toString(){
        return "Preparation";
    }
}
