/* Kelly Wang ICS3U 2025-05-02

"AddNumbers"

a program that reads the number on each line in a file “numbers.txt”, then outputs the sum to the standard output.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class AddNumbers{
   public static void main(String[] args) {
      // Constant Declaration (store file name)      
      final String FILE_NAME = "numbers.txt";
      
      // Variable to store text read from the file 
      String lineIn;
      int sum = 0;
      
      // try catch, read each line individually
      try
      {
         BufferedReader in = new BufferedReader(new FileReader(FILE_NAME));
         lineIn = in.readLine();
         
         // if not at the end of file, continue reading
         while(lineIn != null)
         {
            //System.out.printf("\nThe integer in the line is %d", Integer.parseInt(lineIn));
            sum += Integer.parseInt(lineIn);
            lineIn = in.readLine();
         }
         
         // Print the sum
         System.out.println("The sum is " + sum);
         
         // close the file before ending the prgm
         in.close();
      }
      catch(IOException e)
      {
         System.out.println(e + "Problem reading" + FILE_NAME);
      }
      catch(NumberFormatException e) // order of exeptions? do you need another one 
      {
         System.out.println(e + "String in " + FILE_NAME + " contains non-numeric data.");
      }
   }
}