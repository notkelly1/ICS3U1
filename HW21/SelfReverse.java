/* Kelly Wang ICS3U 2025-04-08

"SelfReverse"

 a program that creates two arrays of size 10 list1 and list2.  The program would fill list1 with user input; list2 gets the elements of list1 in reversed order.
 */
import java.util.*;
import java.lang.*;
public class SelfReverse{
   public static void main(String[] args) {
      // Variable declaration
      int[]list1;           
      int n;
      int valueSaver = 0;      
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for size of array
      System.out.print("Please input the size of the array: ");
      n = sc.nextInt();
      list1 = new int[n]; // can this be here instead 
      
      // For loop to let user fill array
      for(int i = 0; i < n; i++)
      {
         System.out.print("Please input a term: ");
         list1[i] = sc.nextInt();
      }
      
      // For loop to reverse array
      for(int j = 0; j < n/2; j++)
      {
         valueSaver = list1[n-j-1];
         list1[n-j-1] = list1[j];
         list1[j] = valueSaver;         
      }
      
      // For loop to print array
      for(int k = 0; k < n; k++)
      {
         System.out.printf("\n%d", list1[k]);
      }   
   }
}