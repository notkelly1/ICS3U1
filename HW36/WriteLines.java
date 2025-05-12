/* Kelly Wang ICS3U 2025-05-12

"ReverseLines"

a program that asks the user to enter 10 Strings, then writes each of them to the file “writeLines.txt” on separate lines.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class WriteLines{
   public static void main(String[] args) {
      // Constant Declaration
      final int NUM_STRINGS = 10;
      final String FILE_NAME = "writeLines.txt";
      
      // Variable Declaration
      String[] userInput;
      userInput = new String[NUM_STRINGS];
      
      try
      {
         // Creating Scanner
         Scanner sc = new Scanner(System.in);
         
         // Fill array with user input
         for(int i = 0; i < NUM_STRINGS; i++)
         {
            System.out.print("Enter a string: ");
            userInput[i] = sc.nextLine();
         }
         
         // Create a file writer that will write the user input into the file and then close it
         FileWriter writer = new FileWriter(FILE_NAME, true);
         for(int i = 0; i < NUM_STRINGS; i++)
         {
            writer.write(userInput[i]+"\n");
         }
         writer.close();      
      }      
      catch(InputMismatchException e)
      {
         System.out.println("\nBad Input Type" + e);
         System.out.println("Please input a string");
      } 
      catch(IOException e)
      {
         System.out.println(e + "Problem writing" + FILE_NAME);         
      } 
   }
}
      
   