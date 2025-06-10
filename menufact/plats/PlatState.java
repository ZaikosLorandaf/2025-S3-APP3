package menufact.plats;

/**
 * Classe abstraite pour l'état des plats
 */
public interface PlatState {

    void treatement(PlatChoisi plat);
    String toString();
}
