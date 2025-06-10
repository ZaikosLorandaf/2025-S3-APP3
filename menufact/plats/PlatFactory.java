package menufact.plats;

/**
 * Cette classe créer des instances pour les plats
 */
public class PlatFactory {

    /**
     * Construit une instance pour un type de plat (DEPRECATED)
     * @deprecated NE PAS UTILISER
     * @param code
     * @param description
     * @param price
     * @return
     */
    public static PlatAuMenu getPlat(TypePlat plat, int code, String description, double price) {
        PlatAuMenu platAuMenu;
        switch (plat) {
            case TypePlat.SANTE:
                platAuMenu = new PlatSante();
                break;
            case TypePlat.ENFANT:
                platAuMenu = new PlatEnfant();
                break;
            default:
                    platAuMenu = new PlatSante();
                    break;
        }

        platAuMenu.setCode(code);
        platAuMenu.setDescription(description);
        platAuMenu.setPrix(price);
        return platAuMenu;
    }
}
