package menufact.plats.Etats;

import menufact.plats.PlatChoisi;
import menufact.plats.PlatState;

public class ErrorState implements PlatState {

    @Override
    public void treatement(PlatChoisi plat){

    }

    @Override
    public String toString(){
        return "Error";
    }
}
