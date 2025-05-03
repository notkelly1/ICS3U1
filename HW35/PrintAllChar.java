/* Kelly Wang ICS3U 2025-05-02

"PrintAllChar"

a program that reads the text in the file “allChar.txt”, then prints one character at a time on separate lines, but skipping any spaces, new line characters (‘\n’) or carriage return characters (‘\r’).
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class PrintAllChar{
   public static void main(String[] args) {
      // Constant Declaration (store file name)      
      final String FILE_NAME = "allChar.txt";
      
      // Variable to store text read from the file 
      int lineIn;
      int sum = 0;
      
      // try catch, read each line individually
      try
      {
         BufferedReader in = new BufferedReader(new FileReader(FILE_NAME));
         lineIn = in.read();
         
         // if not at the end of file, continue reading
         while(lineIn != -1)
         {
            // only print as a char if it is not a space, new line, or carriage return. would a case switch be more appropriate?
            if((char)lineIn == ' ')
            {
               //System.out.println("skip");
               lineIn = in.read();
            }
            else if((char)lineIn == '\n')
            {
               //System.out.println("skip");
               lineIn = in.read();
            }
            else if((char)lineIn == '\r')
            {
               //System.out.println("skip");
               lineIn = in.read();
            }
            else
            {
               System.out.println((char)lineIn);
               lineIn = in.read();
            }
         }
         
         // close the file before ending the prgm
         in.close();
      }
      catch(IOException e)
      {
         System.out.println(e + "Problem reading" + FILE_NAME);
      }
      /*catch(NumberFormatException e) // order of exeptions? do you need another one 
      {
         System.out.println(e + "String in " + FILE_NAME + " contains non-numeric data.");
      }*/
   }
}