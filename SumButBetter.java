/* Kelly Wang ICS3U 2025-03-27

"SumButBetter"

a program that let users to continuously enter positive numbers, then outputs the sum. 
*/
import java.util.*;
import java.lang.*;
public class SumButBetter{
   public static void main(String[] args) {
      // Variable declaration
      int userInput = 0;
      int intSum = 0;           
      int totalInts = 0;
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for set of positive integers.
      System.out.println("Please input your integers, and enter a negative integer to terminate the list.");
          
      // While loop to keep track of sum of integers & total integers
      
      do
      {
         userInput = sc.nextInt();         
         totalInts = totalInts + 1;
         intSum = intSum + userInput;  
      }
      while (userInput >= 0);
      
      // Adjust for overcounting
      intSum = intSum - userInput;
      totalInts = totalInts -1;
      
      // Print sum and total integers
      System.out.println("The sum is " + intSum + " and the total number of integers is " + totalInts);
   }
}