/* Kelly Wang ICS3U 2025-02-27

"Spending"

a program to help examine the spending patterns of a user.  

*/
import java.util.*;
public class Spending 
{
    public static void main(String[] args) 
    {      
        double food, clothing, entertainment, rent, totalSpent, foodPercent, clothingPercent, entertainmentPercent, rentPercent; //all variables in one line
        Scanner sc = new Scanner (System.in);

        
        System.out.println("Enter the amount spent last month on the following items:");

        System.out.print("Food: $");
        food = sc.nextDouble();

        System.out.print("Clothing: $");
        clothing = sc.nextDouble();

        System.out.print("Entertainment: $");
        entertainment = sc.nextDouble();

        System.out.print("Rent: $");
        rent = sc.nextDouble();

        totalSpent = food + clothing + entertainment + rent;        
        foodPercent = (food / totalSpent) * 100;
        clothingPercent = (clothing / totalSpent) * 100;
        entertainmentPercent = (entertainment / totalSpent) * 100;
        rentPercent = (rent / totalSpent) * 100;

        
        System.out.println();
        System.out.printf("%-15s%11s%n", "Category", "Budget");   
        System.out.printf("%-15s%10.2f%%%n", "Food", foodPercent);
        System.out.printf("%-15s%10.2f%%%n", "Clothing", clothingPercent);
        System.out.printf("%-15s%10.2f%%%n", "Entertainment", entertainmentPercent);
        System.out.printf("%-15s%10.2f%%%n", "Rent", rentPercent);
    }
}
