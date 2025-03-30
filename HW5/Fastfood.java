/* 

Goal:  A fast food restaurant charges $1.69 for burgers, $1.09 for fries, and $0.99 for sodas.
Write a program that prompts the employee for the number burgers, fries, and sodas and then displays the totals, the HST (13%), and the final cost.  
Do not worry about rounding your digits for now.
Modify the program to prompt the employee for the amount tendered and then display the change due.

A program that.. calculates the cost of a combination of items ordered at a fast food restaurant.
Written by Kelly Wang on Feb. 19. 2025

*/
import java.util.*;
public class Fastfood
{
   public static void main(String[] args)
   {
      int nBurger;
      int nFries;
      int nSoda; 
      double totalBeforeTax;
      double totalAfterTax; 
      double amountTendered; //variable names 
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Please type in the quantity of the following items ordered.\nBurgers:");
      nBurger = sc.nextInt();
      
      System.out.print("Fries:");
      nFries = sc.nextInt();
      
      System.out.print("Soda:");
      nSoda = sc.nextInt();
      //asks employee to input qty of items ordered
      
      totalBeforeTax = ((nBurger * 1.69) + (nFries * 1.09) + (nSoda * 0.99));
      totalAfterTax = totalBeforeTax * 1.13;
      //define new variables
      
      System.out.println("\nTotal = $" + totalBeforeTax + "\nHST= $" + (totalBeforeTax * 0.13) + "\n\nThe total after HST will be $" + totalAfterTax);
      //print and calculate total, HST and total after HST
                  
      System.out.print("Amount Tendered ($):");
      amountTendered = sc.nextDouble();
      //asks employee to input amount tendered
      
      System.out.print("\nChange Due = $" + (amountTendered - totalAfterTax));      
   }
}