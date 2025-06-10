package menufact.facture;

import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;

public class FactureController {
    Facture facture;
    FactureView factureView;

    public FactureController(Facture modele, FactureView modeleView) {
        this.facture = modele;
        this.factureView = modeleView;
    }

    public void displayFacture() {
        factureView.printFactureDetails(facture);

    }

    public void setClient(Client client) {
        facture.associerClient(client);

    }

    public void addPlat(PlatChoisi plat) throws FactureException {
        facture.ajoutePlat(plat);
    }

    public Facture getFacture() {
        return facture;
    }

    public String genererFacture() {
        return facture.genererFacture();
    }
}
