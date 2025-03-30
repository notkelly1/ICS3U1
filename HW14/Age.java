/* Kelly Wang ICS3U 2025-03-26

"Age"

a program that asks the user to guess your age.
*/
import java.util.*;
import java.lang.*;
public class Age{
   public static void main(String[] args) {
      // Constant declaration
      final int CORRECT_AGE = 16;
      
      // Variable declaration
      int userInput = 0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for guess
      System.out.println("Please guess my age, and keep guessing until you get it right!");
          
      // While loop to continuously prompt for guess until correct answer reached
      while (userInput != CORRECT_AGE)
      {
         userInput = sc.nextInt();
            /*if(userInput < 1 || userInput > 20)
            {
               System.out.println("Please input an integer from 1 to 20!!");
            } */        
         //System.out.println("Wrong answer!! Guess again");  
      }
      System.out.print("You got it right!");    
             
   }
}
