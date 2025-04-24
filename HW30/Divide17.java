/* Kelly Wang ICS3U 2025-04-22

"Divide17"

 a program that outputs the sum of each digit in a number entered by the user.
*/
import java.util.*;
import java.lang.*;
public class Divide17{
   public static void main(String[] args) {
      // Variable declaration
      String num1, num2, numJoined;
      int actualNumber = 0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for strings
      System.out.print("Input any string of numbers: ");
      num1 = sc.nextLine();
      
      System.out.print("Input another string of numbers: ");
      num2 = sc.nextLine();
      
      // Join numbers together
      numJoined = num1 + num2;
      System.out.printf("The combined string is %s\n", numJoined);
      System.out.println("The length is " + numJoined.length());
      
      // Isolate digits using substring, convert using parseInt
      for(int i =0; i < numJoined.length(); i++)
      {
         
         // System.out.println(Integer.parseInt);
         //actualNumber += (Integer.parseInt(numJoined.substring(i)) * (Math.pow(10, numJoined.length()-i)));
         //System.out.println(numJoined.substring(i, i+1));
         actualNumber += Integer.parseInt(numJoined.substring(i, i+1)) * ((int) Math.pow(10, numJoined.length()-i-1));
         //System.out.println(actualNumber);         
         //System.out.println(Integer.parseInt(numJoined.substring(i)) * (Math.pow(10, num1.length()+num2.length())-i));
      } 
      System.out.printf("The result of the new number divided by 17 is: %.2f",actualNumber/17.0);     
   }
}