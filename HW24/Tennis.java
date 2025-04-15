/* Kelly Wang ICS3U 2025-03-LENGTH26

"Tennis"

a program to ask the user to input 16 integers into a square array and output the smallest value in the two diagonals.  Your program must use a nested for loop to fill the array, and a separate for loop to search for the smallest value in the diagonals.
*/
import java.util.*;
import java.lang.*;
public class Tennis{
   public static void main(String[] args) {
      //Constant Declaration
      final int SETS = 5;
      final int PLAYERS = 2;
      
      // Variable declaration and initialization of array
      int gameList[][]= new int [PLAYERS][SETS];
      int setsWonP2 = 0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Fill array with values
      for(int player = 0; player < PLAYERS; player++)
      {
         for(int set = 0; set < SETS; set++)
         {
            System.out.printf("Please input the score of player%d, for set %d: ", player+1, set+1);
            gameList[player][set]= sc.nextInt();
         }         
      }
      
      // Compare games for each player      
      for(int set = 0; set < SETS; set++)
      {                  
         if(gameList[0][set] < gameList[PLAYERS-1][set])
         {
            System.out.printf("\nPlayer 2 wins round %d", set+1);
            setsWonP2++;
         }
         else 
         {
            System.out.printf("\nPlayer 1 wins round %d", set+1);
         }           
      }
      
      // Print total results
      System.out.printf("\n\nPlayer 1 won %d games! \nPlayer 2 won %d games!", SETS-setsWonP2, setsWonP2); 
            
   }
}