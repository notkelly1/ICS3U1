/* Kelly Wang ICS3U 2025-03-30

"Power"
   
a program that computes x^n where is x is a floating point number and n is a positive integer. The program informs the user that n must be positive if the user enters a negative value.
*/
import java.util.*;
import java.lang.*;
public class Power{
   public static void main(String[] args){
      // Variable declaration
      double x;
      int n;
      double ans=0;
            
      // Create Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for information
      System.out.println("Enter X:");
      x = sc.nextDouble();
      ans=x;
      
      System.out.println("Enter N:");
      n = sc.nextInt();
      
      // if statement to determine +/- of N
      if(n >0)
      {
         //for loop
         for(int i = 1; i<n; i++)
         {
            ans=ans*x;
            //System.out.println("skibidi" + ans);
         }
         
         // Print statement
         System.out.printf("\n%.2f raised to the power of %d is: %f", x, n, ans);        
      }
      else
      {
         System.out.println("N must be a positive integer.");
      }    
   }
}