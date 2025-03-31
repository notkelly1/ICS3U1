/* Kelly Wang ICS3U 2025-03-30

"SquareCube"
   
a program that adds up the squares and adds up the cubes of integers from 1 to N, where N is entered by the user
*/
import java.util.*;
import java.lang.*;
public class SquareCube{
   public static void main(String[] args){
      // Variable declaration
      int upperLimit;
      int sumSquares = 0;
      int sumCubes = 0;
            
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