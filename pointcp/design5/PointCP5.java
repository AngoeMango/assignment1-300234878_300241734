package design5;
// This file contains material supporting section 2.9 of the textbook:
    // "Object Oriented Software Engineering" and is issued under the open-source
    // license found at http://www.site.uottawa.ca/school/research/lloseng/

    /**
     * This class contains instances of coordinates in either polar or
     * cartesian format.  It also provides the utilities to convert
     * them into the other type. It is not an optimal design, it is used
     * only to illustrate some design issues.
     *
     * @author Fran&ccedil;ois B&eacute;langer
     * @author Dr Timothy C. Lethbridge
     * @version July 2000
     */
public abstract class PointCP5
    {
        
    //Instance methods **************************************************
    
    
    public abstract double getX();
    public abstract double getY();
    public abstract double getRho();
    public abstract double getTheta();
    

    /**
     * Calculates the distance in between two points using the Pythagorean
     * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
     *
     * @param pointB The second point.
     * @return The distance between the two points.
     */
    public double getDistance(PointCP5 pointB)
    {
        // Obtain differences in X and Y, sign is not important as these values
        // will be squared later.
        double deltaX = getX() - pointB.getX();
        double deltaY = getY() - pointB.getY();
        
        return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }

    /**
     * Rotates the specified point by the specified number of degrees.
     * Not required until E2.30
     *
     * @param rotation The number of degrees to rotate the point.
     * @return The rotated image of the original point.
     */
    public PointCP5 rotatePoint(double rotation)
    {
        double radRotation = Math.toRadians(rotation);
        double X = getX();
        double Y = getY();
            
        return newPt(
        (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
        (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
    }
    
    /**
     * Factory method (used to create a new point so that 
     * rotatePoint can be implemented concretely in the superclass).
     *
     * @param value1 The value of either x or rho.
     * @param value2 The value of either y or theta.
     * @return The point characterized by the two values.
     */
    public abstract PointCP5 newPt(double value1, double value2);
    

    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public abstract String toString();
}
