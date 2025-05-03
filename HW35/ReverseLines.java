/* Kelly Wang ICS3U 2025-05-02

"ReverseLines"

a program that reads the number on each line in a file “numbers.txt”, then outputs the sum to the standard output.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class ReverseLines{
   public static void main(String[] args) {
      // Constant Declaration (store file name)      
      final String FILE_NAME = "reverse.txt";
      
      // Variable to store text read from the file 
      String[] arrayWords;
      String lineIn; 
      int numWords;
                  
      // try catch, read each line individually and store them in an array.
      try
      {
         BufferedReader in = new BufferedReader(new FileReader(FILE_NAME));
         lineIn = in.readLine();
         numWords = Integer.parseInt(lineIn); // need exception
         
           arrayWords = new String[numWords];
               for (int i = 0; i < numWords && lineIn != null; i++) {
                   lineIn=in.readLine(); arrayWords[i]=lineIn;
               }
               for (int i = 0; i < numWords; i++) {
                   System.out.println(arrayWords[numWords-i-1]);
               }
         // close the file before ending the prgm
         in.close();
      }
      catch(IOException e)
      {
         System.out.println(e + "Problem reading" + FILE_NAME);
      }
      catch(NumberFormatException e)
      {
         System.out.println(e + "String in " + FILE_NAME + " contains non-numeric data.");
      }
   }
}