/* Kelly Wang ICS3U 2025-05-02

"PrintLines"

a program that read each line in a file “line.txt”, then output them to the standard output.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class PrintLines{
   public static void main(String[] args) {
      // Constant Declaration (store file name)      
      final String FILE_NAME = "line.txt";
      
      // Variable to store text read from the file 
      String lineIn;
      
      // try catch, read each line individually
      try
      {
         BufferedReader in = new BufferedReader(new FileReader(FILE_NAME));
         lineIn = in.readLine();
         
         // if not at the end of file, continue reading
         while(lineIn != null)
         {
            System.out.println(lineIn);
            lineIn = in.readLine();
         }
         
         // close the file before ending the prgm
         in.close();
      }
      catch(IOException e)
      {
         System.out.println(e + "Problem reading" + FILE_NAME);
      }
   }
}