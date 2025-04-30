/* Kelly Wang ICS3U 2025-04-25

"SoundAlarm"

a method called alarm that prints the string “Alarm!” several times on separate lines.  
*/
import java.util.*;
import java.lang.*;
public class SoundAlarm{
   public static void main(String[] args) {
      // Variable declarations
      int numAlarms;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for numAlarms
      System.out.print("Indicate how many times you would like the alarm run:  ");
      numAlarms = sc.nextInt();
      
      // Use alarm method to print message
      alarm(numAlarms);
   }
   /*  
   Method name: "alarm"
   Return type: void (only prints)
   Parameters: int timesPrint (times it is printed)
   Description: provides an alarm.
   */
   public static void  alarm (int timesPrint){
      // If statement to check if parameter is < 1   
      if(timesPrint >= 1)
      {
         // for loop to print alarm
         for(int i=0; i < timesPrint; i++)
         {
         System.out.println("Alarm!");
         }
      }
      else
      {
         System.out.print("Error,  parameter is less than 1.");   
      }
   }
}