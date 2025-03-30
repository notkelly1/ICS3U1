/* 

Goal: Write a program that asks the user for a three-digit number, finds the sum of the digits of the number, and then prints both the number and its digit sum.

A program that.. asks you for a 3 digit number and calculates the sum of digits.
Written by Kelly Wang on Feb. 19. 2025

*/
import java.util.*;
public class DigitSumSkibidi
{
   public static void main(String[] args)
   {
      int number; 
      int unitDigit;
      int tensDigit;
      int hundredsDigit;
      //store variables that originally came from string (string > char)
     
     /* int unitDigitInt;
      int tensDigitInt;
      int hundredsDigitInt;
      //store variables that were char (char > int)
     */
      int sumDigit;
      //final sum
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Please type in a 3 digit number: ");
      number = sc.nextInt();
      
      hundredsDigit = number/100;
      tensDigit = number/10 - hundredsDigit*10;
      unitDigit = number - tensDigit*10 - hundredsDigit*100;
            
      //seperate the string into 3 seperate char using the charAt function
         
      /*unitDigitInt = unitDigit - '0';
      tensDigitInt = tensDigit - '0';
      hundredsDigitInt = hundredsDigit - '0';
      //takes difference between the char variables' ascii values and 0's ascii value which should yield the integer*/
      
      sumDigit = unitDigit + tensDigit + hundredsDigit;
      System.out.println(hundredsDigit); 
      System.out.println(tensDigit);
      System.out.println(unitDigit);
            
      System.out.print("The number is " + number + ", and the sum of its digits is " + sumDigit); 
      //System.out.print("\n" + unitDigit + "\n" + tensDigit + "\n" + hundredsDigit);                 
   }
}