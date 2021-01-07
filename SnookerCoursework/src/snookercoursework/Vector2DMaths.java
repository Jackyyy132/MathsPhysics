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
public class Vector2DMaths {
    
        public static Vector2D add2DVectors(Vector2D vec1, Vector2D vec2){
        Vector2D vecResult2D = new Vector2D();
        vecResult2D.x = vec1.x + vec2.x;
        vecResult2D.y = vec1.y + vec2.y;
        return vecResult2D;
}
        public static Vector2D sub2DVectors(Vector2D vec1, Vector2D vec2){
            Vector2D vecResult2D = new Vector2D();
            vecResult2D.x = vec1.x - vec2.x;
            vecResult2D.y = vec1.y - vec2.y;
            return vecResult2D;
        }
        public static Vector2D dotMultiply2DVectors(Vector2D vec1, Vector2D vec2){
            Vector2D vecResult2D = new Vector2D();
            vecResult2D.x = vec1.x * vec2.x;
            vecResult2D.y = vec1.y * vec2.y;
            return vecResult2D;
        }
        public static Vector2D unitNormal2DVectors(Vector2D vec1){
            Vector2D vecResult2D = new Vector2D();
            vecResult2D.x = (float) (vec1.x/(Math.sqrt((vec1.x*vec1.x) + (vec1.y*vec1.y))));
            vecResult2D.y = (float) (vec1.y/(Math.sqrt((vec1.x*vec1.x) + (vec1.y*vec1.y))));           
            return vecResult2D;
        }
        public static Vector2D rotate2D(Vector2D vec1, float angle){
            Vector2D vecResult2D = new Vector2D();
            double DegreeAngle = Math.toRadians(angle);
            vecResult2D.x = (float) (vec1.x*Math.cos(DegreeAngle) - vec1.y*Math.sin(DegreeAngle));
            vecResult2D.y = (float) (vec1.x*Math.sin(DegreeAngle) + vec1.y*Math.cos(DegreeAngle));
            return vecResult2D;
        }
        public static Vector2D magnitude2D(Vector2D vec1){
            Vector2D vecResult2D = new Vector2D();
            vecResult2D.x = (float) (Math.sqrt((vec1.x*vec1.x) + (vec1.y*vec1.y)));
            return vecResult2D;
        }
        public static Vector2D scalerMultiple2D(Vector2D vec1, float Scaler){
            Vector2D vecResult2D = new Vector2D();
            vecResult2D.x = vec1.x * Scaler;
            vecResult2D.y = vec1.y * Scaler;
            return vecResult2D;
        }
        public static Vector2D velocityVector2D(float InitialSpeed, float Angle){
            Vector2D vecResult2D = new Vector2D();
            double DegreeAngle = Math.toRadians(Angle);
            vecResult2D.x = (float) (InitialSpeed*Math.cos(DegreeAngle));
            vecResult2D.y = (float) (InitialSpeed*Math.sin(DegreeAngle));
            return vecResult2D;
        }
}





















