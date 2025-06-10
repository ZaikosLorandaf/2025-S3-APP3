package menufact;

import menufact.plats.PlatChoisi;
import menufact.plats.PlatException;

public class Chef implements Observer {

    private String name;

    private PlatChoisi plat;

    public Chef(String name) {
        this.name = name;
        this.plat = null;
    }

    @Override
    public void update(PlatChoisi platChoisi) throws PlatException {
        System.out.println("Chef update");
        this.plat = platChoisi;
        traiter();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void traiter() throws PlatException {
        if(plat == null){ return; }

        plat.treated();
    }

    public PlatChoisi getPlat() {return plat;}

    @Override
    public String toString() {
        if(plat == null) {
            return "Chef{" + "name=" + name + ", plat=" + "aucun" + '}';
        }else{
            return "Chef{" + "name=" + name + ", plat=" + plat.toString() + '}';
        }

    }



}
