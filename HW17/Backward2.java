/* Kelly Wang ICS3U 2025-03-30

"Backward2"

a program to output a backwards count by 5's from 100 down to 5. 
The user can input a number between 100 and 50 so that the program will stop when the count would be less then the number input.  
*/
import java.util.*;
import java.lang.*;
public class Backward2{
   public static void main(String[] args) {
      // Constant declaration
      final int UPPER_BOUND = 100;
      
      // Variable declaration
      int userBound;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for bound between 100 and 50
      System.out.println("Please input an integer within the range of 100 and 50!");
      userBound = sc.nextInt();      

      // Only count if it is in the range of 50 to 100
      if(userBound<100 && userBound>50)
      {
         // for loop
         for (int i = UPPER_BOUND; i>=userBound; i -=5 )
         {
            System.out.println(i);
         }  
      }
      else
      {
         System.out.println("Please input something within the range of 100 and 50!");
      }      
      
   }
}