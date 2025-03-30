/* Kelly Wang ICS3U 2025-03-17

"AgeCheck"

a program that asks the user’s age.  If the age is eighteen or more, the program should print “OLD ENOUGH TO VOTE”.  
Otherwise, it prints the number of years before voting is possible. 
*/

import java.util.*;
public class AgeCheck{
   public static void main(String[] args) {   
      // Constant declarations
      final int VOTING_AGE = 18;
      
      // Variable declarations
      int userAge;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for age
      System.out.print("What is your age? ");
      userAge = sc.nextInt();
      
      // Output whether the user is old enough to vote or not
      if(userAge >= VOTING_AGE)
      {
         System.out.print("\nOLD ENOUGH TO VOTE");
      }
      else
      {
         System.out.print("\n You need to wait " + (VOTING_AGE - userAge) + " year(s) to vote!");
      }         
   }
}