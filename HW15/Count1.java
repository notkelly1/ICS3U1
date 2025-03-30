/* Kelly Wang ICS3U 2025-03-27

"Count1"

a do..while loop that counts down from 100 to 1 by 2’s. 
*/
import java.util.*;
import java.lang.*;
public class Count1{
   public static void main(String[] args) {
      // Variable declaration
      int num = 102;
          
      // do..while loop
      do
      {
         num = num - 2;
         System.out.println(num);
      }    
      while (num > 3); 
      //while (num > 0); (if zero is included in the loop)      
   }
}