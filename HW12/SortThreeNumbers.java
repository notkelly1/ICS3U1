/* Kelly Wang ICS3U 2025-03-20

"SortThreeNumbers"

a program that prompts for three positive, whole numbers.  If all inputs are valid (no zero or negative values), output the three numbers in ascending order, otherwise, output an error message.
*/
import java.util.*;
import java.lang.*;
public class SortThreeNumbers{
   public static void main(String[] args) {
      // Variable Declaration
      int num1, num2, num3;
      
      // Creating Scanner 
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for positive whole numbers
      System.out.println("Please input 3 positive whole numbers of your choice. Press enter to input a new value.");
      num1 = sc.nextInt();
      num2 = sc.nextInt();
      num3 = sc.nextInt();
      
      // Output numbers in ascending order after determining validity of inputs
      if(num1 > 0 && num2 > 0 && num3 >0) // check to see if positive int
      {
         if(num1 <= num2 && num1 <= num3)
         {
            if(num2 <= num3)
            {
               System.out.printf("\n%d, %d, %d", num1, num2, num3);
            }
            else //(num3 <= num2)
            {
               System.out.printf("\n%d, %d, %d", num1, num3, num2);
            }
         }
         else if(num2 <= num1 && num2 <= num3)
         {
            if(num1 <= num3)
            {
               System.out.printf("\n%d, %d, %d", num2, num1, num3);
            }
            else //(num3 <= num1)
            {
               System.out.printf("\n%d, %d, %d", num2, num3, num1);
            }
         }
         else //(num3 <= num1 && num3 <= num2)
         {
            if(num1 <= num2)
            {
               System.out.printf("\n%d, %d, %d", num3, num1, num2);
            }
            else //(num2 <= num1)
            {
               System.out.printf("\n%d, %d, %d", num3, num2, num1);
            }
         }         
      }
   }
}