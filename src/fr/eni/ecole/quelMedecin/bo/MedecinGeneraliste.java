package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;

/**
 * Classe qui représente un médecin
 *
 * @author Florian Girard
 * @version v2.0
 * @date 11 mai 2021
 */
public class MedecinGeneraliste extends Personne{
    protected static int tarif = 25;
    private Adresse adresseDoc;
    private Creneau[] creneaux = new Creneau[15];

////////////Constructeur//////////////


    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresseDoc, Creneau[] creneaux) {
        super(nom, prenom, numeroDeTelephone);
        this.adresseDoc = adresseDoc;
        this.creneaux = creneaux;
    }

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresseDoc) {
        super(nom, prenom, numeroDeTelephone);
        this.adresseDoc = adresseDoc;
    }

    ////////////GET/////////////
    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public static int getTarif() {
        return tarif;
    }

    public String getNom() {
        return nom;
    }

    ///////////////SET///////////////

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public static void setTarif(int tarif) {
        MedecinGeneraliste.tarif = tarif;
    }

    //////////////////METHODE///////////////////


    /**
     * permet d'ajouter un créneau si dans le tableau de créneaux
     * le créneau est vide (null)
     * @param creneauAAjouter
     */
    public void ajouterCreneau(Creneau creneauAAjouter) {

        for (int i = 0; i <this.creneaux.length ; i++) {
            if (this.creneaux[i]==null){
                this.creneaux[i] = creneauAAjouter;
                break;
            }
        }
    }

    /**
     * methode d'affichage sous la forme :
     * NOM Prénom
     * Téléphone : XXXXXXXXXX
     * Tarif : XX€
     * Adresse :
     * XXXXXXXXXXXXXXX
     */
    public void afficher() {
        System.out.printf("%s %s%n" +
                        "Téléphone : %s%n" +
                        "Tarif : %s €%n"
                , this.nom, this.prenom, this.numeroDeTelephone, MedecinGeneraliste.tarif);
        System.out.println("Adresse : ");
        adresseDoc.afficher();
        for (Creneau creneau : this.creneaux) {
            if (creneau != null){
            creneau.afficher();}
        }
    }

}
