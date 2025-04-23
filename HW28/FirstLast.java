/* Kelly Wang ICS3U 2025-04-22

"FirstLast"

a program that will print out the 1st and last character of a string entered by the user. (method charAt)
*/
import java.util.*;
import java.lang.*;
public class FirstLast{
   public static void main(String[] args) {
      // Variable declaration
      String userInput;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for number
      System.out.print("Input any string: ");
      userInput=sc.nextLine();
      
      // Output character value
      System.out.printf("The first letter of the string \"%s\" is %s, and the last letter is %s", userInput, userInput.charAt(0), userInput.charAt(userInput.length()-1));
   }
}