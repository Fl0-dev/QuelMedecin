package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe qui représente un médecin
 * @date 11 mai 2021
 * @version v2.0
 * @author Florian Girard
 */
public class MedecinGeneraliste {
   private String nom;
   private String prenom;
   private String numeroDeTelephone;
   private static int tarif = 25;
   private Adresse adresseDoc;

////////////Constructeur//////////////
    /**
     * constructeur de medecin généraliste
     * @param nom
     * @param prenom
     * @param numeroDeTelephone
     * @param adresseDoc
     */
    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresseDoc) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
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
                ,this.nom,this.prenom,this.numeroDeTelephone,MedecinGeneraliste.tarif);
        System.out.println("Adresse : ");
        adresseDoc.afficher();
    }
}
