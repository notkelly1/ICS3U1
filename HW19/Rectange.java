/* Kelly Wang ICS3U 2025-03-30

"Rectange"
   
a program that asks the user for an integer and then prints out all its factors.
*/
import java.util.*;
import java.lang.*;
public class Rectange{
   public static void main(String[] args){
      // Variable declaration
      int rows;
      int columns;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user
      System.out.print("Enter # of rows:");
      rows = sc.nextInt();
      System.out.print("Enter # of columns:");
      columns = sc.nextInt();
      
      // for loop that prints *
      for(int i=1; i<=rows; i++)
      {
         for(int j=1; j<=columns; j++)
         {
            System.out.print("* ");
         }
         System.out.println("");
      }      
   }
}