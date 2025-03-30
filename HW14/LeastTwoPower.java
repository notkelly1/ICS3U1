/* Kelly Wang ICS3U 2025-03-26

"LeastTwoPower"

a program that reads a positive integer and then finds the smallest power of two that is greater than or equal to the number that are read. 
*/
import java.util.*;
import java.lang.*;
public class LeastTwoPower{
   public static void main(String[] args) {      
      // Variable declaration
      int userInput = 0;
      int exponent = 0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for guess
      System.out.println("Please input a positive integer.");
      userInput = sc.nextInt();
          
      // While loop to keep track of the power (which i named "exponent")
      while (userInput > Math.pow(2, exponent)) //I used math.pow to evaluate and the while loop to keep track of the exponent (i realized it should have been more accurately described as power too late and im too lazy to change all my variables)
      {       
         exponent = exponent + 1;         
      }
      //System.out.print("The smallest power of two greater than or equal to your number is 2 to the power of " + exponent + " or " + Math.pow(2, exponent));
      System.out.printf("The smallest power of two greater than or equal to your number is %.0f, or 2 to the power of %d", Math.pow(2, exponent), exponent); // more beautiful as it can truncate the double provided by pwr function
                             
   }
}
