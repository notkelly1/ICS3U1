/* Kelly Wang ICS3U 2025-03-30

"Chart"

a chart, with titles, containing the squares and cubes of the natural numbers from 5 to 40. 
*/
import java.util.*;
import java.lang.*;
public class Chart{
   public static void main(String[] args){
      // Constant declaration
      final int LOWER_BOUND = 5;
      final int UPPER_BOUND = 40;
      // Variable declaration      
      int square = 0;
      int cube = 0;
      
      // Print titles
      System.out.printf("%10s|%10s|%10s","number","square","cube");
      
      // for loop that prints the list
      for(int i = LOWER_BOUND; i<=UPPER_BOUND; i++)
      {         
         square = (int) (Math.pow(i, 2));
         cube = (int) (Math.pow(i, 3));
         System.out.printf("\n%10d|%10d|%10d", i, square, cube);         
      }
   }
}