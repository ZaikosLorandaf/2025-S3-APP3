package menufact;

import menufact.plats.PlatChoisi;

import java.util.ArrayList;
import java.util.List;

public class ChefHandler {

    private List<Observer> observers = new ArrayList<Observer>();

    private PlatChoisi platChoisi;

    private static ChefHandler instance = null;

    public static ChefHandler getInstance() {
        if (instance == null) {
            instance = new ChefHandler();
        }
        return instance;
    }

    public void setPlatChoisi(PlatChoisi platChoisi) {
        this.platChoisi = platChoisi;
        notifyObservers();

    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(platChoisi);
        }
    }

    @Override
    public String toString() {
        return observers.toString();
    }
}
