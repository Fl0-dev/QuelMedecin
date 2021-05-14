package fr.eni.ecole.quelMedecin.bo;

public class MedecinSpecialiste extends MedecinGeneraliste{
    private static int tarif;
    private String specialite;


    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresseDoc, String specialite, int tarif) {
        super(nom, prenom, numeroDeTelephone, adresseDoc);
        this.specialite = specialite;
        this.tarif = tarif;
    }

    @Override
    public void afficher() {
        System.out.printf("%s %s%n" +
                        "Téléphone : %s%n" +
                        "Specialité : %s%n" +
                        "Tarif : %s €%n"
                , this.nom, this.prenom, this.numeroDeTelephone,this.specialite, MedecinSpecialiste.tarif);
        System.out.println("Adresse : ");
        adresseDoc.afficher();
        for (Creneau creneau : this.creneaux) {
            if (creneau != null){
                creneau.afficher();}
        }

    }
}
