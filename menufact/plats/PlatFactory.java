package menufact.plats;

public class PlatFactory {

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
