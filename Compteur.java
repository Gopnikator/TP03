/** 
 * Write a description of class Compteur here. 
 * 
 * @author (your name) 
 * @version (a version number or a date) 
 * @author Alexandre Arnaud - Corentin Besnard 
 * @version 15/02/2018 
 */ 
public class Compteur 
{ 
    // instance variables - replace the example below with your own 
    protected static int idObjet; 
    private static int idObjet; 
    static int nbObjets; 
 
    /** 
     * Constructor for objects of class Compteur 
     */ 
     
    public Compteur() 
    public Compteur(int x, int y) 
    { 
        // initialise instance variables 
        int idObjet; 
        nbObjets = idObjet; 
        idObjet++; 
    } 
 
    /** 
     * An example of a method - replace this comment with your own 
     * 
     * @param  y  a sample parameter for a method 
     * @return    the sum of x and y 
     */ 
     
    public int getId(int idObjet) 
    { 
        //nouveau commentaire super utile 
        //j'aime la vie et elle me le rend bien!!!! 
        return idObjet; 
    // fonctions d'affichage 
    public void afficheId(){ 
        System.out.println("L'objet créé porte l'ID "+idObjet); 
    } 
     
    public int getIdMax(int idObjet) 
    { 
        idObjet++; 
        return idObjet; 
    public void afficheNbObjets(){ 
        System.out.println("Il existe "+nbObjets+ " objets"); 
    } 
        
    // Getters 
    public int getId(){return idObjet;} 
    static int getNbObjets(){return nbObjets;} 
    
} 