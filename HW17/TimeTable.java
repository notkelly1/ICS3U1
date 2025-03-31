/* Kelly Wang ICS3U 2025-03-30

"TimeTable"

a program that reads a positive integer n and then prints an “n-times table” containing values up to n X n.  For example, if the program reads the values 5, it should print.*/
import java.util.*;
import java.lang.*;
public class TimeTable{
   public static void main(String[] args){
      // Constant declaration
      // Variable declaration
      int n;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for n
      System.out.print("Please input a positive integer: ");
      n = sc.nextInt();
      
      // for loop
      for(int i = 1; i<=n; i++)
      {
         System.out.printf("\n%d x %d = %d",n, i, n*i);
      }
   }
}