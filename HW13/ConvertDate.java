/* Kelly Wang ICS3U 2025-03-21

"ConvertDate"

a program that reads a date in numeric form as a year followed by a month followed by a day and then prints the date as one might on a cheque. 
*/
import java.util.*;
import java.lang.*;
public class ConvertDate{
   public static void main(String[] args) {         
      // Variable declaration
      int year;
      int month;
      int day; 
      String letterMonth = "";
      
      // Creating Scanner
      Scanner sc = new Scanner(System.in);   
      
      // Prompt user for date (YYYY/MM/DD) 
      System.out.println("Enter the Year, Month and Day in numbers. Press enter between each entry to start a new one."); 
      year = sc.nextInt();
      month = sc.nextInt();
      day = sc.nextInt();
      
      // Output the date in one line and write the month using letters
      switch (month)
      {
         //case 01:
         case 1:
            letterMonth = "January";
            break;
         //case 02:
         case 2:
            letterMonth = "Febuary";
            break;
         //case 03:
         case 3:
            letterMonth = "March";
            break;
         //case 04:
         case 4:
            letterMonth = "April";
            break;
         //case 05:
         case 5:
            letterMonth = "May";
            break;
         //case 06:
         case 6:
            letterMonth = "June";
            break;
         //case 07:
         case 7:
            letterMonth = "July";
            break;
         //case 08:
         case 8:
            letterMonth = "August";
            break;
         //case 09:
         case 9:
            letterMonth = "September";
            break;
         case 10:
            letterMonth = "October";
            break;
         case 11:
            letterMonth = "November";
            break;
         case 12:
            letterMonth = "December";
            break;
         default:
            System.out.print("\nPlease input a real month!");                 
      }
      // Print the date
         System.out.printf("%s %d, %d", letterMonth, day, year); 
   }
}