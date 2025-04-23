/* Kelly Wang ICS3U 2025-04-22

"AddDigits"

 a program that outputs the sum of each digit in a number entered by the user.
*/
import java.util.*;
import java.lang.*;
public class AddDigits{
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
      for(int i =0; i < num.length(); i++)
      {
         //System.out.printf("%s + ", num.substring(i,i+1));
         sumDigits += Integer.parseInt(num.substring(i,i+1));
      }
      
      // Print sum
      System.out.printf("The sume of the digits is %d.", sumDigits);
   }
}