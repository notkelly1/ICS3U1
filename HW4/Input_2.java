/*
A program that asks the user for their name and then outputs "hello *name*"
Written by Kelly Wang on Feb. 19. 2025

*/
import java.util.*;
public class Input_2
{
   public static void main(String[] args)
   {
      String userName;
      Scanner sc = new Scanner (System.in);
   
      System.out.print("\nPlease type in your name and press enter:"); //prompt for user
      userName = sc.nextLine(); //saves the string, AKA your name
   
      System.out.println("\nHello " + userName +"!"); //prints a greeting
   }
}