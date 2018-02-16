package geometry.oneDim;
import geometry.zeroDim.Point2D;

/**
 * Write a description of class Segment2D here.
 *
 * @author Alexandre Arnaud - Corentin Besnard
 * @version 15/02/2018
 */

public class Segment2D
{
    // instance variables - replace the example below with your own
    private Point2D x;
    private Point2D y;

    /**
     * Constructor for objects of class Segment2D
     */
    public Segment2D(Point2D x, Point2D y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
    }
    
<<<<<<< HEAD:Segment2D.java
    public float longueur()
    {
        
=======
    public double longueur(){
        double lg = Math.sqrt(Math.pow((p2.getX()-p1.getX()),2)+Math.pow((p2.getY()-p1.getY()),2));
        lg = lg*1000;lg=Math.round(lg);lg=lg/1000;
        return lg;
>>>>>>> Corentin:geometry/oneDim/Segment2D.java
    }

    public void deplace(Point2D dx, Point2D dy)
    {
        x = dx + x;
        y = dy + y;
    }
    
    public void affiche()
    {
        System.out.println("coord = " + x + " " + y);
    }
    
    public float getX()
    {
        return x;
    }
    
    public float getY()
    {
        return y;
    }
}
