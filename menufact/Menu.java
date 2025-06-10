package menufact;

import menufact.exceptions.MenuException;
import menufact.plats.PlatAuMenu;

import java.util.ArrayList;

/**
 * Cette classe gère l'affichage des plats au menu
 */
public class Menu {
    private static Menu singleton;
    private String description;
    private int courant;
    private ArrayList<PlatAuMenu> plat = new ArrayList<PlatAuMenu>();

    /**
     * Cette classe Créer un menu pour afficher les plats
     * @param description
     * @param courant
     */
    private Menu(String description, int courant) {
        this.description = description;
    }

    private Menu(){
        courant = -1;
    }

    /**
     * Fabrique et retourne une instance de menu (singleton)
     * @param description la description du menu
     * @return l'instance de Menu
     */
    public static Menu getSingleton(String description) {
       if (singleton == null)
           singleton = new Menu(description, -1);
       return singleton;
   }

    /**
     * Ajoute un plat au menu
     * @param p Le plat
     */
    void ajoute(PlatAuMenu p) {
        plat.add(p);
    }

    /**
     * Change la position de l'itération
     * @param i la nouvelle position
     */
    public void position(int i) {
        courant = i;
    }

    /**
     * Donne le plat courant
     * @return Le plat courant
     */
    public PlatAuMenu platCourant() {
        return plat.get(courant);
    }

    /**
     * Change la position du plat courant
     * @throws MenuException Si le courant dépasse la taille du tableau, lance une exception
     */
    public void positionSuivante() throws MenuException {
        if (courant + 1 >= plat.size())
            throw new MenuException("On depasse le nombre maximale de plats.");
        else
            courant++;
    }

    /**
     * Change la position du plat courant
     * @throws MenuException si le courant est négatif, lance une exception
     */
    public void positionPrecedente() throws MenuException {
        if (courant - 1 < 0)
            throw new MenuException("On depasse le nombre minimale de plats");
        else
            courant--;
    }

    @Override
    public String toString() {
        return "menufact.Menu{" +
                "description='" + description + '\'' +
                ", courant=" + courant +
                ", plat=" + "\n" + plat +
                '}';
    }
}
