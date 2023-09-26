package design3;

import design5.PointCP5;
	// This file contains material supporting section 2.9 of the textbook:
    // "Object Oriented Software Engineering" and is issued under the open-source
    // license found at http://www.site.uottawa.ca/school/research/lloseng/

    /**
     * This class contains instances of coordinates in cartesian format.
     * It also provides the utilities to convert them into polar format.
     * It is not an optimal design, it is used to compare design implementations.
     *
     * @author Fran&ccedil;ois B&eacute;langer
     * @author Dr Timothy C. Lethbridge
     * @version July 2000
     */
public class PointCP3 extends PointCP5
    {
    //Instance variables ************************************************
    
    /**
     * Contains the current value of X.
     */
    private double x;
    
    /**
     * Contains the current value of Y.
     */
    private double y;
        
    
    //Constructors ******************************************************

    /**
     * Constructs a coordinate object.
     */
    public PointCP3(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
        
    
    //Instance methods **************************************************
    
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public double getRho()
    {
        return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }
    
    public double getTheta()
    {
        return Math.toDegrees(Math.atan2(y, x));
    }
    
    /**
     * Factory method (used to create a new point so that 
     * rotatePoint can be implemented concretely in the superclass).
     *
     * @param value1 The value of x.
     * @param value2 The value of y.
     * @return The point characterized by the two values.
     */
    public PointCP5 newPt(double value1, double value2) {
    	return new PointCP3(value1, value2);
    }

    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public String toString()
    {
        return "Stored as Cartesian  (" + getX() + "," + getY() + ")" + "\n";
    }
}
