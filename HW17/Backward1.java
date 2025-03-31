/* Kelly Wang ICS3U 2025-03-30

"Backward1"

a program to output a backwards count by 5's from 100 down to 5. 
*/
import java.util.*;
import java.lang.*;
public class Backward1{
   public static void main(String[] args) {
      // Constant declaration
      final int UPPER_BOUND = 100;
      
      // for loop to count backwards
      for (int i = UPPER_BOUND; i>=5; i -=5 )
      {
         System.out.println(i);
      }  
   }
}