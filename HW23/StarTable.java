/* Kelly Wang ICS3U 2025-04-08

"StarTable"

 a program that Creates a 2D array of characters with the specified dimensions, and initialize each element to be ‘*’.  Then prints out the content of the array as a table.
 */
import java.util.*;
import java.lang.*;
public class StarTable{
   public static void main(String[] args) {
      // Variable declaration
      int rows, cols;
      char[][]arrayStars;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Ask for dimensions of Array
      System.out.print("Please input the number of rows: ");
      rows = sc.nextInt();
      System.out.print("Please input the number of columns: ");
      cols = sc.nextInt();
      
      // Initialize array
      arrayStars = new char[rows][cols];
      
      // Fill array with values
      for(int i = 0; i < rows; i++){
         for(int j=0; j < cols; j++){
            arrayStars[i][j]='*';
         }
      }
      
      //Print out array
      for(int i = 0; i < rows; i++){
         for(int j=0; j < cols; j++){
            System.out.print(arrayStars[i][j]);
         }
      System.out.println("");
      }
   }
}