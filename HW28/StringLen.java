/* Kelly Wang ICS3U 2025-04-22

"StringLen"

print out the length of a string entered by the user. (method: length)
*/
import java.util.*;
import java.lang.*;
public class StringLen{
   public static void main(String[] args) {
      // Variable declaration
      String userInput;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for number
      System.out.print("Input any string: ");
      userInput=sc.nextLine();
      
      // Output length value
      System.out.printf("The length of the string \"%s\" is: %d", userInput, userInput.length());
   }
}