/* Kelly Wang ICS3U 2025-03-26

"Guess"

 a while loop that allows the user to guess a number between 1 and 20 until he gets it right or inputs a number out of range
*/
import java.util.*;
import java.lang.*;
public class Guess{
   public static void main(String[] args) {
      // Constant declaration
      final int CORRECT_NUM = 19;
      
      // Variable declaration
      int userInput = 0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for guess
      System.out.println("Please input your guess, it has to be an integer from 1 to 20. Keep inputting until you get it right!");
          
      // While loop to continuously prompt for guess until correct answer reached
      while (userInput != CORRECT_NUM)
      {
         userInput = sc.nextInt();
            if(userInput < 1 || userInput > 20)
            {
               System.out.println("Please input an integer from 1 to 20!!");
            }         
         //System.out.println("Wrong answer!! Guess again");  
      }
      System.out.print("You got the right number!");    
             
   }
}
