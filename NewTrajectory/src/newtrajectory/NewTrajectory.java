/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtrajectory;

import java.util.Scanner;

/**
 *
 * @author w1546167
 */
public class NewTrajectory {
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
static float time = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        
        
        
        Vx = (float) (InitialSpeed*Math.cos(Angle*Math.PI/180)); 
        Vy = (float) (InitialSpeed*Math.sin(Angle*Math.PI/180));

        
        while (YPos >= 0){
        XPos = XPos + (Vx * timeStep);
        System.out.println("x = " + XPos);

        
        YPostemp = (YPos + (Vy*timeStep));
        YPostemp2 = (float) (((-g/2)*(timeStep*timeStep)));
        YPos = YPostemp + YPostemp2;
        Vy = (float) (Vy - (g*timeStep));
        System.out.println("y = " + YPos);
        }
        
        
        
        CalculateTimeOfFlight();
        CalculateTotalDistance();
        CalculateMaximumHeight();
        
    }
    
    
    
    
    
    
    
        public static void CalculateTimeOfFlight(){
            float a = 0;
            float b = 0;
            float c = 0;
            float Temp1,ZeroValue;
            a = (float) (-g/2);
            b = (float) (InitialSpeed*Math.sin(Angle*Math.PI/180));
            Temp1 = (float) Math.sqrt(b*b-4*a*c);
            ZeroValue = (-b + Temp1)/(2*a);
            TimeOfFlight = (-b - Temp1)/(2*a);
            System.out.println(ZeroValue);
            System.out.println("Time of flight is: " + TimeOfFlight + " seconds");
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

    
}
