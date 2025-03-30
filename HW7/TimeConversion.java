/* Kelly Wang ICS3U 2025-02-27 

"TimeConversion"

a program that prompts the user for a time in minutes and then display the time in hours and minutes. 

*/

import java.util.*;
public class TimeConversion
{
   public static void main(String[] args)
   {
      int timeMinutes;
      int timeHours;
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Input a time in minutes: ");
      timeMinutes = sc.nextInt ();
      
      timeHours = (timeMinutes-(timeMinutes%60))/60;
      timeMinutes %= 60; //faster way of saying timeMinutes = timeMinutes%60
      
      System.out.printf("The Converted Hours:Minutes is: %d:%02d", timeHours, timeMinutes); //field width, decimal places =/= flag
   }
}