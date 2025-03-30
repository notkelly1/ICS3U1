/* Kelly Wang ICS3U 2025-03-04

"Cost"

a program that asks user for the price of an item and how many plastic bags they need, then output the amount of HST (of 13%) for the item, and the total cost of their bags, followed by the total cost of the item.  Assume that plastic bags are 5 cents each.
*/
import java.util.*;
public class Cost
{
    public static void main(String[] args)
    {
      final double HST = 1.13;
      final double BAG = 0.05;
      
      double userPrice, finalPrice;
      int bagNumber; 
             
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Input the price of your item (in dollars): ");
      userPrice = sc.nextDouble ();
      
      System.out.print("\nInput the number of bags you need: ");
      bagNumber = sc.nextInt ();
      
      finalPrice = userPrice*HST + bagNumber*BAG;
      
      System.out.printf("\nYour total will be: $%.2f", finalPrice);
      
    }
}
