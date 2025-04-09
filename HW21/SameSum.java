/* Kelly Wang ICS3U 2025-04-08

"SameSum"

a program that creates two arrays of size 10 list1 and list2.  The program would fill list1 with user input, and put values into list2 so that the sum of corresponding cells in list1 and list2 is 25.
*/
import java.util.*;
import java.lang.*;
public class SameSum{
   public static void main(String[] args) {
      // Constant Declaration
      final int DATA_COUNT = 10;
      final int CORRESPONDING_SUM = 25;
      
      // Variable declaration
      int[]list1;
      list1 = new int[DATA_COUNT];
      
      int[]list2;
      list2 = new int[DATA_COUNT]; // can arrays be declared using the same line
      
      int maxNum= 0;
      int secondMaxNum = 0;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // User Input      
      for(int i = 0; i < DATA_COUNT; i++)
      {
         System.out.printf("\nEnter a value: ");
         list1[i] = sc.nextInt();
         list2[i] = CORRESPONDING_SUM-list1[i];
         System.out.printf("\n%d, %d", list1[i], list2[i]);
      }
   }
}