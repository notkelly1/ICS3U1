/* Kelly Wang ICS3U 2025-04-03

"PythagoreanTriples"
   
a program that first prompts the user for a positive integer and then finds and prints all Pythagorean triplets whose largest member is less than or equal to that integer.
*/
import java.util.*;
import java.lang.*;
public class PythagoreanTriples{
   public static void main(String[] args){
      // Variable declaration
      int userInput;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user
      System.out.print("Enter a positive integer: ");
      userInput = sc.nextInt();
          
      // Print pythagorean triples (nested loop is used for combinations)
      for(int c=3; c<=userInput; c++) //c constrains the most therefore it is the outer loop  
      {
         for(int b=2; b<c; b++) // smallest it can be is 2
         {
            for(int a=1; a<b; a++) // smallest & positive int, smallest it can be is 1
            {
               if((Math.pow(a, 2)) + (Math.pow(b, 2)) == (Math.pow(c, 2)))
               //if(((int)Math.pow(a, 2)) + ((int)Math.pow(b, 2)) == ((int)Math.pow(c, 2)))
               {
                  System.out.printf("\n%d, %d, %d", a, b, c);
               }
            }
         }
      }      
   }
}