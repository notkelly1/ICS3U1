/* 
"OutputPrintf1"
A program that prints the names and balances of Juan and Juanita (with formatting)
Kelly Wang 
2025-02-25
*/

public class OutputPrintf1
{
   public static void main(String[] args)
   {      
      System.out.printf("%7s's bank account balance is $%,12.2f", "Juanita", 2345678.99);
      System.out.printf("\n%7s's bank account balance is $%,12.2f", "Juan", 15455.26);
   }
}