/* Kelly Wang ICS3U 2025-03-30

"Limit"
   
a program that computes the following sum: 
sum = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + .... + 1.0/N
*/
import java.util.*;
import java.lang.*;
public class Limit{
   public static void main(String[] args){
      // Variable declaration
      double n;
      double sum = 0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for n
      System.out.print("Input the term you want the harmonic sum to end: ");
      n = sc.nextDouble();
      
      // Evaluate sum of harmonic series up to term n using for loop
      for(int i =1; i <= n; i++)
      {
         sum = sum + (1.0/i);         
      }
      
      System.out.printf("\nThe sum is %f.", sum);
   }
}