/* Kelly Wang ICS3U 2025-04-08

"Marks"

a program to read in a series of heights of 20 people and output all those that are above the average in height for the group
*/
import java.util.*;
import java.lang.*;
public class Marks{
   public static void main(String[] args) {
      // Constant declaration
      final int DATA_COUNT = 4;
            
      // Variable declaration
      String[] name;
      name = new String[DATA_COUNT];
      
      int[] mark;
      mark = new int[DATA_COUNT];
      
      int userInput;
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);
      
      // Prompt user for input (fill array with values)
      for(int i=0; i<DATA_COUNT; i++)
      {
         System.out.print("Enter a Name: ");
         name[i]  = sc.nextLine(); 
         System.out.print("\nEnter their mark: ");
         mark[i]  = sc.nextInt(); 
         sc.nextLine();       
         
      }
      
      // Prompt user for input (search)
      System.out.print("Enter the mark you wish to search for: ");
      userInput = sc.nextInt();    
       
      for(int i=0; i<DATA_COUNT; i++)
      {                     
         if(mark[i]==userInput)
         {
            System.out.printf("\nThe mark of %d corresponds to %s", userInput, name[i]);
         }
         else if(i==DATA_COUNT-1)
         {
            System.out.printf("\nSorry, the mark %d can't be found and doesn't exist.", userInput);
         }         
      }          
   }
}