/* Kelly Wang ICS3U 2025-04-22

"AbsValue"

a program that asks user for a number, then outputs the absolute value of that number.
*/
import java.util.*;
import java.lang.*;
public class AbsValue{
   public static void main(String[] args) {
      // Variable declaration
      int num;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for number
      System.out.print("Input any number: ");
      num=sc.nextInt();
      
      // Output absolute value
      System.out.printf("The absolute value of %d is %d", num, (Math.abs(num)));
   }
}