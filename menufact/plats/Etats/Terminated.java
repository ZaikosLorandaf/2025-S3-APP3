package menufact.plats.Etats;

import menufact.plats.PlatChoisi;
import menufact.plats.PlatState;

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
