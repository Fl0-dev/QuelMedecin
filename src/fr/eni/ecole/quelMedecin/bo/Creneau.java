package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;

/**
 * Classe permettant de donner un créneau en fonction des médecins
 * (association bidimentionnelle avec MedecinGeneraliste)
 * @date 12 mai 2021
 * @author Florian Girard
 * @version v1.0
 */
public class Creneau {
    private LocalTime heureDebut;
    private int duree;
    private MedecinGeneraliste medecin;

/////Constructeur///////////////////

    /**
     * constructeur de Creneau
     * @param heureDebut
     * @param duree
     * @param medecin
     */
    public Creneau(LocalTime heureDebut, int duree, MedecinGeneraliste medecin) {
        this.heureDebut = heureDebut;
        this.duree = duree;
        this.medecin = medecin;
        //utilisation de la méthode de MedecinGeneraliste
        //pour ajouter un créneau en fonction du nom du medecin
        this.medecin.ajouterCreneau(this);
    }
/////////////GET////////////////
    /**
     * @return
     */
    public MedecinGeneraliste getMedecin() {
        return medecin;
    }

    ///////////////Methodes/////////////

    /**
     * affichage du créneau
     */
    public void afficher() {
        System.out.printf("%s - %s (%d minutes)%n",
                this.heureDebut.toString(),
                this.heureDebut.plusMinutes(this.duree),
                this.duree
        );
    }
}



