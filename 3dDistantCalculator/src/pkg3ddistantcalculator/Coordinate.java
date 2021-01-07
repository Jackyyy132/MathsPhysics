/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg3ddistantcalculator;

/**
 *
 * @author w1546167
 */
public class Coordinate {
    private float X1Coordinate;
    private float Y1Coordinate;
    private float Z1Coordinate;
    private float X2Coordinate;
    private float Y2Coordinate;
    private float Z2Coordinate;
    private float XSquared;
    private float YSquared;
    private float ZSquared;
    private double Answer;


     public Coordinate(float x1){
         X1Coordinate = x1;
     }
     private void ShowX1Coordinate(){
         System.out.println(X1Coordinate);
}
     
     
     public void GetY1Coordinate(float y1){
         Y1Coordinate = y1;
     }
     private void ShowY1Coordinate(){
         System.out.println(Y1Coordinate);
     }
     
     
     
     public void GetZ1Coordinate(float z1){
         Z1Coordinate = z1;
     }
     private void ShowZ1Coordinate(){
         System.out.println(Z1Coordinate);
     }
     
     
     public void GetX2Coordinate(float x2){
         X2Coordinate = x2;
     }
     private void ShowX2Coordinate(){
         System.out.println(X2Coordinate);
     }
     
     
     public void GetY2Coordinate(float y2){
         Y2Coordinate = y2;
     }
     private void ShowY2Coordinate(){
         System.out.println(Y2Coordinate);
     }
     
     
     public void GetZ2Coordinate(float z2){
         Z2Coordinate = z2;
     }
     private void ShowZ2Coordinate(){
         System.out.println(Z2Coordinate);
     }
     
     
     public float CalculateDistant(){
         float NearAnswer;
         XSquared = (float) Math.pow(X2Coordinate - X1Coordinate, 2);
         YSquared = (float) Math.pow(Y2Coordinate - Y1Coordinate, 2);
         ZSquared = (float) Math.pow(Z2Coordinate - Z1Coordinate, 2);
         NearAnswer = ((XSquared) + (YSquared) + (ZSquared)); 
         Answer = (Math.sqrt(NearAnswer));
         return (float) Answer;
         
     }
     public void ShowDistant(){
         System.out.print(Answer);
         
     }

}
