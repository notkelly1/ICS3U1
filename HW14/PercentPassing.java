/* Kelly Wang ICS3U 2025-03-26

"PercentPassing"

a program that prompts the user for a set of scores and then calculates the percentage of scores above 70.  
*/
import java.util.*;
import java.lang.*;
public class PercentPassing{
   public static void main(String[] args) {          
      // Variable declaration
      int userInput = 0;
      double scoresAbove70 = 0;
      double totalScores = 0;      
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for set of scores.
      System.out.println("Please input your scores, and enter a negative score to terminate the list.");
          
      // While loop to keep track of the scores above 70 & total scores
      while (userInput >= 0)
      {
         userInput = sc.nextInt();
         if(userInput > 70)
         {
            scoresAbove70 = scoresAbove70 + 1;                       
         }         
         totalScores = totalScores + 1;  
      }
      totalScores = totalScores - 1; // to account for the overcounting of the negative number (BUT WHY?)
      System.out.printf("The percentage of scores above 70 is %.2f%%", 100*scoresAbove70/totalScores);                 
   }
}
