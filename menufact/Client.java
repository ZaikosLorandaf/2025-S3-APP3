package menufact;

public class Client {
    private int idClient;
    private String nom;
    private String numeroCarteCredit;

    /**
     * Cette classe créer une instance d'un client pour une facture
     * @param idClient l'id
     * @param nom le nom
     * @param numeroCarteCredit le numéro de carte
     */
    public Client(int idClient, String nom, String numeroCarteCredit) {
        this.idClient = idClient;
        this.nom = nom;
        this.numeroCarteCredit = numeroCarteCredit;
    }

    /**
     *
     * @return l'id du client
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * Modifie l'id
     * @param idClient le nouvel id
     */
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    /**
     *
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom
     * @param nom le nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return le numéro de carte
     */
    public String getNumeroCarteCredit() {
        return numeroCarteCredit;
    }

    /**
     * Modifie le numéro de carte
     * @param numeroCarteCredit le nouveau numéro
     */
    public void setNumeroCarteCredit(String numeroCarteCredit) {
        this.numeroCarteCredit = numeroCarteCredit;
    }

    @Override
    public String toString() {
        return "menufact.Client{" +
                "idClient=" + idClient +
                ", nom='" + nom + '\'' +
                ", numeroCarteCredit='" + numeroCarteCredit + '\'' +
                '}';
    }
}
/*
@startuml
class menufact.Client{}
* */