/* Kelly Wang ICS3U 2025-03-30

"SquareCube"
   
a program that continuously asks for a letter, and stops when a non-alphabet character is entered.  Then it outputs the number of upper case letters, lower case letters, and vowels entered.
*/
import java.util.*;
import java.lang.*;
public class SquareCube{
   public static void main(String[] args){
      // Variable declaration
      int upperLimit;
      int sumSquares = 0;
      int sumCubes = 0;
      //int userInput;
      
      // Create Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for information
      System.out.println("Upper Limit:");
      upperLimit = sc.nextInt();
      
      // loop
      for(int i=1; i <= upperLimit; i++)
      {
         sumSquares= sumSquares + (int)Math.pow(i, 2);
         sumCubes= sumCubes + (int)Math.pow(i, 3);
      }
      
      // Print statement
      System.out.printf("\nThe sum of Squares is %d\nThe sum of Cubes is %d", sumSquares, sumCubes);
      
   }
}