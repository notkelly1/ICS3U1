/* Kelly Wang ICS3U 2025-04-22

"AddPairs"

 a program that outputs the sum of each digit in a number entered by the user.
*/
import java.util.*;
import java.lang.*;
public class AddPairs{
   public static void main(String[] args) {
      // Variable declaration
      String num;
      int sumDigits = 0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for string
      System.out.print("Input any string of numbers: ");
      num = sc.nextLine();
      
      // Isolate digits using substring, add using parseInt
      for(int i =0; i < num.length(); i+=2)
      {
         System.out.printf("%s + ", num.substring(i,i+2));
         sumDigits += Integer.parseInt(num.substring(i,i+2));
      }
      
      // Grab last number if odd
      if(num.length%2!=0)
      {
         sumDigits
      }
      
      // Print sum
      System.out.printf("\nThe sum is %d", sumDigits);
   }
}