/* Kelly Wang ICS3U 2025-03-26

"Count3"

a while loop that outputs numbers from a to b where a and b are entered by the user.  
*/
import java.util.*;
import java.lang.*;
public class Count3{
   public static void main(String[] args) {
      // Variable declaration
      int a;
      int b;      
      int greaterNum ; // did I have to create variables to store these, also since the initialization is in the for loop i put dummy values
      int smallerNum ; 
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for a and b
      System.out.println("Please input two numbers, a and b. Press enter when entering a new number.");
      a = sc.nextInt();
      b = sc.nextInt(); // one prompt per input 
      
      // Determine smaller number and greater number
      if(a < b)
      {
         smallerNum = a;
         greaterNum = b;
      }
      else
      {
         smallerNum = b;
         greaterNum = a;
      }
          
      // While loop to continuously add and print until upper bound is reached
      while (smallerNum < greaterNum)
      {
         smallerNum = smallerNum + 1;
         System.out.println(smallerNum);
      }
   }
}