package menufact.plats;

import menufact.plats.Etats.CommandeState;
import menufact.plats.PlatAuMenu;

public class PlatChoisi {
    private PlatAuMenu plat;
    private int quantite;
    private PlatState state;

    private PlatChoisi(PlatAuMenu plat, int quantite) {
        this.plat = plat;
        this.quantite = quantite;
        this.state = new CommandeState();
    }

    public void setEtat(PlatState state) {
        this.state = state;
    }

    public void treated() throws PlatException {
        if(state == null) throw new PlatException("Impossible de servir un plat déjà servie");
        state.treatement(this);
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatChoisi{" +
                "quantite=" + quantite +
                ", plat=" + plat +
                ", state=" + state +
                '}';
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public PlatAuMenu getPlat() {
        return plat;
    }

    public static class PlatChoisiBuilder {
        private PlatAuMenu plat;
        private int quantite;

        public PlatChoisiBuilder setPlat(PlatAuMenu plat) {
            this.plat = plat;
            return this;
        }

        public PlatChoisiBuilder setQuantite(int quantite) {
            this.quantite = quantite;
            return this;
        }

        public PlatChoisi build() {
            return new PlatChoisi(plat, quantite);

        }
    }
}
