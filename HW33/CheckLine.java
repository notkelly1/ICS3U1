/* Kelly Wang ICS3U 2025-04-25

"CheckLine"

a class CheckLine.java with the main methods which asks users for coordinates of two lines, then uses the methods from Line.java to check if the lines have the same length, and if the lines are parallel or perpendicular
*/
import java.util.*;
import java.lang.*;
public class CheckLine{   
   public static void main(String[] args) {
      // Variable declarations
      int x1a, x2a, y1a, y2a, x1b, x2b, y1b, y2b;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for inputs
      System.out.print("Please enter the two coordinates of line 1: \nVertex 1 x-value: ");
      x1a = sc.nextInt();
      System.out.print("Vertex 1 y-value: ");
      y1a = sc.nextInt();
      System.out.print("Vertex 2 y-value: ");
      x2a = sc.nextInt();
      System.out.print("Vertex 2 y-value: ");
      y2a = sc.nextInt();
      
      System.out.print("Please enter the two coordinates of line 2: \nVertex 2 x-value: ");
      x1b = sc.nextInt();
      System.out.print("Vertex 1 y-value: ");
      y1b = sc.nextInt();
      System.out.print("Vertex 2 y-value: ");
      x2b = sc.nextInt();
      System.out.print("Vertex 2 y-value: ");
      y2b = sc.nextInt();
      
      // Compare length
      if(Line.length(x1a, y1a, x2a, y2a)== Line.length(x1b, y1b, x2b, y2b))
      {
         System.out.println("The two lines have the same length.");    
      }
      else
      {
         System.out.println("The two lines do not have the same length."); 
      }
      // Compare slope
      if(Line.slope(x1a, y1a, x2a, y2a)== Line.slope(x1b, y1b, x2b, y2b))
      {
         System.out.print("The two lines are parallel.");    
      }
      else
      {
         System.out.print("The two lines are not parallel."); 
      }      
   }  
}