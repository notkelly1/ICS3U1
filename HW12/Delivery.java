/* Kelly Wang ICS3U 2025-03-21

"Delivery"

a program that prompts the user for the weight of a package and its dimensions (length, width, and height), and then displays an appropriate error message (too heavy, too large) or the price to deliver the package.
*/
import java.util.*;
import java.lang.*;
public class Delivery{
   public static void main(String[] args) {
      // Constant declaration
      final double MAX_WEIGHT = 27;
      final double MAX_VOLUME = 100000;
      final double LOWER_BOUND = 5;
      final double BELOW_5_PRICE = 3;
      final double MIDDLE_BOUND = 12;
      final double BELOW_12_PRICE = 3.5;
      final double HIGHER_BOUND = 20;
      final double BELOW_20_PRICE = 4;
      final double BELOW_27_PRICE = 4.5;
      
      // Variable declaration
      double weight, length, width, height; //in kg and cm
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for package details
      System.out.println("Please input the weight (kg), and length, width, height (cm) of your packcage. Press enter to input a new value.");
      weight = sc.nextDouble();
      length = sc.nextDouble();
      width = sc.nextDouble();
      height = sc.nextDouble();
      
      //
      if(weight > MAX_WEIGHT || (length * width * height) > MAX_VOLUME)
      {
         if(weight > MAX_WEIGHT && (length * width * height) > MAX_VOLUME)
         {
            System.out.printf("Your package is too large and too heavy");
         }
         else if(weight > MAX_WEIGHT)
         {
            System.out.printf("Your package is too heavy");
         }
         else
         {
            System.out.printf("Your package is too large");
         }
      }
      else if(weight <= LOWER_BOUND)
      {
            System.out.printf("The price of your package is $%.2f", (weight*BELOW_5_PRICE));
      }    
      else if(weight <= MIDDLE_BOUND)
      {
            System.out.printf("The price of your package is $%.2f", (weight*BELOW_12_PRICE));
      }   
      else if(weight <= HIGHER_BOUND)
      {
            System.out.printf("The price of your package is $%.2f", (weight*BELOW_20_PRICE));
      }   
      else
      {
            System.out.printf("The price of your package is $%.2f", (weight*BELOW_27_PRICE));
      }   
   }
}