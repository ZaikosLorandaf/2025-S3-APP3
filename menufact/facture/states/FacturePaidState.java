package menufact.facture.states;

import menufact.facture.Facture;
import menufact.facture.exceptions.FactureException;

public class FacturePaidState  implements FactureState {

    @Override
    public void paid(Facture facture) {

    }

    @Override
    public void close(Facture facture) {

    }

    @Override
    public void open(Facture facture) throws FactureException {
        throw new FactureException("La facture ne peut pas être réouverte");
    }
}
