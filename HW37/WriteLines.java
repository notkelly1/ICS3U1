/* Kelly Wang ICS3U 2025-05-12

"DivideLoop"

prints out the result (quotient), or an informative error message if there is a problem (division by zero or poor input data).  The program continues looping, even if there is a problem.  
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class WriteLines{
   /*  
   Method name: "divideNums"
   Return type: void (since it only prints)
   Parameters: int numerator, int denominator 
   Description: divides numerator by denominator
   */
      public static void divideNums(int numerator, int denominator){
            // Variable Declaration
            double quotient = 0;
            
            if(denominator !=0)
            {
            quotient = ((double) numerator/denominator);
            System.out.printf("%d / %d is %f\n", numerator, denominator, quotient);
            }
            else
            {
            System.out.printf("You can't divide %d by 0\n", numerator);
            }
         
         }
         
      
      public static void main(String[] args) {
         
            // Variable declaration
            String userNumerator = "";
            String userDenominator = "";
            
            // Creating Scanner
            Scanner sc = new Scanner(System.in);
            
         do{
            try
            {
            // Prompt user for numbers
            System.out.print("Input a numerator: ");
            userNumerator = sc.nextLine();
            
            System.out.print("Input a denominator: ");
            userDenominator = sc.nextLine();
            
            //run method
            divideNums(Integer.parseInt(userNumerator), Integer.parseInt(userDenominator));
            }
            
            catch(NumberFormatException e)
            {
               System.out.println("\nYou entered bad data.");
               System.out.println("Please try again");
            }
      }
      while ((char)userNumerator.charAt(0)!=('q'));
   }
}