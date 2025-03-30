/* Kelly Wang ICS3U 2025-03-17

"Salary"

a program that prompt for the number of sales and determines the total salary for that month.
*/

import java.util.*;
public class Salary{
   public static void main(String[] args) {    
      // Constant declarations
      final double BASE_SALARY = 1000;
      final double SALES_THRESHOLD = 10;
      
      // Variable declarations
      double salesCompleted;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for sales made
      System.out.print("How many sales have you made? ");
      salesCompleted = sc.nextDouble();
      
      // Output salary + bonus if applicable
      if(salesCompleted > SALES_THRESHOLD)
      {
         System.out.printf("\nYou have made %.2f$", (BASE_SALARY * (1 + salesCompleted/100)));
      }
      else
      {
         System.out.printf("You have made %.2f$", BASE_SALARY);
      }
   }
}