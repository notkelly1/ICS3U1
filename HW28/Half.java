/* Kelly Wang ICS3U 2025-04-22

"Half"

a program that will ask the user for two strings and tell them whether the first is alphabetically first, last or equal. 
*/
import java.util.*;
import java.lang.*;
public class Half{
   public static void main(String[] args) {
      // Variable declaration
      String userInput;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for string
      System.out.print("Input any string: ");
      userInput=sc.nextLine();   
      
      // Print out the halves using substring
      System.out.printf("The first half of the substring is %s", (userInput.substring(0, (userInput.length()/2))));
      System.out.printf("\nThe second half of the substring is %s", (userInput.substring((userInput.length()/2), (userInput.length()))));
      
   }
}