/* Kelly Wang ICS3U 2025-04-08

"TwoLargest"

a program that creates an array of size 10, and fills it with random numbers.  It then traverses and writes out the two largest elements in the array.
*/
import java.util.*;
import java.lang.*;
public class TwoLargest{
   public static void main(String[] args) {
      // Constant Declaration
      final int DATA_COUNT = 10;
      
      // Variable declaration
      int[]randomNumbers;
      randomNumbers = new int[DATA_COUNT];
      
      int maxNum= 0;
      int secondMaxNum = 0;
      
      // Fills with random numbers
      for(int i = 0; i < DATA_COUNT; i++)
      {
         randomNumbers[i] = (int)(Math.random()*100); //random numbers from 0-100 inclusive
         //System.out.println(randomNumbers[i]);
      }
      
      // Reads through list to find largest numbers
      for(int j = 0; j < DATA_COUNT; j++)
      {
         if(randomNumbers[j] > maxNum)
         {
            maxNum = randomNumbers[j];
         }
      }
      
      for(int k = 0; k < DATA_COUNT; k++) 
      {
         if(randomNumbers[k] < maxNum && (randomNumbers[k] > secondMaxNum))
         {
            secondMaxNum = randomNumbers[k];
         }
      }
      
      // Prints the two largest numbers
      System.out.printf("\nThe two largest numbers are %d, %d", maxNum, secondMaxNum);     
   }
}