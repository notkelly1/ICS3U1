/* Kelly Wang ICS3U 2025-05-12

"writeChars"

a program that asks the user to enter 10 Strings, then writes each of them to the file “writeLines.txt” on separate lines.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class writeChars{
   public static void main(String[] args) {
      // Constant Declarations
      final String FILE_NAME = "writeChars.txt";
      
      // Variable Declaration
      String userInput = "";
      boolean exitLoop = false;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
            
      //try catch as we are using BufferedWriter
      try
      {
         //Create BufferedWriter, append false
         BufferedWriter out  = new BufferedWriter(new FileWriter(FILE_NAME, false));
         
         // do while loop when exit condition is false
         do
         {
            System.out.print("Input a string: ");
            userInput = sc.nextLine();
            if((userInput.equalsIgnoreCase("Quit")))
            {
               exitLoop = true;   
            }
            else
            {
               for(int i = 0; i < userInput.length(); i++)
               {
                  out.write(userInput.charAt(i) + "\n");
               }
               exitLoop = false; // may not be needed 
            }
         }
         while(!exitLoop);
         out.close();
      }
      catch(IOException e)
      {
         System.out.println("Error: " + e);
      }
   }
}