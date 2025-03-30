/* Kelly Wang ICS3U 2025-03-04

"Currency"

a program that asks for an amount of United States money and then prints the Canadian equivalent.  Canadian = U.S * 1.35
*/
import java.util.*;
public class Currency
{
    public static void main(String[] args)
    {
       final double CADCONVERSION = 1.35;
       
       double userAmount;
       double convertedAmount;
       Scanner sc = new Scanner (System.in);
       
       System.out.print("\nInput an amount in USD: ");
       userAmount = sc.nextDouble ();
       convertedAmount = userAmount*CADCONVERSION;
       
       System.out.printf("\nYou have $%.2f CAD.", convertedAmount);    
     
    }
}
