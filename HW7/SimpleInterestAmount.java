/* Kelly Wang ICS3U 2025-02-27

"SimpleInterestAmount"

a program that prompts the user for the principal, number of years, and the interest rate and then calculates the total amount with interest after the term.  

*/
import java.util.*;
public class SimpleInterestAmount 
{
    public static void main(String[] args) 
    {      
        double principal, interestRate, totalAmount, years; //all variables in one line
        Scanner sc = new Scanner (System.in);
          

        System.out.print("Enter the principal amount: $");
        principal = sc.nextDouble();

        System.out.print("Enter the term (number of years): ");
        years = sc.nextDouble();

        System.out.print("Enter the annual interest rate (in decimals): ");
        interestRate = sc.nextDouble();

        totalAmount = principal * (1 + (years * interestRate));
        System.out.printf("\nThe total amount after %.0f years is: $%.2f%n", years, totalAmount);
    }
}