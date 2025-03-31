/* Kelly Wang ICS3U 2025-03-30

"Factors"
   
a program that asks the user for an integer and then prints out all its factors.
*/
import java.util.*;
import java.lang.*;
public class Factors{
   public static void main(String[] args){
      // Variable declaration
      int userInt;
            
      // Create Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for information
      System.out.println("Enter an Integer:");
      userInt = sc.nextInt();
     
      //for loop
      for(int i = 1; i<=userInt; i++)
      {
         if(userInt%i==0)
         {
            System.out.println(i);
         }          
      }    
   }
}