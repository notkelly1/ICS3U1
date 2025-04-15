/* Kelly Wang ICS3U 2025-03-LENGTH26

"DiagonalSmallest"

a program to ask the user to input 16 integers into a square array and output the smallest value in the two diagonals.  Your program must use a nested for loop to fill the array, and a separate for loop to search for the smallest value in the diagonals.
*/
import java.util.*;
import java.lang.*;
public class DiagonalSmallest{
   public static void main(String[] args) {
      // Constant Declaration
      final int ROWS = 4;
      final int COLS = 4;
      
      // Variable declaration and Initialization 
      int[][]arrayNums;
      arrayNums = new int [ROWS][COLS];      
      int oddNums= 0;
      int min;      
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Fill array wih values      
      for(int i = 0; i < ROWS; i++)
      {
         for(int j = 0; j < COLS; j++)
         {
            System.out.printf("Please enter a number in row %d, column %d: ", i, j);
            arrayNums[i][j] = sc.nextInt();
         }
      }
      
      // Print the array
      for(int col = 0; col < ROWS; col++)
      {
         for(int row = 0; row < COLS; row++)
         {
            System.out.printf("%-4d", arrayNums[col][row]);
         }
        System.out.printf("\n");
      }
            
      // Read all integers in the right diagonal and determine smallest value
      min = arrayNums[0][0];
      for(int row = 0; row < ROWS; row++)
      {         
         if(min > arrayNums[row][row])
         {
            min=arrayNums[row][row];
         }
      }
      
      // Read all int in the left diagonal and compare
      for(int row = 0; row < ROWS; row++)
      {         
         if(min > arrayNums[row][ROWS-row-1])
         {
            min=arrayNums[row][ROWS-row-1];
            
         }
      }
      // Print the minimum
      System.out.printf("The minimum is %d.", min);         
   }
}