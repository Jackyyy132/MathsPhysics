/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trajectorycoursework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author w1546167
 */
public class TrajectoryCoursework {

    
static ArrayList<Float> Coordinates = new ArrayList<Float>();
static Scanner input = new Scanner(System.in);
static float InitialSpeed;
static float LaunchHeight;
static float Angle;
static float TimeOfFlight;
static float MaximumHeight;
static float TotalDistance;
static final double g = 9.81;
static float timeStep;
static float Vx;
static float Vy;
static float XPos = 0.0f;
static float YPostemp;
static float YPostemp2;
static float YPos = 0.0f;
static float YPos2;
static float time = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {   
        System.out.println("Please enter the Launch height: ");
        LaunchHeight = input.nextFloat();
        while (LaunchHeight < 0){
            System.out.println("Hey! Please enter a launch height that is greater or equal to 0!");
            LaunchHeight = input.nextFloat();
        }
        YPos = LaunchHeight;
        YPos2 = YPos;
        
        System.out.println("Please enter your initial speed: ");
        InitialSpeed = input.nextFloat();
        while (InitialSpeed <= 0){
            System.out.println("Hey! Please enter an initial speed over 0");
            InitialSpeed = input.nextFloat();
        }
        System.out.println("Please enter your angle: ");
        Angle = input.nextFloat();
        while (Angle < -90 || Angle > 90){
            System.out.println("Please select an angle from -90 and 90");
            Angle = input.nextFloat();
        }
        
        System.out.println("Please enter your time step: ");
        timeStep = input.nextFloat();
        while (timeStep <= 0){
            System.out.println("Please enter a time step over 0");
            timeStep = input.nextFloat();
        }
        
        XYVelocity();
        getXYPositions();
        Gradient();
        CalculateTimeOfFlight();
        
        CalculateMaximumHeight();
        CalculateMaximumHeightv2();
        
        CalculateTotalDistance();
        StoreCoordinates();

        
    }
    
    
    
    
        public static void XYVelocity(){
            Vx = (float) (InitialSpeed*Math.cos(Angle*Math.PI/180)); 
            Vy = (float) (InitialSpeed*Math.sin(Angle*Math.PI/180));
            System.out.println("Vx = " + Vx);
            System.out.println("Vy = " + Vy);
        }
        
        public static void getXYPositions(){
            Coordinates.add(XPos);
            Coordinates.add(YPos);
            System.out.print("x = " + XPos);
            System.out.println("          y = " + YPos);
        
 
        while (YPos >= 0){
            XPos = XPos + (Vx * timeStep);
            Coordinates.add(XPos);
            YPostemp = (YPos + (Vy*timeStep));
            YPostemp2 = (float) (((-g/2)*(timeStep*timeStep)));
            YPos = YPostemp + YPostemp2;
            Coordinates.add(YPos);
            Vy = (float) (Vy - (g*timeStep));
            System.out.print("x = " + XPos);
            System.out.println("        y = " + YPos);
        }
        }
    
        public static void Gradient(){
            while (Coordinates.size() >= 4){
                float GradientY = Coordinates.get(3) - Coordinates.get(1);
                float GradientX = Coordinates.get(2) - Coordinates.get(0);
                float GradientXY = GradientY/GradientX;
                Coordinates.remove(0);
                Coordinates.remove(0);
                System.out.println("Gradient: " + GradientXY);
            }
            
    }
        
        
        public static void AnglePhi(){
            try{
                BufferedWriter out = new BufferedWriter(new FileWriter("H:\\SECOND YEAR COMPUTER SCIENCE\\Maths And Physical\\TrajectoryDetails.txt"));               
                out.write("Trajectory Details: " + "\r\n");
                out.write("Angle is: " + Angle + "\r\n");
                out.write("Distance travelled is: " + TotalDistance);
                out.close();
            }
            catch (IOException e){
                System.out.println("Could not save to a textfile");
            }
        }
        
        
        
        
        


        public static void CalculateTimeOfFlight(){
            float a = 0;
            float b = 0;
            float c = 0;
            float Temp1,Temp2,Temp3;
            
            a = (float) (-g/2);
            b = (float) (InitialSpeed*Math.sin(Angle*Math.PI/180));
            Temp1 = (float) Math.sqrt(b*b-4*a*c);
            Temp2 = (-b + Temp1)/(2*a);
            Temp3 = (-b - Temp1)/(2*a);
            if (Temp2 == 0.0 || Temp2 == -0.0){
                TimeOfFlight = Temp3;
                if (TimeOfFlight < 0){
                    TimeOfFlight = TimeOfFlight * -1;
                }
                System.out.println("Time of flight is: " + TimeOfFlight + " seconds");
            }
            if (Temp3 == 0.0 || Temp3 == -0.0){
                TimeOfFlight = Temp2;
                if (TimeOfFlight < 0){
                    TimeOfFlight = TimeOfFlight * -1;
                }
                System.out.println("Time of flight is: " + TimeOfFlight + " seconds");
            }
            
            
            
            
            
//            if (TimeOfFlight == 0.0f|| TimeOfFlight == -0.0f){
//                System.out.println("Time of flight is: " + Temp2 + " seconds t");
//            }
//            if (Temp2 == 0.0f || Temp2 == -0.0f){
//                System.out.println("Time of flight is: " + TimeOfFlight + " seconds a");
//            }
    }

        
        
        
       

        
        
        
        
        
        
        
        public static void CalculateTotalDistance(){
            TotalDistance = (float) (InitialSpeed * Math.cos(Angle*Math.PI/180))*TimeOfFlight;
            System.out.println("Total distance travelled is: " + TotalDistance + " metres");
    }
        
        
        
        
        
        
        
        
        
        
        
        
        public static void CalculateMaximumHeight(){
            float Temp1;
            float Temp2;
            float Temp3;
            float HalfTime;
            Temp1 = (float) (InitialSpeed*Math.sin(Angle*Math.PI/180));
            HalfTime = (float) (Temp1/g);
            
            
            Temp2 = Temp1*HalfTime;
            Temp3 = (float) (((g/2)*(HalfTime*HalfTime)));
            MaximumHeight = Temp2 - Temp3;
            System.out.println("Maximum height reached was: " + MaximumHeight + " metres");
    }
        
        public static void CalculateMaximumHeightv2(){
            float Vy0 = (float) (InitialSpeed*Math.sin(Angle*Math.PI/180));
            float Motion1 = 0 - (Vy0*Vy0);
            float Motion2 = (float) (2 * (-g));
            float Motion = Motion1/Motion2;
            
            
                    
            System.out.println("Maximum height reached was: " + Motion);
        }
        
        
        
        
        
        public static void StoreCoordinates() throws IOException{
            float XPos2 = 0;
            float YPosa;
            float YPosb;
            
            float Vx1 = (float) (InitialSpeed*Math.cos(Angle*Math.PI/180)); 
            float Vy1 = (float) (InitialSpeed*Math.sin(Angle*Math.PI/180));         
            try{
                BufferedWriter out = new BufferedWriter(new FileWriter("H:\\SECOND YEAR COMPUTER SCIENCE\\Maths And Physical\\Coordinates.txt"));               
                out.write("Coordinates: " + "\r\n");
                out.write("x = " + XPos2 + ",");
                out.write("y = " + YPos2 + "\r\n");
                while (YPos2 >=0){
                    XPos2 = XPos2 + (Vx1 * timeStep);
                    out.write("x = " + XPos2 + ",");
                    YPosa = (YPos2 + (Vy1*timeStep));
                    YPosb = (float) (((-g/2)*(timeStep*timeStep)));
                    YPos2 = YPosa + YPosb;
                    out.write("y = " + YPos2 + "\r\n");
                    Vy1 = (float) (Vy1 - (g*timeStep));
                }
                out.close();
            }
            catch (IOException e){
                System.out.println("Could not save to a textfile");
            }
        }
        
        
        
        

    
}
