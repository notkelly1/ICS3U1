/* Kelly Wang ICS3U 2025-03-LENGTH26

"Array1DOddEven"

a program to input 10 integers into a 1D array, then check and output a message indicating whether or not all 10 integers were odd or even.
*/
import java.util.*;
import java.lang.*;
public class Array1DOddEven{
   public static void main(String[] args) {
      // Constant Declaration
      final int LENGTH = 10;
      
      // Variable declaration and Initialization 
      int[]arrayNums = new int [LENGTH];      
      int oddNums= 0;   
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Fill array wih values      
      for(int i = 0; i < LENGTH; i++)
      {
         System.out.print("Please enter a number: ");
         arrayNums[i] = sc.nextInt();
      }
      
      // Read all integers and determine if they are odd or even
      for(int i = 0; i < LENGTH; i++)
      {
         if(arrayNums[i]%2 != 0)
         {
            oddNums++;
         }
      }
      
      // Determine if the array has all odd or all even
      if(LENGTH == oddNums)
      {
         System.out.println("All 10 integers were odd.");
      }
      else if(oddNums == 0)
      {
         System.out.println("All 10 integers were even.");
      }
      else
      {
         System.out.println("There was a mix of odd and even integers.");
      }
   }
}