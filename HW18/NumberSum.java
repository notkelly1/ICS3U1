/* Kelly Wang ICS3U 2025-03-30

"NumberSum"
   
a program that continuously asks for a letter, and stops when a non-alphabet character is entered.  Then it outputs the number of upper case letters, lower case letters, and vowels entered.
*/
import java.util.*;
import java.lang.*;
public class NumberSum{
   public static void main(String[] args){
      // Variable declaration
      int totalNum=0;
      int intSum=0;
      int userInt=0;
      
      // Create Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for information
      System.out.println("How many integers will be added?");
      totalNum = sc.nextInt();
      
      // loop
      for(int i =1; i <= totalNum; i++)    
      {
         System.out.println("Enter an integer: ");
         userInt = sc.nextInt();
         intSum += userInt;
      }
      
      // Print results
      System.out.printf("The sum is %d.", intSum);
   }
}