/**
 * SEE MAIN CLASS
 */
package shapes;

public class Sphere {
 
 //variable declaration
 private final double PI = 3.1415;   
 private double radius = 0;
 private double surfaceArea = 0;
 private double volume = 0;
    
 /**
  * Constructor method
  * pre: none
  * post: An object initialized with the relative parameter
  */
 public Sphere(double initRadius)
 {
  radius = initRadius;   
 }
   
 /**
  * A method to set a new radius (modifier)
  * pre: an existing Sphere with proper parameters
  * post: The object is given a new base radius
  */
 public void setRadius(double newRadius)
 {
  radius = newRadius;
 }
 
 /**
  * An accessor method to determine the Sphere's radius
  * pre: A Sphere object with a valid radius
  * post: A returned double representing the radius of the Sphere
  */
 public double getRadius()
 {
  return(radius);   
 }
 
 /**
  * A helper method to calculate the Surface area based on radius
  * pre: A Sphere object with a valid radius
  * post: A new value calculated to represent the Surface area
  */
 public void calcSA()
 {
  surfaceArea = 4*PI*radius*radius;   
 }
 
 /**
  * A helper method to calculate the volume of the Sphere based on radius
  * pre: A Sphere object with a valid radius
  * post: A new value calculated to represent the volume of the Sphere
  */
 public void calcVolume()
 {
  volume = (4*PI*radius*radius*radius)/3;   
 }
 
 /**
  * A method to generate output based on data of the Sphere
  * pre: A sphere with valid data (radius, surface area, volume)
  * post: A string representing a full output of the relative information
  */
 @Override
 public String toString()
 {
  String output;
     
  output = "You have a sphere with a radius of: " + radius
          +"\nA surface Area of: " + surfaceArea
          + "\nAnd a volume of: " + volume;
  
  return output;
 }   
}
