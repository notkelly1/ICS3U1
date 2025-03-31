/* Kelly Wang ICS3U 2025-03-30

"Paper"

a program to find both the thickness of the pile and the area of each piece after the procedure has been carried out forty times. 
*/
import java.util.*;
import java.lang.*;
public class Paper{
   public static void main(String[] args){
      // Constant declaration
      final double AREA_START = 1000000;
      final double THICKNESS_START = 0.090; 
      final double TIMES_PERFORMED = 40;
      
      // Variable declaration
      double area = AREA_START;
      double thickness = THICKNESS_START;
      
      // for loop that performs the process 40 times
      for(int i = 0; i<=TIMES_PERFORMED; i++)
      {
         area = area /2;
         thickness = thickness *2; 
         System.out.printf("\n%3d|%13f mm2|%.2f mm", i, area, thickness); 
      }      
   }
}