package tests;
import geometry.zeroDim.Point2D;
import geometry.oneDim.Segment2D;
import geometry.twoDim.Triangle2D;
import geometry.twoDim.Rectangle2D;

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
        System.out.println("==========> Triangle");
        System.out.println("Veuillez saisir x1 :");
        float x1 = sc.nextInt();
        System.out.println("Veuillez saisir y1 :");
        float y1 = sc.nextInt();
        Point2D p1 = new Point2D(x1,y1);
        
        System.out.println("Veuillez saisir x2 :");
        float x2 = sc.nextInt();
        System.out.println("Veuillez saisir y2 :");
        float y2 = sc.nextInt();
        Point2D p2 = new Point2D(x2,y2);
        
        Segment2D s1 = new Segment2D(p1,p2);
        
        
<<<<<<< HEAD:TestGeometrie.java
=======
        System.out.println("Veuillez saisir x3 :");
        float x3 = sc.nextInt();
        System.out.println("Veuillez saisir y3 :");
        float y3 = sc.nextInt();
        Point2D c = new Point2D(x3,y3);
>>>>>>> Corentin:tests/TestGeometrie.java
        
        s1.afficheLg();
        
        System.out.println("==========> Rectangle");
        System.out.println("Veuillez saisir hauteur :");
        float h = sc.nextInt();
        System.out.println("Veuillez saisir largeur :");
        float l = sc.nextInt();
        
        Rectangle2D abcd = new Rectangle2D(a,h,l);
        abcd.afficheP();
        abcd.afficheA();
        
        
    }
}
