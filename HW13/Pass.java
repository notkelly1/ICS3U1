/* Kelly Wang ICS3U 2025-03-21

"Pass"

a program derivative of Pass.java from exercise 12, also randomizing the operation performed using a random int from 0-3
*/
import java.util.*;
import java.lang.*;
public class Pass{
   public static void main(String[] args) {
      // Variable Declaration
      int userAns;
      int num1 = (int) (Math.random() * 10);
      int num2 = (int) (Math.random() * 10);
      int randOperation = (int) (Math.random() * 4);
      String randOperationString = "";
      int correctAns = 1; // dummy var.

      // Creating scanner
      Scanner sc = new Scanner(System.in);   
      
      // Determine Random Operation Performed using Switch Case
      switch(randOperation)
      {
         case 0:
            randOperationString = " + ";
            correctAns = num1 + num2;
            break;
         case 1:
            randOperationString = " - ";
            correctAns = num1 - num2;
            break;
         case 2:
            randOperationString = " x ";
            correctAns = num1 * num2;
            break;
         case 3:
            randOperationString = " / ";
            correctAns = num1 / num2;
            break;
      }   
         
      // Prompt user 
      //0.3750.System.out.println(randOperation);
      System.out.println("What is " + num1 + randOperationString + num2 + "? (note: perform integer division if operation is /)");
      userAns = sc.nextInt();
      
          
      // Output whether or not the user is correct
      System.out.print("\nYou are ");
      if(correctAns!=userAns)
      {
         System.out.print("not ");
      }
      System.out.print("correct!");              
   }
}