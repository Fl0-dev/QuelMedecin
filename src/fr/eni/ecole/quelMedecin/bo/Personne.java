package fr.eni.ecole.quelMedecin.bo;

public class Personne {
    protected String nom;
    protected String prenom;
    protected String numeroDeTelephone;

    public Personne(String nom, String prenom, String numeroDeTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
    }
}
