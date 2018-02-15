//plop



//modif
/**
 * Write a description of class Compteur here.
 *
 * @author Alexandre Arnaud - Corentin Besnard
 * @version 15/02/2018
 */
public class Compteur
{
    // instance variables - replace the example below with your own
    private static int idObjet;
    static int nbObjet;

    /**
     * Constructor for objects of class Compteur
     */
    
    public Compteur(int x, int y)
    {
        // initialise instance variables
        idObjet = nbObjet;
        nbObjet++;
    }

    // fonctions d'affichage
    public void afficheId(){
        System.out.println("L'objet créé porte l'ID "+idObjet);
    }
    
    public void afficheNbObjets(){
        System.out.println("Il existe "+nbObjet+ " objets");
    }
       
    // Getters
    public int getId(){return idObjet;}
    static int getIdMax(){return nbObjet;}
   
}
