/* Kelly Wang ICS3U 2025-02-27

"SimpleInterestPrincipal"

a program derivative of SimpleInterestAmount that lets you calculate backwards for the principal needed to invest in the beginning to get 
*/
import java.util.*;
public class SimpleInterestPrincipal 
{
    public static void main(String[] args) 
    {      
        double principalNeeded, interestRate, desiredAmount, years; //all variables in one line
        Scanner sc = new Scanner (System.in);
          
        System.out.print("Enter the desired amount: $");
        desiredAmount = sc.nextDouble();

        System.out.print("Enter the term (number of years): ");
        years = sc.nextDouble();

        System.out.print("Enter the annual interest rate (in decimals): ");
        interestRate = sc.nextDouble();

        principalNeeded =  desiredAmount/(1 + (years * interestRate));
        System.out.printf("\nThe principal needed to get $%.2f after %.0f years with %.0f%% interest is: $%.2f%n", desiredAmount, years, interestRate*100, principalNeeded);
    }
}