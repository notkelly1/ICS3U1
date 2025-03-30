/* Kelly Wang ICS3U 2025-03-17

"Pass"

a program which displays a math addition question, and asks the user for the answer and tells them whether they are correct or not
*/
import java.util.*;
public class Pass
{
   public static void main(String[] args) {
      // Constant declarations
      final int ANS = 3;
      
      // Variable declarations
      int userAns;
      
      // Creating scanner
      Scanner sc = new Scanner(System.in);
            
      // prompt the user for the answer of 1+2
      System.out.print("What is 1+2? = ");
      userAns = sc.nextInt();
      
      // Output whether or not the user is correct
      System.out.print("\nYou are ");
      if(ANS!=userAns)
      {
         System.out.print("not ");
      }
      System.out.print("correct!");
      
            
   }
}