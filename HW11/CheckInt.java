/* Kelly Wang ICS3U 2025-03-17

"CheckInt"

a program that Reads an integer from the keyboard, then check to see whether it is Positive or negative, Even or odd, a multiple of 7 or not
*/

import java.util.*;
public class CheckInt{
   public static void main(String[] args) {  
      // Variable declaration
      int userInt;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for integer
      System.out.print("Please input an integer: ");
      userInt = sc.nextInt();
      
      // Outputs results of checks
      System.out.print("\nYour number is " + userInt + ", and it is ");
      // Outputs if the number is positive or negative (excluding 0) 
      
      if(userInt > 0)
      {
         System.out.print("positive, ");
      }
      else if(userInt != 0)
      {
         System.out.print("negative, ");
      }
      
      // Outputs if the number is even or odd
      if(userInt%2 != 0)
      {
         System.out.print("odd, ");
      }
      else
      {
         System.out.print("even, ");
      }
      // Outputs if the number is dividible by 7
      if(userInt%7 == 0)
      {
         System.out.print("divisible by 7.");
      }
      else
      {
         System.out.print("not divisible by 7.");
      }
   }
}