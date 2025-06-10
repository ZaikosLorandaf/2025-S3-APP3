package menufact;

import menufact.plats.PlatChoisi;
import menufact.plats.PlatException;

/**
 * Classe abstraite pour les observer.
 */
public interface Observer {

    void update(PlatChoisi platChoisi) throws PlatException;
}
