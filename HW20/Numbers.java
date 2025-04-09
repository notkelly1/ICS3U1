/* Kelly Wang ICS3U 2025-04-08

"Numbers"

a program to read in a series of heights of 20 people and output all those that are above the average in height for the group
*/
import java.util.*;
import java.lang.*;
public class Numbers{
   public static void main(String[] args) {
      // Constant declaration
      final int DATA_COUNT = 6;
      final int UPPER_THRESHOLD = 50;
      
      // Variable declaration
      double[] numbers;
      numbers = new double[DATA_COUNT];

      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Read list
      for(int i=0; i<DATA_COUNT; i++)
      {
         System.out.println("Enter a value: ");
         numbers[i]  = sc.nextInt();
      }
      
      System.out.printf("\nHere are the values printed in reverse: ");
      //Print in reverse and add 10% to each value
      for(int j=DATA_COUNT-1; j>=0; j--) //better way? -1 is kind of stupid
      {
         System.out.printf("\n%.2f", numbers[j]); //truncate?
         numbers[j]*=1.1;
         //System.out.printf("\n%.2f", numbers[j]);
      }
      
      System.out.printf("\nHere are the values above %d: ", UPPER_THRESHOLD);
      // for loop to read all heights, if statement to determine those above average height (can be combined in one?)
      for(int k = 0; k < DATA_COUNT; k++)
      {
         if(numbers[k]>UPPER_THRESHOLD)
         {
            System.out.printf("\n%.2f", numbers[k]);
         }      
      }      
   }
}