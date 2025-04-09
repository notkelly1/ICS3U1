/* Kelly Wang ICS3U 2025-04-03

"TableOfNumbers"
   
a program that will prompt user for two numbers x & y then output a table of numbers with x rows and each of the rows lists number from 1 to y, separated by a space.
*/
import java.util.*;
import java.lang.*;
public class TableOfNumbers{
   public static void main(String[] args){
      // Variable declaration
      int x;
      int y;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user
      System.out.print("Enter x: ");
      x = sc.nextInt();
      System.out.print("Enter y: ");
      y = sc.nextInt();
      
      // Print table
      for(int i=1; i<=x; i++)
      {
         for(int j=1; j<=y; j++)
         {
            System.out.print(j + " ");
         }
         System.out.println("");
      }      
   }
}