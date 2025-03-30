/* Kelly Wang ICS3U 2025-03-17

"Discriminant"

a program that prompts the user for the values of a, b, and c and then displays “No roots” if the discriminant is negative, “One root” if the discriminant is zero, and “Two roots” if the discriminant is positive.
*/
import java.util.*;
public class Discriminant{
   public static void main(String[] args) {
      
      // Variable Declaration
      int a;
      int b;
      int c;
      double discriminant;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for integer
      System.out.println("Please input the coefficients of your quadratic in standard form (a, b, c). Press enter to input a new value.");
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      
      // Calculates discriminant based off of coef.
      System.out.printf("The coefficients inputted are as follows: a = %d, b = %d, c = %d\n", a, b, c);         
      discriminant = b*b-(4*a*c);
      
      // Outputs results (number of roots)
      if(discriminant > 0)
      {
         System.out.print("The quadratic has two real roots.");
      }
      else if(discriminant !=0)
      {
         System.out.print("The quadratic has no real roots.");
      }
      else
      {
      System.out.print("The quadratic has one real root.");
      }
   }
}
