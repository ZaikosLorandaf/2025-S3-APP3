package menufact;

import menufact.plats.PlatChoisi;
import menufact.plats.PlatException;

public interface Observer {

    void update(PlatChoisi platChoisi) throws PlatException;
}
