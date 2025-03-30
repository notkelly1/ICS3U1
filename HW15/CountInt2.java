/* Kelly Wang ICS3U 2025-03-27

"CountInt2"

a program that is derivative of CountInt1, allowing any negative number to be the exit value. It let users to continuously enter integers, then counts the number of integers entered excluding the exit value.
*/
import java.util.*;
import java.lang.*;
public class CountInt2{
   public static void main(String[] args) {
      // Variable declaration
      int userInput = 0;              
      int totalInts = 0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for set of positive integers.
      System.out.println("Please input your integers, and enter any negative integer to terminate the list.");
          
      // do..while loop to keep track of sum of integers & total integers      
      do
      {
         userInput = sc.nextInt();         
         totalInts = totalInts + 1;         
      }
      while (userInput >= 0);
      
      // Adjust for overcounting
      totalInts = totalInts -1;
      
      // Print sum and total integers
      System.out.println("The total number of integers is " + totalInts);
   }
}