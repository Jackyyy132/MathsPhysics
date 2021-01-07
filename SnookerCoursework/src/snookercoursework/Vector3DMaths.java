
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
public class Vector3DMaths {
        public static Vector3D add3DVectors(Vector3D vec1, Vector3D vec2){
        Vector3D vecResult3D = new Vector3D();
        vecResult3D.x = vec1.x + vec2.x;
        vecResult3D.y = vec1.y + vec2.y;
        vecResult3D.z = vec1.z + vec2.z;
        
        return vecResult3D;
}
        public static Vector3D sub3DVectors(Vector3D vec1, Vector3D vec2){
            Vector3D vecResult3D = new Vector3D();
            vecResult3D.x = vec1.x - vec2.x;
            vecResult3D.y = vec1.y - vec2.y;
            vecResult3D.z = vec1.z - vec2.z;
            return vecResult3D;
        }
        public static Vector3D dotMultiply3DVectors(Vector3D vec1, Vector3D vec2){
            Vector3D vecResult3D = new Vector3D();
            vecResult3D.x = vec1.x * vec2.x;
            vecResult3D.y = vec1.y * vec2.y;
            vecResult3D.z = vec1.z * vec2.z;
            return vecResult3D;
        }
        public static Vector3D unitNormal3DVectors(Vector3D vec1){
            Vector3D vecResult3D = new Vector3D();
            vecResult3D.x = (float) (vec1.x/(Math.sqrt((vec1.x*vec1.x) + (vec1.y*vec1.y) + (vec1.z*vec1.z))));
            vecResult3D.y = (float) (vec1.y/(Math.sqrt((vec1.x*vec1.x) + (vec1.y*vec1.y) + (vec1.z*vec1.z))));  
            vecResult3D.z = (float) (vec1.z/(Math.sqrt((vec1.x*vec1.x) + (vec1.y*vec1.y) + (vec1.z*vec1.z))));  
            return vecResult3D;
        }
        public static Vector3D magnitude3D(Vector3D vec1){
            Vector3D vecResult3D = new Vector3D();
            vecResult3D.x = (float) (Math.sqrt((vec1.x*vec1.x) + (vec1.y*vec1.y) + (vec1.z*vec1.z)));
            return vecResult3D;
        }
        public static Vector3D scalerMultiple3D(Vector3D vec1, float Scaler){
            Vector3D vecResult3D = new Vector3D();
            vecResult3D.x = vec1.x * Scaler;
            vecResult3D.y = vec1.y * Scaler;
            vecResult3D.z = vec1.z * Scaler;
            return vecResult3D;
        }
        public static Vector3D VelocityVector3D(float InitialSpeed, float Angle){
            Vector3D vecResult3D = new Vector3D();
            double DegreeAngle = Math.toRadians(Angle);
            vecResult3D.x = (float) (InitialSpeed*Math.cos(DegreeAngle));
            vecResult3D.y = (float) (InitialSpeed*Math.sin(DegreeAngle));
            vecResult3D.z = (float) (InitialSpeed*Math.tan(DegreeAngle));
            return vecResult3D;
        }
}

