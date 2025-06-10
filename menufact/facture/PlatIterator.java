package menufact.facture;

import menufact.plats.PlatChoisi;

import java.util.ArrayList;
import java.util.Iterator;

public class PlatIterator implements Iterable<PlatChoisi> {

    private ArrayList<PlatChoisi> plats = new ArrayList<>();

    public void add(PlatChoisi plat) {
        plats.add(plat);
    }
    @Override
    public Iterator<PlatChoisi> iterator() {
        return plats.iterator();
    }

    @Override
    public String toString() {
        return plats.toString();
    }
}
