package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Classe permettant Rendez-vous
 * avec une méthode afficher()
 * @date 14 mai 2021
 * @author Florian Girard
 * @version v1.0
 */
public class RendezVous {

    private Creneau creneauRDV;
    private Patient patientRDV;
    private LocalDate dateRDV;

    /**
     * @param creneauRDV
     * @param patientRDV
     * @param dateRDV
     */
    public RendezVous(Creneau creneauRDV, Patient patientRDV, LocalDate dateRDV) {
        this.creneauRDV = creneauRDV;
        this.patientRDV = patientRDV;
        this.dateRDV = dateRDV;
    }

    /**
     * méthode pour afficher un rendez-vous
     */
    public void afficher(){
        System.out.printf("Rendez-vous du %s ",this.dateRDV.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        creneauRDV.afficher();
        System.out.print("pour ");
        patientRDV.afficher();
    }
}
