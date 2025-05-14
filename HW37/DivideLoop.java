/* Kelly Wang ICS3U 2025-05-12

"DivideLoop"

prints out the result (quotient), or an informative error message if there is a problem (division by zero or poor input data).  The program continues looping, even if there is a problem.  
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class DivideLoop{
   /*  
   Method name: "divideNums"
   Return type: void (since it only prints)
   Parameters: int numerator, int denominator 
   Description: divides numerator by denominator
   */
   public static void divideNums(int numerator, int denominator){
      // Variable Declaration
      double quotient = 0;
      
      // Only run if denominator is not 0      
      if(denominator !=0)
      {
         quotient = ((double) numerator/denominator);
         System.out.printf("%d / %d is %.1f\n", numerator, denominator, quotient);
      }
      else
      {
         System.out.printf("You can't divide %d by 0\n", numerator);
      }
   }
   
   // Main method 
   public static void main(String[] args){
      // Variable Declaration
      boolean exitLoop = false;
      boolean askForDenominator = true;
      String userNumerator = "";
      String userDenominator = "";
      int convertedNumerator = 0;
      int convertedDenominator = 0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Do-while loop to continuously divide using method
      do
      {
         // ask for numerator with a try catch statement for the exit value and possibl
         try
         {
            System.out.print("Enter the numerator: ");
            askForDenominator = true;
            userNumerator = sc.nextLine();
            convertedNumerator = Integer.parseInt(userNumerator);
         }
         catch(NumberFormatException e)
         {
            if(userNumerator.charAt(0) == 'q' || userNumerator.charAt(0) == 'Q')
            {
               exitLoop = true;
               askForDenominator = false;
            }
            else
            {
               System.out.println("\nYou entered bad data.");
               System.out.println("Please try again");
               askForDenominator = false;
            }
         }
         
         // ask for denominator
         if(askForDenominator)
         {
            try
            {
               System.out.print("Enter the denominator: ");
               userDenominator = sc.nextLine();
               convertedDenominator = Integer.parseInt(userDenominator);
            }
            catch(NumberFormatException e)
            {
               System.out.println("\nYou entered bad data.");
               System.out.println("Please try again");
            }
         // use method to divide both
         divideNums(convertedNumerator, convertedDenominator);   
         }         
      }
      while(exitLoop != true);
   }
}