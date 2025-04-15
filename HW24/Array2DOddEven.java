/* Kelly Wang ICS3U 2025-03-LENGTH26

"Array2DOddEven"

a program to allow the user to input 9 integers into a 3X3 square array and then identify all the rows and columns (by their indices) with all 3 integers being odd or even.
*/
import java.util.*;
import java.lang.*;
public class Array2DOddEven{
   public static void main(String[] args) {
      // Constant Declaration
      final int ROWS = 3;
      final int COLS = 3;
      
      // Variable declaration and Initialization 
      int[][]arrayNums;
      arrayNums = new int [ROWS][COLS];      
      int oddNums= 0;   
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Fill array wih values      
      for(int col = 0; col < ROWS; col++)
      {
         for(int row = 0; row < COLS; row++)
         {
            System.out.printf("Please enter a number in row %d, column %d: ", col, row);
            arrayNums[col][row] = sc.nextInt();
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
      
      // Read all integers in a row and determine if they are odd or even
      for(int col = 0; col < ROWS; col++)
      {
         for(int row = 0; row < COLS; row++)
         {
            if(arrayNums[col][row]%2 != 0)
            {
               oddNums++;               
            }
         }
         // Determine if the rows array has all odd or all even
         if(oddNums == ROWS)
         {
            System.out.printf("\nAll %d integers were odd in row %d.", ROWS , col);
         }
         else if(oddNums == 0)
         {
            System.out.printf("\nAll %d integers were even in row %d.", ROWS , col);
         }
         else
         {
            System.out.printf("\nThere was a mix of odd and even integers in row %d.", col);
         }
         oddNums = 0;         
      }          
      
      // Read all integers in a column and determine if they are odd or even
      for(int col = 0; col < COLS; col++)
      {
         for(int row = 0; row < ROWS; row++)
         {
            if(arrayNums[row][col]%2 != 0)
            {
               oddNums++;               
            }
         }
         // Determine if the array has all odd or all even
         if(oddNums == COLS)
         {
            System.out.printf("\nAll %d integers were odd in column %d.", COLS , col);
         }
         else if(oddNums == 0)
         {
            System.out.printf("\nAll %d integers were even in column %d.", COLS , col);
         }
         else
         {
            System.out.printf("\nThere was a mix of odd and even integers in column %d.", col);
         }
         oddNums = 0;      
      }      
   }
}