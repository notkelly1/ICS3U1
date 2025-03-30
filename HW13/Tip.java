/* Kelly Wang ICS3U 2025-03-21

"Tip"

a program that asks the user what letter grade they are getting in their computer science course (A, B, C, D, F) 
*/
import java.util.*;
import java.lang.*;
public class Tip{
   public static void main(String[] args) {
      // Constant declarations
      
      // Variable declarations
         String userInput;
                  
      // Creating Scanner
      Scanner sc = new Scanner(System.in);   
      
      // Prompt user for grade
      System.out.print("\nPlease input your letter grade: ");
      userInput = sc.nextLine();
      
       // Output a different tip depending on their grade
      switch(userInput)
      {
         case "A":
         case "a":
            System.out.print("\nKeep up the great work!");
            break;         
         case "B":
         case "b":
            System.out.print("\nGood job! There is still room to improve!!");
            break;
         case "C":
         case "c":
            System.out.print("\nC is for cool!! There is still room for improvement!");
            break;
         case "D":
         case "d":
            System.out.print("\nAlmost passing! Try harder!!");
            break;
         case "F":
         case "f":
            System.out.print("\nLOCK IN BRO!!!!!!!!!!!!!!!!!!");
            break;
      }


   }
}