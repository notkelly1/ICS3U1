/* Kelly Wang ICS3U 2025-04-25

"Line"

a class Line.java to calculate the different property of a line.  Line.java does not need to have a main method, but can if you would like to test your methods.
*/
import java.util.*;
import java.lang.*;
public class Line{   
   /*  
   Method name: "length"
   Return type: double (length)
   Parameters: int x1, int y1, int x2, int y2 (coordinates of line segment)
   Description: outputs a length.
   */
   public static double length (int x1, int y1, int x2, int y2){
   double length = Math.pow((Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2)), 0.5);
   return length;  
   }
   
   /*  
   Method name: "slope"
   Return type: double (slope)
   Parameters: int x1, int y1, int x2, int y2 (coordinates of line segment)
   Description: outputs a slope.
   */
   public static double slope (int x1, int y1, int x2, int y2){
   double slope = ((double)(y2-y1))/(x2-x1);
   return slope;    
   }
}