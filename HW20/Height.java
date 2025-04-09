/* Kelly Wang ICS3U 2025-04-08

"Height"

a program to read in a series of heights of 20 people and output all those that are above the average in height for the group
*/
import java.util.*;
import java.lang.*;
public class Height{
   public static void main(String[] args) {
      // Constant declaration
      final int DATA_COUNT = 20;
      
      // Variable declaration
      int[] heights;
      heights = new int[DATA_COUNT];
      int sumHeights=0;
      double avgHeight=0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // For loop to record all the heights
      for (int i = 0; i < DATA_COUNT; i++)
      {
         System.out.print("Please input a height in cm: ");
         heights[i]  = sc.nextInt();
         sumHeights += heights[i];                     
      }
      avgHeight = sumHeights/(double)DATA_COUNT;
      System.out.printf("The average height is %.2f cm", avgHeight);
      
      // for loop to read all heights, if statement to determine those above average height (can be combined in one?)
      for(int j = 0; j < DATA_COUNT; j++)
      {
         if(heights[j]>avgHeight)
         {
            System.out.printf("\n%d cm is above average height.", heights[j]);
         }      
      }      
   }
}