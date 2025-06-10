package menufact;

import menufact.plats.PlatChoisi;
import menufact.plats.PlatException;

public class Chef implements Observer {

    private String name;

    private PlatChoisi plat;

    /**
     * Cette classe créer un chef (observer) pour faire les plats
     * @param name le nom du chef
     */
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


    /**
     *
     * @return Le nom
     */
    public String getName() {
        return name;
    }

    /**
     * Modifie le nom
     * @param name nouveau nom
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Traite la commande
     * @throws PlatException Si le plat est null, lance une exception
     */
    public void traiter() throws PlatException {
        if(plat == null){ return; }

        plat.treated();
    }

    /**
     *
     * @return Le plat
     */
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
