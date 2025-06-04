package menufact.facture.states;

import menufact.facture.Facture;
import menufact.facture.exceptions.FactureException;

public interface FactureState {

    /**
     * Cette fonction implémente le code abstrait de l'état payé
     */
    void paid(Facture facture);

    /**
     * Cette fonction implémente le code abstrait de l'état fermé
     */
    void close(Facture facture);

    /**
     * Cette fonction implémente le code abstrait de l'état ouvert
     */
    void open(Facture facture) throws FactureException;
}
