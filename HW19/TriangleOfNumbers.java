/* Kelly Wang ICS3U 2025-04-03

"TriangleOfNumbers"
   
a program using nested loops that prints the following pattern (on the homework)
*/
import java.util.*;
import java.lang.*;
public class TriangleOfNumbers{
   public static void main(String[] args){
      // Constant declaration
      final int ENDING_NUM = 5;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user
          
      // Print pattern
      for(int i=1; i<=ENDING_NUM; i++)
      {
         for(int j=1; j<=i; j++)
         {
            System.out.print(j);
         }
         System.out.println("");
      }      
   }
}