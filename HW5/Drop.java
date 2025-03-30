/* 

Goal: The height of an object at any given time dropped from a starting height of 100 meters is given by the equation h = 100 – 4.9t2 
where t is the time in seconds.  
Write a program that prompts the user for a time less than 4.5 seconds and then displays the height of the object at that time. 

A program that.. reads and calculates the height of a ball drop

Written by Kelly Wang  on Feb. 19. 2025

*/
import java.util.*;
public class Drop
{
   public static void main(String[] args)
   {
      double time; //variable name 
      Scanner sc = new Scanner (System.in);
      
      System.out.print("We are dropping an object, so please type in a time less than 4.5 seconds. \nAs a result, we will display the height of the object if it is dropped for that time. ");
      time = sc.nextDouble();
            
      System.out.print("h = " + (100 - (4.9*time*time)) + " seconds"); //calculation and print
   }
}