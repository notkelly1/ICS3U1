/* Kelly Wang ICS3U 2025-05-02

"GroupTotaler"

a program that reads the number on each line in a file “numbers.txt”, then outputs the sum to the standard output.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class GroupTotaler{
   public static void main(String[] args) {
      // Constant Declaration
      final String FILE_NAME = "input.txt";
      
      // Variable Declaration
      //boolean sumEnd = false;
      //boolean currentLineIsString;
      int sum = 0;
      String currentLine = "";
      // Another Try Catch
      try
      {
         // Creating BufferedReader
         BufferedReader in = new BufferedReader(new FileReader(FILE_NAME));
         // Do while loop to continue summing until EOF
         do
         {
            // Try Catch 
            try
            {
               // Read first line and set to variable
               currentLine = in.readLine(); // will this automatically move on to the next line after reading the previous one
               
               // parse string to int. if it doesnt work do what is in ythe catch stmt
               sum += Integer.parseInt(currentLine);
            }
            catch(NumberFormatException e)
            {
               if(sum !=0)
               {
                  System.out.printf("sum = %d\n\n", sum);
               }
               if(currentLine != null)
               {
                  System.out.printf("%s\n", currentLine);
               }
               sum = 0;
               //currentLineIsString = true;
            }
               // if statement to determine what to do with the variable
               
               /*if(currentLine == null)
               {
                  sumEnd = true;
                  System.out.printf("Sum = %d", sum);
               }
               else if(currentLineIsString = true)
               {
                  System.out.println(currentLine);
                  sum = 0;
               }
               else
               {
                  sum += Integer.parseInt(currentLine);
                  System.out.printf("Sum = %d", sum);
               }*/
            }
         while(currentLine != null);
      }
      catch(IOException e)
         {
            System.out.println("IO Exception");
         }
   }
}
      
      