package menufact;

import menufact.plats.PlatChoisi;
import menufact.plats.PlatException;

import java.util.ArrayList;
import java.util.List;

public class ChefHandler {

    private List<Observer> observers = new ArrayList<Observer>();

    private PlatChoisi platChoisi;

    private static ChefHandler instance = null;

    /**
     * Créer une instance et retourne celle-ci (singleton)
     * @return Instance de ChefHandler
     */
    public static ChefHandler getInstance() {
        if (instance == null) {
            instance = new ChefHandler();
        }
        return instance;
    }

    /**
     * Place un nouveau plat à être fait
     * @param platChoisi Le plat affecté
     * @throws PlatException Si le plat est null, retourne une exception
     */
    public void setPlatChoisi(PlatChoisi platChoisi) throws PlatException {
        this.platChoisi = platChoisi;
        notifyObservers();

    }

    /**
     * Ajoute un chef a la lecture
     * @param observer le chef
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Retire un chef à la liste
     * @param observer le chef affecté
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifie les chefs qu'un plat est choisi.
     * @throws PlatException Si le plat est null, retourne une exception
     */
    public void notifyObservers() throws PlatException {
        for (Observer observer : observers) {
            observer.update(platChoisi);
        }
    }

    @Override
    public String toString() {
        return observers.toString();
    }
}
