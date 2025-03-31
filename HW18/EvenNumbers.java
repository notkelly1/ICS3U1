/* Kelly Wang ICS3U 2025-03-30

"EvenNumbers"
   
a program that continuously asks for an integer, and stops when a non-positive integer is entered.
Then it outputs the number of even numbers entered.
*/
import java.util.*;
import java.lang.*;
public class EvenNumbers{
   public static void main(String[] args){
      // Variable declaration
      int userInput = 1;
      int evenCount = 0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      //While loop
      while(userInput > 0)
      {
         System.out.print("Enter an integer: ");
         userInput = sc.nextInt();
         
         //if statement to count even numbers
         if(userInput%2==0 && userInput > 0)
         {
            evenCount++;
         }        
      }
      // Print results
      System.out.printf("You have entered %d even numbers.", evenCount );
   }
}