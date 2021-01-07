/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg3ddistantcalculator;
import java.util.*;

/**
 *
 * @author w1546167
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float X1Coordinate;
        float Y1Coordinate;
        float Z1Coordinate;
        float X2Coordinate;
        float Y2Coordinate;
        float Z2Coordinate;
        
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Hi there. Welcome to the 3d Distant between 2 coordinates calculator.");
        System.out.println("Please enter your first X Coordinate:");
        X1Coordinate = input.nextFloat();
        Coordinate OBJECT1 = new Coordinate(X1Coordinate);
        System.out.println("Thank you.");
        
        System.out.println("Now, enter the first Y Coordinate:");
        Y1Coordinate = input.nextFloat();
        OBJECT1.GetY1Coordinate(Y1Coordinate);
        System.out.println("Thank you.");
        
        System.out.println("Now, enter your first Z Coordinate:");
        Z1Coordinate = input.nextFloat();
        OBJECT1.GetZ1Coordinate(Z1Coordinate);
        System.out.println("Thank you.");
        System.out.println("This is your first Coordinate:");
        System.out.println("{" + X1Coordinate + "," + Y1Coordinate + "," + Z1Coordinate + "}");

        
        
        System.out.println("Now i will ask for your Second Coordinate");
        System.out.println("Please enter your second X Coordinate:");
        X2Coordinate = input.nextFloat();
        OBJECT1.GetX2Coordinate(X2Coordinate);
        System.out.println("Thank you.");
        
        System.out.println("Now, enter your second Y Coordinate:");
        Y2Coordinate = input.nextFloat();
        OBJECT1.GetY2Coordinate(Y2Coordinate);
        System.out.println("Thank you.");
        
        System.out.println("Finally, enter your third Z Coordinate:");
        Z2Coordinate = input.nextFloat();
        OBJECT1.GetZ2Coordinate(Z2Coordinate);
        System.out.println("Thank you.");
        System.out.println("This is your second Coordinate:");
        System.out.println("{" + X2Coordinate + "," + Y2Coordinate + "," + Z2Coordinate + "}");
        
        System.out.println("Here is the distant between the two coordinates:");
        OBJECT1.CalculateDistant();
        OBJECT1.ShowDistant();
        System.out.println("cm");

    }
    
}
