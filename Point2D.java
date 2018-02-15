
/**
 * Write a description of class Point2D here.
 *
 * @author Alexandre Arnaud - Corentin Besnard
 * @version 02/15/2018
 */
public class Point2D
{
    // instance variables 
    private float x;
    private float y;
    /**
     * Constructor for objects of class Point2D
     */
    public Point2D(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public void deplace(float dx, float dy)
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
