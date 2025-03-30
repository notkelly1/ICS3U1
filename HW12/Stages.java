/* Kelly Wang ICS3U 2025-03-21

"Stages"

a program that prompts user for an age.  For an age over 18, adult is displayed.  For an age less than or equal to 18, toddler is displayed when the age is less than or equal to 5, child when the age is less than or equal to 10, preteen when the age is less than or equal to 12, and teen when the age is over 12.
*/
import java.util.*;
import java.lang.*;
public class Stages{
   public static void main(String[] args) {
      // Constant declaration
      final int ADULT = 18;
      final int CHILD = 10;
      final int TODDLER = 5;
      final int PRETEEN = 12;
      
      // Variable declaration
      int userAge;      
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for age
      System.out.println("Please input your age.");
      userAge = sc.nextInt();
      
      // Output age range of user
      if(userAge > 0)
      {
         if(userAge > ADULT)
         {
            System.out.printf("\n%d, adult", userAge);
         }
         else if(userAge > PRETEEN)
         {
            System.out.printf("\n%d, teen", userAge);
         }
         else if(userAge > CHILD)
         {
            System.out.printf("\n%d, preteen", userAge);
         }
         else if (userAge > TODDLER)
         {
            System.out.printf("\n%d, child", userAge);
         }
         else
         {
            System.out.printf("\n%d, toddler", userAge);
         }
      }
   }
}