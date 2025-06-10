package menufact.facture;

import menufact.ChefHandler;
import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatException;

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

    public void addPlat(PlatChoisi plat) throws FactureException, PlatException {
        facture.ajoutePlat(plat);
        ChefHandler.getInstance().setPlatChoisi(plat);
    }

    public Facture getFacture() {
        return facture;
    }

    public void fermerFacture() {
        facture.fermer();
    }

    public void payeFacture() {
        facture.payer();
    }

    public void ouvrirFacture() throws FactureException {
        facture.ouvrir();
    }

    public String genererFacture() {
        return facture.genererFacture();
    }
}
