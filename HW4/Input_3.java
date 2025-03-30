/*
A program that asks the user for their name and age, outputting a response with both variables.
Written by Kelly Wang on Feb. 19. 2025

*/

import java.util.*;
public class Input_3
{
   public static void main(String[] args)
   {
      String userName;
      int userAge;
      Scanner sc = new Scanner (System.in);
   
      System.out.print("\nPlease type in your name and press enter:"); //prompt for user
      userName = sc.nextLine(); //saves the string, AKA your name
      
      System.out.println("\nPlease type in your age and press enter: (Note: it has to be a whole number!)"); //prompt for user
      userAge = sc.nextInt(); //saves the int, AKA your age
   
      System.out.println("\nHello " + userName +"!" + " You must be " + userAge + " years old!"); //prints a greeting
   }
}