/* Kelly Wang ICS3U 2025-03-27

"Sum"

a program that let users to continuously enter positive numbers, then outputs the sum. 
*/
import java.util.*;
import java.lang.*;
public class Sum{
   public static void main(String[] args) {
      // Variable declaration
      int userInput = 0;
      int intSum = 0;           
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for set of positive integers.
      System.out.println("Please input your integers, and enter a negative integer to terminate the list.");
          
      // While loop to keep track of sum of integers & total integers      
      do
      {
         userInput = sc.nextInt();      
         intSum = intSum + userInput;  
      }
      while (userInput >= 0);
      
      // Adjust for overcounting of final value
      intSum = intSum - userInput;

      
      // Print sum and total integers
      System.out.println("The sum is " + intSum + ".");
   }
}