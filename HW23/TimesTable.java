/* Kelly Wang ICS3U 2025-04-08

"TimesTable"

 a program that Creates a 2D array of characters with the specified dimensions, and initialize each element to be ‘*’.  Then prints out the content of the array as a table.
 */
import java.util.*;
import java.lang.*;
public class TimesTable{
   public static void main(String[] args) {
      // Constant declaration
      final int ROWS = 13;
      final int COLS = 13;
      
      // Variable declaration, initialize array      
      int[][]timesTable;
      timesTable = new int[ROWS][COLS];           
     
      // Fill array with values
      for(int i = 0; i < ROWS; i++){
         for(int j=0; j < COLS; j++){
            timesTable[i][j]= i*j;
         }
      }
      //Print header
      System.out.println("    1   2   3   4   5   6   7   8   9   10  11  12");
      
      //Print out array
      for(int i = 1; i < ROWS; i++){
         System.out.printf("%-4d", i);
         for(int j= 1; j < COLS; j++){
            System.out.printf("%-4d",timesTable[i][j]);
         }
      System.out.println("");
      }
   }
}