/* Kelly Wang ICS3U 2025-04-22

"RandomNum"

a program that will print out a random number between 0 and 100.
*/
import java.util.*;
import java.lang.*;
public class Exponent{
   public static void main(String[] args) {
      // Variable declaration
      int base, exponent;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for base and exponent
      System.out.print("Input the base: ");
      base = sc.nextInt();
      
      System.out.print("Input the exponent: ");
      exponent = sc.nextInt();
      
      // Print the power
      System.out.printf("%d to the power of %d is %.0f", base, exponent, (Math.pow(base, exponent)));
   }
}