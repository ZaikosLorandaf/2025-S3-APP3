package menufact.plats;

import menufact.plats.etats.CommandeState;

/**
 * Cette classe gère les plats choisi par le client
 */
public class PlatChoisi {
    private PlatAuMenu plat;
    private int quantite;
    private PlatState state;

    /**
     * Constructeur du plat choisi
     * @param builder le builder
     */
    private PlatChoisi(PlatChoisiBuilder builder) {
        this.plat = builder.plat;
        this.quantite = builder.quantite;
        this.state = new CommandeState();
    }

    /**
     * Change l'état
     * @param state le nouvel état
     */
    public void setEtat(PlatState state) {
        this.state = state;
    }

    /**
     * Traite la commande
     * @throws PlatException Si la commande est null, envoie une exception
     */
    public void treated() throws PlatException {
        if(state == null) throw new PlatException("Impossible de servir un plat déjà servie");
        state.treatement(this);
    }

    public PlatState getState() {
        return state;
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatChoisi{" +
                "quantite=" + quantite +
                ", plat=" + plat +
                ", state=" + state +
                '}';
    }

    /**
     * Retourne la quantité
     * @return La quantité
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * Modifie la quantité
     * @param quantite la nouvelle quantité
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    /**
     *
     * @return Retourne le plat
     */
    public PlatAuMenu getPlat() {
        return plat;
    }

    /**
     * Cette classe créer le plat choisi par le client
     */
    public static class PlatChoisiBuilder {
        private PlatAuMenu plat;
        private int quantite = 1;

        /**
         * Ajoute le plat
         * @param plat le plat affecté
         * @return Retourne l'instance du builder
         */
        public PlatChoisiBuilder setPlat(PlatAuMenu plat) {
            this.plat = plat;
            return this;
        }

        /**
         * Ajoute une quantité
         * @param quantite la quantité
         * @return l'instance du builder
         */
        public PlatChoisiBuilder setQuantite(int quantite) {
            this.quantite = quantite;
            return this;
        }

        /**
         * Créer l'instance du plat
         * @return Le plat choisi avec les paramètres
         */
        public PlatChoisi build() {
            return new PlatChoisi(this);

        }
    }
}
