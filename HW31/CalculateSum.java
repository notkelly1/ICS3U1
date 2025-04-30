/* Kelly Wang ICS3U 2025-04-25

"CalculateSum"

a method called sumRange that accepts two integer parameters that represent a range such as 50 to 75. 
*/
import java.util.*;
import java.lang.*;
public class CalculateSum{
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
      
      // Use method to get sum of integers in that range
      sumRange(userInput1, userInput2);
   }
   /*  
   Method name: "sumRange"
   Return type: int (sum of integers in that range)
   Parameters: int lowerBound, int upperBound (boundary for range)
   Description: adds all integers in a given range.
   */
   public static int sumRange (int lowerBound, int upperBound){
      // Variable declaration
      int sum = 0;
      // If statement to check parameters   
      if(lowerBound <= upperBound)
      {
         // for loop to calculate sum
         for(int i=lowerBound; i <= upperBound; i++)
         {        
         sum += i;
         }
         System.out.print(sum);
      }
      else
      {
         System.out.print("Error, the second parameter is less than the first.");   
      }
   return sum;
   }
}