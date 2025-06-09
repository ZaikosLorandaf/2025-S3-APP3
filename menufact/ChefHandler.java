package menufact;

import menufact.plats.PlatChoisi;

import java.util.ArrayList;
import java.util.List;

public class ChefHandler {

    private List<Observer> observers = new ArrayList<Observer>();

    private PlatChoisi platChoisi;

    public void setPlatChoisi(PlatChoisi platChoisi) {
        this.platChoisi = platChoisi;

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
}
