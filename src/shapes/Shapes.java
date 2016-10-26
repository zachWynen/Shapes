/**
 *      ZACH WYNEN      ICS4U       OCTOBER 26TH, 2016
 *      This program uses OOP to allow the user to create Sphere objects
 *      and manipulate them with several different methods
 */
package shapes;

public class Shapes {

    public static void main(String[] args) {
     //initializing object
     Sphere ball = new Sphere(5);
        
     //method calling
     System.out.println(ball.getRadius());
     ball.setRadius(7);
     ball.calcSA();
     ball.calcVolume();
     System.out.println(ball.toString());
    }
    
}
