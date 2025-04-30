/* Kelly Wang ICS3U 2025-04-25

CheckDivisibility
a method called evenlyDivisible that accepts two integer parameters 
*/
import java.util.*;
import java.lang.*;
public class CheckDivisibility{
   public static void main(String[] args) {
      // Variable declarations
      int sum = 0;
      int userInput1, userInput2;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for upper and lower bounds
      System.out.print("Input a number:  ");
      userInput1 = sc.nextInt();
      
      System.out.print("Input another number:  ");
      userInput2 = sc.nextInt();
      
      // Use method to get if it is divisible
      System.out.print(evenlyDivisible(userInput1, userInput2));
   }
   /*  
   Method name: "evenlyDivisible "
   Return type: int (sum of integers in that range)
   Parameters: int divisor1, int divisor2 (two numbers to test divisibility)
   Description: adds all integers in a given range.
   */
   public static boolean evenlyDivisible  (int divisor1, int divisor2){
      // Variable declaration
      boolean result;
      // If statement to check parameters   
      if(divisor1%divisor2 == 0 || divisor2%divisor1 == 0)
      {
         result = true;
      }
      else
      {
         result = false;  
      }
   return result;
   }
}