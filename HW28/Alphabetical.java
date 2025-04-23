/* Kelly Wang ICS3U 2025-04-22

"Alphabetical"

a program that will ask the user for two strings and tell them whether the first is alphabetically first, last or equal. 
*/
import java.util.*;
import java.lang.*;
public class Alphabetical{
   public static void main(String[] args) {
      // Variable declaration
      String userInputA;
      String userInputB;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for string
      System.out.print("Input any string: ");
      userInputA=sc.nextLine();
      
      System.out.print("Input another string: ");
      userInputB=sc.nextLine();
      
      // Output string comparison results
      if((userInputA.compareTo(userInputB))>0)
      {
      System.out.printf("String %s is alphabetically first!", userInputB);
      }
      else if((userInputA.compareTo(userInputB))<0)
      {
      System.out.printf("String %s is alphabetically first!", userInputA);
      }
      else
      {
      System.out.printf("The strings are equal.");
      }
   }
}
      

