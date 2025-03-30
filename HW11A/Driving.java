/* Kelly Wang ICS3U 2025-03-17

"Driving"

a program that checks if a user is allowed to drive
*/
import java.util.*;
public class Driving{
   public static void main(String[] args) {
      // Constant Declaration
      final int UPPER_LIMIT = 75;
      final int LOWER_LIMIT = 18 ;     
      
      // Variable Declaration
      int userAge;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for age
      System.out.print("Please enter your age: ");
      userAge = sc.nextInt();
      
      // Outputs results  
      if(userAge < LOWER_LIMIT)
      {
         System.out.print("\nSorry, you are too young to drive.");
      }
      else if(userAge <= UPPER_LIMIT)
      {
         System.out.printf("\nYou are %d years old. Age OK.  Have you got a driver's licence?", userAge);
      }
      else
      {
          System.out.print("\nSorry, you are too old to drive.");
      }  
   }
}