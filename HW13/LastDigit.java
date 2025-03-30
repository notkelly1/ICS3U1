/* Kelly Wang ICS3U 2025-03-21

"LastDigit"

a program that prints, as a word, the value of the last digit of the integer input.  
*/
import java.util.*;
import java.lang.*;
public class LastDigit{
   public static void main(String[] args) {
      // Constant declarations
      
      // Variable declarations
         int userInput;
         int lastDigit;
         String lastDigitString = ""; //since initialization is in an if statement it must be initialized using an empty string first
         
      // Creating Scanner
      Scanner sc = new Scanner(System.in);   
      
      // Prompt user for number
      System.out.print("\nPlease input an integer: ");
      userInput = sc.nextInt();
      
      // Determine the last digit
      lastDigit = userInput%10;
      
      // Output the last digit as a string
      switch(lastDigit)
      {
         case 0:
            lastDigitString = "zero";
            break;
         case 1:
            lastDigitString = "one";
            break;
         case 2:
            lastDigitString = "two";
            break;
         case 3:
            lastDigitString = "three";
            break;
         case 4:
            lastDigitString = "four";
            break;
         case 5:
            lastDigitString = "five";
            break;
         case 6:
            lastDigitString = "six";
            break;
         case 7:
            lastDigitString = "seven";
            break;
         case 8:
            lastDigitString = "eight";
            break;
         case 9:
            lastDigitString = "nine";
            break;
         default:
            System.out.print("\nPlease input a real number!");
      }
      
      System.out.printf("\nThe last digit of %d is %s", userInput, lastDigitString);
   }
}