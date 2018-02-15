//plip
/**
 * Décrivez votre classe Test ici.
 *
 * @author Besnard Corentin - Alexandre Arnaud
 * @version 26/01/18
 */


import java.util.Scanner;


public class TestCompteur
{
    private static int i= 1;
    //private static int j= 1;
    private static int k = 2;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        /* Voyages enregistrés */
        Compteur c = new Compteur(i); 
        
        
        System.out.println("Il y a ");
        c.afficheNbObjets();
        System.out.println(" objs enregistrés");
        
        
    }
    
    
    
}
