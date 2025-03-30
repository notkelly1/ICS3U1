/* Kelly Wang ICS3U 2025-02-27

"Change"

a program that prompts the user for an amount in cents and then displays the minimum number of coins necessary to make the change.

*/
import java.util.*;
public class Change
{
    public static void main(String[] args)
    {
        int userAmount;

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the amount (in cents): ");
        userAmount = sc.nextInt ();
        System.out.println("\nThe minimum number of coins is:");

        System.out.println("Toonies: " + userAmount/200);
        userAmount %= 200; //userAmount = userAmount%200
         
        System.out.println("Loonies: " + userAmount/100);
        userAmount %= 100;

        System.out.println("Quarters: " + userAmount/25);
        userAmount %= 25;

        System.out.println("Dimes: " + userAmount/10);
        userAmount %= 10;

        System.out.println("Nickels: " + userAmount/5);
        userAmount %= 5;

        System.out.println("Leftover Cents: " + userAmount);
    }
}