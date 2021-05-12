package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe représentant les adresses des médecins
 * @date 11 mai 2021
 * @version v1.0
 * @author Florian Girard
 */
public class Adresse {
    private String mention;
    private int numero;
    private String complementNumero;
    private String rue;
    private int codePostal;
    private String ville;

    /////////Contructeur//////////////
    public Adresse(String mention, int numero, String complementNumero, String rue, int codePostal, String ville) {
        this.mention = mention;
        this.numero = numero;
        this.complementNumero = complementNumero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public Adresse(int numero, String complementNumero, String rue, int codePostal, String ville) {
        this.numero = numero;
        this.complementNumero = complementNumero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
    ///////////////METHODE////////////////////
    /**
     * Affichage sous la forme :
     * Mention complémentaire
     * numero complément rue
     * code postal Ville
     */
    public void afficher(){
        if (mention !=null){
            System.out.printf("%s%n",this.mention);
        }
        System.out.printf("%d",this.numero);
        if(complementNumero!=null){
            System.out.printf("%s",this.complementNumero);
        }
        System.out.printf(" %s%n",this.rue);
        System.out.printf("%05d %s%n",this.codePostal,this.ville.toUpperCase());
    }
}
