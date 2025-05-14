/* Kelly Wang ICS3U 2025-05-14

"StarTable"

Create a 2D array of characters with the specified dimensions, and initialize each element to be ‘*’.  Then print out the content of the array as a table to the file “star.txt”.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
public class StarTable{
   public static void main(String[] args) {
      // Constant Declaration
      final String FILE_NAME = "star.txt"; 
      
      // Variable Decalartion
      char[][] arrayStars;
      int userRow = 0;
      int userCol = 0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);

      // Ask user for dimensions of array
      System.out.print("Please input the number of rows: ");
      userRow = sc.nextInt();
      
      System.out.print("Please input the number of columns: ");
      userCol = sc.nextInt();
      
      // Initialize array + fill with values
      arrayStars = new char[userRow][userCol];
      for(int row = 0; row < userRow; row++)
      {
         for(int col = 0; col < userCol; col++)
         {
            arrayStars[row][col] = '*';
         }
      }
      
      // Try catch/ initialize filewriter
      try
      {
         BufferedWriter out = new BufferedWriter(new FileWriter(FILE_NAME, false));
            for(int row = 0; row < userRow; row++)
            {
               for(int col = 0; col < userCol; col++)
               {
                  out.write(arrayStars[row][col]);
               }
               out.write("\n");
            }
         out.close();
      }
      catch(IOException e)
      {}     
   }
}