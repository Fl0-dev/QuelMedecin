package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Classe représentant les patients
 * @date 11 mai 2021
 * @version v2.0
 * @author Florian Girard
 */
public class Patient {
    private String nom;
    private String prenom;
    private String telephone;
    private char sexe;
    private long nubSecu;
    private LocalDate dateNaissance;
    private String comment;
    private Adresse adressePatient;
    private RendezVous[] rendezVousPatient;

    ////////////Constructeur///////////////////////


    /**
     * constructeur
     * @param nom
     * @param prenom
     * @param telephone
     * @param sexe
     * @param nubSecu
     * @param dateNaissance
     * @param comment
     * @param adressePatient
     * @param rendezVousPatient
     */
    public Patient(String nom, String prenom, String telephone, char sexe, long nubSecu, LocalDate dateNaissance, String comment, Adresse adressePatient, RendezVous[] rendezVousPatient) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.sexe = sexe;
        this.nubSecu = nubSecu;
        this.dateNaissance = dateNaissance;
        this.comment = comment;
        this.adressePatient = adressePatient;
        this.rendezVousPatient = rendezVousPatient;
    }

    /**
     * Constructeur
     * @param nom
     * @param prenom
     * @param telephone
     * @param sexe
     * @param nubSecu
     * @param dateNaissance
     * @param comment
     * @param adressePatient
     */
    public Patient(String nom, String prenom, String telephone, char sexe, long nubSecu, LocalDate dateNaissance, String comment, Adresse adressePatient) {
        this.nom = nom.toUpperCase();
        this.prenom = prenom;
        this.telephone = telephone;
        this.sexe = sexe;
        this.nubSecu = nubSecu;
        this.dateNaissance = dateNaissance;
        this.comment = comment;
        this.adressePatient = adressePatient;
    }

    /**
     * Affichage sous la forme
     * Nom Prénom
     * Téléphone : XXXXXXXXXX
     * Sexe : XXXXXXX
     * Numéro de Sécurité sociale : XXXXXXXXXXXXXXX
     * Date de naissance : dd mm yyyy
     * Commentaires : XXXXXXXXXXXXXXX
     * Adresse :
     * XXXXXXXX
     */
    ///////METHODE////////////
    public void afficher(){

        System.out.printf("%s %s%n" +
                "Téléphone : %s%n" +
                "Sexe : %s%n" +
                "Numéro de Sécurité sociale : %d%n" +
                "Date de naissance : %s%n" +
                "Commentaires : %s%n" ,
                this.nom, this.prenom,this.telephone
                ,this.sexe =='F'?"Féminin":"Masculin",this.nubSecu,this.dateNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)),
                this.comment == null?"[aucun commentaire]":this.comment);
        System.out.println("Adresse : ");
        adressePatient.afficher();
    }


}
