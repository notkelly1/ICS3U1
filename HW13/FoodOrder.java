/* Kelly Wang ICS3U 2025-03-21

"FoodOrder"

a program allow the user to make a choice on a menu and prints 
*/
import java.util.*;
import java.lang.*;
public class FoodOrder{
   public static void main(String[] args) {
      // Constant declaration
      final double COST_1_2 = 2.5;
      final double COST_3 = 3;
      final double COST_4 = 3.5;
      final double COST_5 = 5.0;
      
      // Variable declaration
      int userChoice; 
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);     
      
      // Prompt user for menu orders 
      System.out.println("From the following breakfast menu, please choose one meal\n1) juice, muffin & coffee \n2)cereal, toast & milk \n3) egg, toast & coffee \n4) banana, granola & milk \n5) grapefruit, bacon, eggs & coffee"); 
      userChoice = sc.nextInt();
      
      // Switch & case statement to output price of menu choice 
      switch (userChoice)
      {
         case 1: 
         case 2:
            System.out.printf("\nYour total is: $%.2f", COST_1_2);
            break;
         case 3:
            System.out.printf("\nYour total is: $%.2f", COST_3);
            break;
         case 4:
            System.out.printf("\nYour total is: $%.2f", COST_4);
            break;
         case 5:
            System.out.printf("\nYour total is: $%.2f", COST_5);
            break;
         default:
            System.out.print("\nPlease input a menu option!"); 
      }
   }
}