/* 

Goal: The cost of making a pizza at a local shop is as follows:
Labour cost is $0.75 per pizza, regardless of size
Rent cost is $1.00 per pizza, regardless of size
Materials is $0.05*diameter*diameter (diameter is measured in inches)
Write a program that prompts that user for the size of a pizza and then display the cost of making the pizza.


A program that.. calculates the cost of pizza..
Written by Kelly Wang on Feb. 19. 2025

*/
import java.util.*;
public class PizzaCost
{
   public static void main(String[] args)
   {
      double diameter; //variable name
      double cost; 
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Hello valued customer, and welcome to Kelly's Pizzaria. \nPlease type in the desired diameter (in inches) of your pizza: ");
      diameter = sc.nextDouble();
      cost = 0.05*diameter*diameter + 0.75 + 1.00;
       
      System.out.printf("Your Pizza will cost $%.2f", cost);

      //System.out.print("\nYour Pizza will cost $" + ((0.05*diameter*diameter) + 0.75 + 1.00)); //calculation and print
   }
}