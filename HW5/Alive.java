/* 

Goal:  
Write a program that calculates the number of hours of your life that you have spent sleeping.  
Assume that you sleep 8 hours each night.  
To simplify the problem, assume that there are 30 days in each month and 365 days in each year.  
The program output should look similar to the example below, where underlined data represents information that was entered by the user:


A program that.. calculates your life statistics!
Written by Kelly Wang on Feb. 19. 2025

*/
import java.util.*;
public class Alive
{
   public static void main(String[] args)
   {
      int birthYear;
      int birthMonth;
      int birthDay;
      int yearNow;
      int monthNow;
      int dayNow; 
      int daysAlive; //variable names 
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Please type in your birthdate.\nYear:");
      birthYear = sc.nextInt();
      
      System.out.print("Month:");
      birthMonth = sc.nextInt();
      
      System.out.print("Day:");
      birthDay = sc.nextInt();
      
      System.out.print("\nPlease type in an today's date.\nYear:");
      yearNow = sc.nextInt();
      
      System.out.print("Month:");
      monthNow = sc.nextInt();
      
      System.out.print("Day:");
      dayNow = sc.nextInt();
      
      daysAlive = ((yearNow-birthYear)*365 + (monthNow-birthMonth)*30 + (dayNow-birthDay)); //set new variable to replace previous code (however also note that this formula doesn't work when the current month is less than your birth month)
      
      //System.out.println("You have been alive for " + ((yearNow-birthYear)*365 + (monthNow-birthMonth)*30 + (dayNow-birthDay)) + " days.");      
      //System.out.print("You have slept for " + (((yearNow-birthYear)*365 + (monthNow-birthMonth)*30 + (dayNow-birthDay))*8) + " hours");
      
      System.out.println("You have been alive for " + daysAlive + " days.");
      System.out.print("You have slept for " + (daysAlive*8) + " hours.");
   }
}