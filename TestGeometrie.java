
/**
 * Décrivez votre classe TestGeometrie ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */

import java.util.Scanner;

public class TestGeometrie
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir x1 :");
        float x1 = sc.nextInt();
        System.out.println("Veuillez saisir y1 :");
        float y1 = sc.nextInt();
        Point2D a = new Point2D(x1,y1);
        
        System.out.println("Veuillez saisir x2 :");
        float x2 = sc.nextInt();
        System.out.println("Veuillez saisir y2 :");
        float y2 = sc.nextInt();
        Point2D b = new Point2D(x2,y2);
        
        System.out.println("Veuillez saisir x2 :");
        float x3 = sc.nextInt();
        System.out.println("Veuillez saisir y2 :");
        float y3 = sc.nextInt();
        Point2D c = new Point2D(x3,y3);
        
        Triangle2D abc = new Triangle2D(a,b,c);
        abc.afficheP();
        abc.afficheA();
        
    }
}
