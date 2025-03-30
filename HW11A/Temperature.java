/* Kelly Wang ICS3U 2025-03-17

"Temperature"

 program that asks the user to enter a temperature in degrees Celsius
*/
import java.util.*;
public class Temperature{
   public static void main(String[] args) {
      // Constant Declaration
      final double VERY_COLD = -18;
      final double FREEZING = 0;
      final double VERY_COOL = 10;
      final double MODERATE = 20;
      final double WARM = 30;
      final double HOT = 40;
      final double BOILING = 100;
      
      // Variable Declaration
      double userTemp;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for temperature
      System.out.print("Please enter the temperature (in Celsius): ");
      userTemp = sc.nextDouble();
      
      // Outputs results
      if(userTemp >= BOILING)
      {
         System.out.print("\nIt's boiling (water) in here!");   
      }
      else if(userTemp < BOILING && userTemp > HOT)
      {
         System.out.print("\nIt's hot in here!");   
      }
      else if(userTemp <= HOT && userTemp > WARM)
      {
         System.out.print("\nIt's warm in here!"); 
      }
      else if(userTemp <= WARM && userTemp > MODERATE)
      {
         System.out.print("\nIt's moderate in here!"); 
      }
      else if(userTemp <= MODERATE && userTemp > VERY_COOL)
      {
         System.out.print("\nIt's very cool in here!"); 
      }
      else if(userTemp == FREEZING)
      {
         System.out.print("\nIt's freezing (water) in here!"); 
      }
      else if(userTemp < FREEZING && userTemp >= VERY_COLD)
      {
         System.out.print("\nIt's cold in here!"); 
      }
      else
      {
         System.out.print("\nIt's very cold in here!"); 
      }
                      
   }
}