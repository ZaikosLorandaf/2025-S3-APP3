package menufact.plats.etats;

import menufact.plats.PlatChoisi;
import menufact.plats.PlatState;

public class ErrorState implements PlatState {

    @Override
    public void treatement(PlatChoisi plat){
        System.out.println("ErrorState: treatement");
    }

    @Override
    public String toString(){
        return "Error";
    }
}
