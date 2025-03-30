/* Kelly Wang ICS3U 2025-03-27

"Unicode"

a do...while loop that displays a Unicode table for the characters from 1..212.
*/
import java.util.*;
import java.lang.*;
public class Unicode{
   public static void main(String[] args) {
      // Variable declaration
      char character = 0;
      int unicode = 0;
            
      // Table Header      
      System.out.printf("%-10s | %10s", "Unicode", "Character");      
      System.out.print("\n___________|_____________");
          
      // do...while loop to keep track of the number and its corresponding char      
      do
      {
        
         unicode = unicode + 1;         
         character = (char) unicode; // cast int to char
         //System.out.println(totalChar + " | " + charCount);
         System.out.printf("\n%-10d | %8c", unicode, character);
         
      }
      while (unicode < 212);                     
   }
}