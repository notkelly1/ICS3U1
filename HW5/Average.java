/* 

Goal: Write a program that reads three double values and computes their average.  (Don’t worry about rounding at this point). 

A program that.. reads and calculates the avg of 3 numbers (a,b,c)
Written by Kelly Wang on Feb. 19. 2025

*/
import java.util.*;
public class Average
{
   public static void main(String[] args)
   {
      double a = 2.2;
      double b = 2.3;
      double c = 2.4; //variable names 
      Scanner sc = new Scanner (System.in);
      
      System.out.print("The average of " + a + ", " + b + " and " + c + " is ..." + ((a+b+c)/3)); //calculation and print
   }
}