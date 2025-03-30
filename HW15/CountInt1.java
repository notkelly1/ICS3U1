/* Kelly Wang ICS3U 2025-03-27

"CountInt1"

a program that let users to continuously enter integers, then counts the number of integers entered excluding the exit value.
*/
import java.util.*;
import java.lang.*;
public class CountInt1{
   public static void main(String[] args) {
      // Variable declaration
      int userInput = 0;               
      int totalInts = 0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for set of positive integers.
      System.out.println("Please input your positive integers, and enter -1 to terminate the list.");
          
      // While loop to keep track of sum of integers & total integers      
      do
      {
         userInput = sc.nextInt();         
         totalInts = totalInts + 1;         
      }
      while (userInput != -1);
      
      // Adjust for overcounting      
      totalInts = totalInts -1;
      
      // Print sum and total integers
      System.out.println("The total number of integers is " + totalInts);
   }
}