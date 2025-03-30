/* Kelly Wang ICS3U 2025-03-20

"Pass"

a program which displays a math addition question (random numbers), and asks the user for the answer and tells them whether they are correct or not
*/
import java.util.*;
import java.lang.*;
public class Pass{
   public static void main(String[] args) {
      // Variable Declaration
      int userAns;
      int num1 = (int) (Math.random() * 10);
      int num2 = (int) (Math.random() * 10);
      int correctAns;

      // Creating scanner
      Scanner sc = new Scanner(System.in);
      
      // Determine Correct Answer
      correctAns = num1 + num2;
      
      // Prompt user 
      System.out.println("What is " + num1 + " + " + num2 + "?");
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