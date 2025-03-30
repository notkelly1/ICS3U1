/* Kelly Wang ICS3U 2025-03-21

"Capital"

a program that prompts the user for the weight of a package and its dimensions (length, width, and height), and then displays an appropriate error message (too heavy, too large) or the price to deliver the package.
*/
import java.util.*;
import java.lang.*;
public class Capital{
   public static void main(String[] args) {
      // Variable declaration
         String userCapital; // string can't be compared with == if statement cannot work
         
      // Creating Scanner
         Scanner sc = new Scanner(System.in);
      
      // Prompt user for a string
      System.out.println("What is the captial of Canada?.");
      userCapital = sc.nextLine();
      
      // Switch case
      switch (userCapital)
      {
         case "Ottawa":
         case "ottawa":
            System.out.print("\nCorrect!");
            break;
         default:
            System.out.print("\nWrong, try again."); 
      }       
   }
}