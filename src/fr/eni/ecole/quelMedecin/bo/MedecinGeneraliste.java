package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe qui représente un médecin
 * @date 11 mai 2021
 * @version v1.0
 * @author Florian Girard
 */
public class MedecinGeneraliste {
   private String nom;
   private String prenom;
   private String numeroDeTelephone;
   private static int tarif = 25;

////////////Constructeur//////////////
    /**
     * constructeur pour initialiser une instance
     * MedecinGeneraliste
     * @param nom
     * @param prenom
     * @param numeroDeTelephone
     */
    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone) {
        this.nom = nom.toUpperCase();
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
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
     */
    public void afficher() {
        System.out.printf("%s %s%n", this.nom, this.prenom);
        System.out.printf("Téléphone : %s%n",this.numeroDeTelephone);
        System.out.printf("Tarif : %s €%n",MedecinGeneraliste.tarif);
        //ou System.out.printf("%s %s%n"Téléphone : %s%nTarif : %s €%n",this.nom,this.prenom,this.numeroDeTelephone,MedecinGeneraliste.tarif));
    }
}
