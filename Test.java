
/**
 * Décrivez votre classe Test ici.
 *
 * @author Besnard Corentin - Alexandre Arnaud
 * @version 26/01/18
 */


import java.util.Scanner;


public class Test
{
    private static int i= 1;
    private static int j= 1;
    private static int k = 2;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        /* Voyages enregistrés */
        Compteur c[j] = new Compteur(i); 
        
        
        System.out.println("Il y a "+Voyage.nbVoyages+" voyages enregistrés");
        

         /* Saisie ville départ par utilisateur*/

        System.out.println("Veuillez saisir une ville de départ :");
        vDep = sc.nextLine();

    
        /* Saisie ville arrivée par utilisateur*/

        System.out.println("Veuillez saisir une ville d'arrivée :");
        vArr = sc.nextLine();


      
        
        
        v41.compDist(v41,v45);
        v43.compDist(v43,v46);
        v41.compDist(v41,v43);
        
        System.out.println(".");
        System.out.println(".");
        
        v41.compPrix(v41,v45);
        v43.compPrix(v43,v46);
        v41.compPrix(v41,v43);
        
        
    }
    
    
    
}
