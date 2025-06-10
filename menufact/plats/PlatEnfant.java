package menufact.plats;

public class PlatEnfant extends PlatAuMenu{
    private double proportion;

    public PlatEnfant() {
    }

    /**
     * Cett classe crée un plat de menu avec paramètres modifiés
     * @param code le code
     * @param description la description du plat
     * @param prix le prix du plat
     * @param proportion la proportion du plat
     */
    public PlatEnfant(int code, String description, double prix, double proportion) {
        super(code, description, prix);
        this.proportion = proportion;
    }

    /**
     * La proportion du plat
     * @return
     */
    public double getProportion() {
        return proportion;
    }

    @Override
    public String toString() {
        return "PlatEnfant{" +
                "proportion=" + proportion +
                "} " + super.toString();
    }
}
