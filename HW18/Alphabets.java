/* Kelly Wang ICS3U 2025-03-30

"Alphabets"
   
a program that continuously asks for a letter, and stops when a non-alphabet character is entered.  Then it outputs the number of upper case letters, lower case letters, and vowels entered.
*/
import java.util.*;
import java.lang.*;
public class Alphabets{
   public static void main(String[] args){
      // Variable declaration
      char userInput;
      int upperCaseCount = 0;
      int lowerCaseCount = 0;
      int vowelCount = 0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      //do while loop to repeatedly prompt
      do
         {
            // Prompt user for character
            System.out.println("Please enter a letter: ");
            userInput = sc.nextLine().charAt(0);
                     
            //Switch case to count vowels
            switch(userInput)
            {
               case 'a':
               case 'A':
               case 'e':
               case 'E':
               case 'i':
               case 'I':
               case 'o':
               case 'O':
               case 'u':
               case 'U':
               case 'y':
               case 'Y':
                  vowelCount++;
                  break;            
            }
           
           // if statement to count uppercase, else is filtered because initial while statement only runs if it is a letter.
           if(userInput >= 'A' && userInput <= 'Z')
           {
               upperCaseCount++;
           }
           else if((userInput >= 'a')&&(userInput <= 'z'))
           {
               lowerCaseCount++;
           }
         }
      while((userInput >= 'A' && userInput <= 'Z') || ((userInput >= 'a')&&(userInput <= 'z')));
      
      // Print results
      System.out.printf("\nUpper case letters: %d\nLower case letters: %d\nVowels: %d", upperCaseCount, lowerCaseCount, vowelCount);    
   }
}