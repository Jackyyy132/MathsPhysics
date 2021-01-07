/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snookercoursework;


/**
 *
 * @author w1546167
 */
public class SnookerCoursework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector2D vec1 = new Vector2D(3.3f,6.2f);
        Vector2D vec2 = new Vector2D(4.2f,12.7f);
        
        Vector3D vec3 = new Vector3D(1.0f,4.5f,8.3f);
        Vector3D vec4 = new Vector3D(12.6f,-4.5f,6.7f);
        
        Vector2D vec5 = new Vector2D(7.5f,7.5f);
        Vector2D vec6 = new Vector2D(12.0f,0.0f);
        
        Vector3D vec7 = new Vector3D(12.6f,0.0f,6.7f);
        
        Vector2D vec8 = new Vector2D(3.0f, 4.0f);
        
        Vector2D Gravity2D = new Vector2D(0.0f, -9.81f);
        Vector3D Gravity3D = new Vector3D(0.0f, -9.81f, 0.0f);

        
        float Angle1 = 60;
        float Angle2 = -60;
        float Angle3 = 45;
        float InitialSpeed = 20;
        float InitialSpeed2 = 14.14f;
        int Scaler = 3;
        float TimeStepper = 0.01f;
        
        float Time = 0.0f;
        float Time2 = 0.0f;
        boolean YPosition = true;
        boolean YPosition2 = true;
        
        Vector2D VelocityVector2D = Vector2DMaths.velocityVector2D(InitialSpeed, Angle3);
        Vector2D Position = new Vector2D(0.0f, 0.0f);
        
        Vector3D VelocityVector3D = Vector3DMaths.VelocityVector3D(InitialSpeed2, Angle3);
        Vector3D Position2 = new Vector3D(0.0f, 0.0f, 0.0f);
        
        
        
        
        
        
        
      
        System.out.println("Vector1: " + "[" + vec1.x + "," + vec1.y + "]");
        System.out.println("Vector2: " + "[" + vec2.x + "," + vec2.y + "]");
        System.out.println("Vector3: " + "[" + vec3.x + "," + vec3.y + "," + vec3.z + "]");
        System.out.println("Vector4: " + "[" + vec4.x + "," + vec4.y + "," + vec4.z + "]");
        System.out.println("Vector5: " + "[" + vec5.x + "," + vec5.y + "]");
        System.out.println("Vector6: " + "[" + vec6.x + "," + vec6.y + "]");
        System.out.println("Vector7: " + "[" + vec7.x + "," + vec7.y + "," + vec7.z + "]");
        System.out.println("Vector8: " + "[" + vec8.x + "," + vec8.y + "]");
        System.out.println("");

        Vector2D Add2DResult = Vector2DMaths.add2DVectors(vec1, vec2);
        System.out.println("Vector[" + vec1.x + "," + vec1.y + "]" + " + Vector" + "[" + vec2.x + "," + vec2.y + "] = " + "[" + Add2DResult.x + "," + Add2DResult.y + "]");
        
        
        Vector3D Add3DResult = Vector3DMaths.add3DVectors(vec3, vec4);
        System.out.println("Vector[" + vec3.x + "," + vec3.y + "," + vec3.z + "]" + " + Vector" + "[" + vec4.x + "," + vec4.y + "," + vec4.z + "] = " + "[" + Add3DResult.x + "," + Add3DResult.y + "," + Add3DResult.z + "]");
        
        
        Vector2D Subtract2DResult = Vector2DMaths.sub2DVectors(vec1, vec2);
        System.out.println("Vector[" + vec1.x + "," + vec1.y + "]" + " - Vector" + "[" + vec2.x + "," + vec2.y + "] = " + "[" + Subtract2DResult.x + "," + Subtract2DResult.y + "]");
        
        
        Vector3D Subtract3DResult = Vector3DMaths.sub3DVectors(vec3, vec4);
        System.out.println("Vector[" + vec3.x + "," + vec3.y + "," + vec3.z + "]" + " - Vector" + "[" + vec4.x + "," + vec4.y + "," + vec4.z + "] = " + "[" + Subtract3DResult.x + "," + Subtract3DResult.y + "," + Subtract3DResult.z + "]");
        
        
        Vector2D Multiply2DResult = Vector2DMaths.dotMultiply2DVectors(vec5, vec6);
        float Answer = Multiply2DResult.x + Multiply2DResult.y;
        System.out.println("Vector[" + vec5.x + "," + vec5.y + "]" + " + Vector" + "[" + vec6.x + "," + vec6.y + "] = " + Answer);
        
        
        Vector3D Multiply3DResult = Vector3DMaths.dotMultiply3DVectors(vec3, vec4);
        float Answer1 = Multiply3DResult.x + Multiply3DResult.y + Multiply3DResult.z;
        System.out.println("Vector[" + vec3.x + "," + vec3.y + "," + vec3.z + "]" + " x Vector" + "[" + vec4.x + "," + vec4.y + "," + vec4.z + "] = " + Answer1);
        
        
        Vector2D UnitNormal2DResult = Vector2DMaths.unitNormal2DVectors(vec5);
        System.out.println("Unit vector of " + "[" + vec5.x + "," + vec5.y + "]" + " = " + "[" + UnitNormal2DResult.x + "," + UnitNormal2DResult.y + "]");
        
        
        Vector2D UnitNormal2DResult1 = Vector2DMaths.unitNormal2DVectors(vec6);
        System.out.println("Unit vector of " + "[" + vec6.x + "," + vec6.y + "]" + " = " + "[" + UnitNormal2DResult1.x + "," + UnitNormal2DResult1.y + "]");
        
        
        Vector3D UnitNormal3DResult = Vector3DMaths.unitNormal3DVectors(vec3);
        System.out.println("Unit vector of " + "[" + vec3.x + "," + vec3.y + "," + vec3.z + "]" + " = " + "[" + UnitNormal3DResult.x + "," + UnitNormal3DResult.y + "," + UnitNormal3DResult.z + "]");
        
        Vector3D UnitNormal3DResult1 = Vector3DMaths.unitNormal3DVectors(vec7);
        System.out.println("Unit vector of " + "[" + vec7.x + "," + vec7.y + "," + vec7.z + "]" + " = " + "[" + UnitNormal3DResult1.x + "," + UnitNormal3DResult1.y + "," + UnitNormal3DResult1.z + "]");
        
        Vector2D Rotate2D = Vector2DMaths.rotate2D(vec8, Angle1);
        System.out.println("Rotating the vector: " + "[" + vec8.x + "," + vec8.y + "]" + " by 60 degrees ANTI-CLOCKWISE gives the vector " + "[" + Rotate2D.x + "," + Rotate2D.y + "]");
        
        Vector2D Rotate2D1 = Vector2DMaths.rotate2D(vec8, Angle2);
        System.out.println("Rotating the vector: " + "[" + vec8.x + "," + vec8.y + "]" + " by 60 degrees CLOCKWISE gives the vector " + "[" + Rotate2D1.x + "," + Rotate2D1.y + "]");
        
        Vector2D Magnitude2D = Vector2DMaths.magnitude2D(vec5);
        System.out.println("Magnitude of vector: " + "[" + vec5.x + "," + vec5.y + "]" + " is " + Magnitude2D.x);
        
        Vector3D Magnitude3D = Vector3DMaths.magnitude3D(vec3);
        System.out.println("Magnitude of vector: " + "[" + vec3.x + "," + vec3.y + "," + vec3.z + "]" + " is " + Magnitude3D.x);
        
        Vector2D ScalerMultiple2D = Vector2DMaths.scalerMultiple2D(vec1, Scaler);
        System.out.println("The scaler " + Scaler + " multiplied by the vector: " + "[" + vec1.x + "," + vec1.y + "]" + " = [" + ScalerMultiple2D.x + "," + ScalerMultiple2D.y + "]");
        
        Vector2D ScalerMultiple2D2 = Vector2DMaths.scalerMultiple2D(vec2, Scaler);
        System.out.println("The scaler " + Scaler + " multiplied by the vector: " + "[" + vec2.x + "," + vec2.y + "]" + " = [" + ScalerMultiple2D2.x + "," + ScalerMultiple2D2.y + "]");
        
        Vector2D ScalerMultiple2D3 = Vector2DMaths.scalerMultiple2D(vec5, Scaler);
        System.out.println("The scaler " + Scaler + " multiplied by the vector: " + "[" + vec5.x + "," + vec5.y + "]" + " = [" + ScalerMultiple2D3.x + "," + ScalerMultiple2D3.y + "]");
        
        Vector2D ScalerMultiple2D4 = Vector2DMaths.scalerMultiple2D(vec6, Scaler);
        System.out.println("The scaler " + Scaler + " multiplied by the vector: " + "[" + vec6.x + "," + vec6.y + "]" + " = [" + ScalerMultiple2D4.x + "," + ScalerMultiple2D4.y + "]");
        
        Vector2D ScalerMultiple2D5 = Vector2DMaths.scalerMultiple2D(vec8, Scaler);
        System.out.println("The scaler " + Scaler + " multiplied by the vector: " + "[" + vec8.x + "," + vec8.y + "]" + " = [" + ScalerMultiple2D5.x + "," + ScalerMultiple2D5.y + "]");
        
        Vector3D ScalerMultiple3D = Vector3DMaths.scalerMultiple3D(vec3, Scaler);
        System.out.println("The scaler " + Scaler + " multiplied by the vector: " + "[" + vec3.x + "," + vec3.y + "," + vec3.z + "]" + " = [" + ScalerMultiple3D.x + "," + ScalerMultiple3D.y + "," + ScalerMultiple3D.z + "]");
                   
        Vector3D ScalerMultiple3D2 = Vector3DMaths.scalerMultiple3D(vec4, Scaler);
        System.out.println("The scaler " + Scaler + " multiplied by the vector: " + "[" + vec4.x + "," + vec4.y + "," + vec4.z + "]" + " = [" + ScalerMultiple3D2.x + "," + ScalerMultiple3D2.y + "," + ScalerMultiple3D2.z + "]");
        
        Vector3D ScalerMultiple3D3 = Vector3DMaths.scalerMultiple3D(vec7, Scaler);
        System.out.println("The scaler " + Scaler + " multiplied by the vector: " + "[" + vec7.x + "," + vec7.y + "," + vec7.z + "]" + " = [" + ScalerMultiple3D3.x + "," + ScalerMultiple3D3.y + "," + ScalerMultiple3D3.z + "]");
        
        Vector2D Velocity2DVector = Vector2DMaths.velocityVector2D(InitialSpeed , Angle3);
        System.out.println("Velocity vector from speed " + InitialSpeed + " and angle " + Angle3 + " is equal to: [" + Velocity2DVector.x + "," + Velocity2DVector.y + "]");
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Trajectory in 2D");
        while (YPosition == true){
            Time = Time + TimeStepper;
            VelocityVector2D = Vector2DMaths.add2DVectors(VelocityVector2D, Vector2DMaths.scalerMultiple2D(Gravity2D, TimeStepper));
            Position = Vector2DMaths.add2DVectors(Position, Vector2DMaths.scalerMultiple2D(VelocityVector2D, TimeStepper));
            System.out.println("Velocity in X direction is: " + VelocityVector2D.x);
            System.out.println("Velocity in Y direction is: " + VelocityVector2D.y);
            System.out.println("Position Vector at the time " + Time + " is: " + "[" + Position.x + "," + Position.y + "]");
            if (Position.y <= 0){
                YPosition = false;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Trajectory in 3D");
        while (YPosition2 == true){
            Time2 = Time2 + TimeStepper;
            VelocityVector3D = Vector3DMaths.add3DVectors(VelocityVector3D, Vector3DMaths.scalerMultiple3D(Gravity3D, TimeStepper));
            Position2 = Vector3DMaths.add3DVectors(Position2, Vector3DMaths.scalerMultiple3D(VelocityVector3D, TimeStepper));
            System.out.println("Velocity in X direction is: " + VelocityVector3D.x);
            System.out.println("Velocity in Y direction is: " + VelocityVector3D.y);
            System.out.println("Velocity in Z direction is: " + VelocityVector3D.z);
            System.out.println("Position Vector at the time " + Time2 + " is: " + "[" + Position2.x + "," + Position2.y + "," + Position2.z +"]");
            if (Position2.y <= 0){
                YPosition2 = false;
            }
        }
        
        boolean Stop = false;
        float RotationalDamping = 0.1f;
        Vector2D RotationDamping = new Vector2D(0.0f,-0.1f);
        
        float CueBallWeight = 0.4f;
        Vector2D CueBallPosition = new Vector2D(0.2f,0.2f);
        Vector2D CueBallInitialVelocity = new Vector2D(0.0f, 2.24f);
        
        float ObjectBallWeight = 0.5f;
        Vector2D ObjectBallPosition = new Vector2D(0.22f,0.8f);
        //When y position of ball = y position of object ball, this means they have struck
        System.out.println("");
        System.out.println("");
        System.out.println("Billiard");
        while(Stop == false){
            CueBallInitialVelocity = Vector2DMaths.add2DVectors(CueBallInitialVelocity, Vector2DMaths.scalerMultiple2D(RotationDamping, TimeStepper));
            CueBallPosition = Vector2DMaths.add2DVectors(CueBallPosition, Vector2DMaths.scalerMultiple2D(CueBallInitialVelocity, TimeStepper));
            System.out.println("Velocity in X direction is: " + CueBallInitialVelocity.x);
            System.out.println("Velocity in Y direction is: " + CueBallInitialVelocity.y);
            System.out.println("Cue ball position vector is " + "[" + CueBallPosition.x + "," + CueBallPosition.y + "]");
            if (CueBallPosition.y >= ObjectBallPosition.y){
                Stop = true;
            }
            
        }

        
        
        
        
        
        
        

        }
    
    
    
}

