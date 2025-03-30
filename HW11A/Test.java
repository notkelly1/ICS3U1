/* Kelly Wang ICS3U 2025-03-17

"Test"

a program that asks teacher to enter a test mark, then outputs if the mark is above range (over 100), below range (under 0), passing, or failing.  Assume passing mark is 50.
*/
import java.util.*;
public class Test{
   public static void main(String[] args) {
      // Constant Declaration
      final double UPPER_BOUND = 100;
      final double LOWER_BOUND = 0;
      final double PASS_BOUND = 50;
      
      // Variable Declaration
      double testMark;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt teacher for grade
      System.out.print("Please enter a test mark: ");
      testMark = sc.nextDouble();
      
      // Outputs results      
      if(testMark > 100)
      {
         System.out.print("\nYou passed and are above range!");
      }
      else if(testMark >= 50)
      {
         System.out.print("\nYou passed!");
      }
      else if(testMark >= 0) 
      {
         System.out.print("\nYou failed :(");
      }
      else
      {
         System.out.print("\nYou failed and are below range :(");
      }      
   }
}