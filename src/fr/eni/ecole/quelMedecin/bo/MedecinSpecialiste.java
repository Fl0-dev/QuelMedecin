package fr.eni.ecole.quelMedecin.bo;

public class MedecinSpecialiste extends MedecinGeneraliste{
    private String specialité;
    private int tarif;

    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresseDoc, String specialité, int tarif) {
        super(nom, prenom, numeroDeTelephone, adresseDoc);
        this.specialité = specialité;
        this.tarif = tarif;
    }
}
