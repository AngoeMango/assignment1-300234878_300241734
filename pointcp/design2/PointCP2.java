package design2;

import design5.PointCP5;
	// This file contains material supporting section 2.9 of the textbook:
    // "Object Oriented Software Engineering" and is issued under the open-source
    // license found at http://www.site.uottawa.ca/school/research/lloseng/

    /**
     * This class contains instances of coordinates in polar format.  
     * It also provides the utilities to convert them into cartesian format.
     * It is not an optimal design, it is used only to compare design implementations.
     *
     * @author Fran&ccedil;ois B&eacute;langer
     * @author Dr Timothy C. Lethbridge
     * @version July 2000
     */
public class PointCP2 extends PointCP5
    {
    //Instance variables ************************************************
    
    /**
     * Contains the current value of RHO.
     */
    private double rho;
    
    /**
     * Contains the current value of THETA.
     */
    private double theta;
        
    
    //Constructors ******************************************************

    /**
     * Constructs a coordinate object.
     */
    public PointCP2(double rho, double theta)
    {
        this.rho = rho;
        this.theta = theta;
    }
        
    
    //Instance methods **************************************************
    
    
    public double getX()
    {
        return (Math.cos(Math.toRadians(theta)) * rho);
    }
    
    public double getY()
    {
        return (Math.sin(Math.toRadians(theta)) * rho);
    }
    
    public double getRho()
    {
        return rho;
    }
    
    public double getTheta()
    {
        return theta;
    }
    
    /**
     * Factory method (used to create a new point so that 
     * rotatePoint can be implemented concretely in the superclass).
     *
     * @param value1 The value of rho.
     * @param value2 The value of theta.
     * @return The point characterized by the two values.
     */
    public PointCP5 newPt(double value1, double value2) {
    	return new PointCP2(value1, value2);
    }

    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public String toString()
    {
        return "Stored as Polar [" + getRho() + "," + getTheta() + "]" + "\n";
    }
}
