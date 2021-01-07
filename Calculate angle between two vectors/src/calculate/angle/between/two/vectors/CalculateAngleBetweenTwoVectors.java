/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate.angle.between.two.vectors;
import java.util.*;
/**
 *
 * @author w1546167
 */
public class CalculateAngleBetweenTwoVectors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey please enter your x1 coordinate");
        int x1 = input.nextInt();
        System.out.println("Please enter your y1 coordinate");
        int y1 = input.nextInt();
        
        
        System.out.println("Please enter x2 coordinate");
        int x2 = input.nextInt();
        System.out.println("Please enter y2 coordinate");
        int y2 = input.nextInt();
        
        
        int x1squared = (x1 * x1);
        int x2squared = (x2 * x2);
        int y1squared = (y1 * y1);
        int y2squared = (y2 * y2);
        
        
        double squareroot1 = (Math.sqrt(x1squared + y1squared));

        
        
        double squareroot2 = (Math.sqrt(x2squared + y2squared));

        
        int times = x1 * x2;

        int times2 = y1 * y2;

        int times12 = times + times2;

        
        double NearAnswer = (squareroot1*squareroot2);

        
        double NearerAnswer = times12/NearAnswer;

        
        double Answer = Math.acos(NearerAnswer) * 180/Math.PI;
        System.out.println(Answer + " degrees");
        
    }
    
}
