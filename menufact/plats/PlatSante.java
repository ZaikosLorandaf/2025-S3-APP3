package menufact.plats;

import menufact.plats.PlatAuMenu;

/**
 * Cette classe créer une instance de plat santé pour le menu
 */
public class PlatSante extends PlatAuMenu {
    private double kcal;
    private double chol;
    private double gras;

    /**
     * Cette classe ajoute des paramètre au plat du menu
     * @param code le code
     * @param description la description
     * @param prix le prix
     * @param kcal les calories
     * @param chol le colestérol
     * @param gras le gras
     */
    public PlatSante(int code, String description, double prix, double kcal, double chol, double gras) {
        super(code, description, prix);
        this.kcal = kcal;
        this.chol = chol;
        this.gras = gras;
    }

    public PlatSante() {
    }


    @Override
    public String toString() {
        return "menufact.plats.PlatSante{" +
                "kcal=" + kcal +
                ", chol=" + chol +
                ", gras=" + gras +
                "} " + super.toString();
    }

    /**
     *
     * @return les calories
     */
    public double getKcal() {
        return kcal;
    }

    /**
     *
     * @return le cholestérol
     */
    public double getChol() {
        return chol;
    }

    /**
     *
     * @return le gras
     */
    public double getGras() {
        return gras;
    }
}
