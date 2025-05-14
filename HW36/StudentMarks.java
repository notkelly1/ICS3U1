/* Kelly Wang ICS3U 2025-05-12

"StudentMarks"

a program that does the following
Declare and create a 2D array to store the score of 5 tests of each of 10 students
Read input from a text file “marks.txt” to fill in the array
Calculate the average of the five tests for each student, and output the results to the file “result.txt”
Find out the student with the highest overall average, and output the student number to the file “result.txt”
Calculate the class average of each test and output the result to file “result.txt”
*/

import java.util.*;
import java.lang.*;
import java.io.*;
public class StudentMarks{
   public static void main(String[] args) {
      // Constant Declaration
      final String INPUT_FILE = ("marks.txt");
      final String OUTPUT_FILE = ("result.txt");
      
      // Variable Declaration
      int rows = 0;
      int cols = 0;
      int bestStudent = 0;
      double sum = 0;
      double average;
      double maximumAvg = 0;
      double classAvg = 0;
      double[][] marks;
      marks = new double[rows][cols];
      
      // Try catch
      try
      {
         BufferedReader in = new BufferedReader(new FileReader(INPUT_FILE));
         // Initialize array with values read
         cols = Integer.parseInt(in.readLine()); 
         rows = Integer.parseInt(in.readLine()); 
         marks = new double[rows][cols];
         
         // Initilaize scanner to read file input
         Scanner fs = new Scanner(new File(INPUT_FILE));
         for(int r = 0; r < rows; r++)
         {
            for(int c = 0; c < cols; c++)
            {
               marks[r][c] = fs.nextDouble();
               //System.out.print(""+ marks[r][c] + " ");
            }
            //System.out.println();
         }
         in.close();
      }
      catch(IOException e)
      {}
      
      // new try catch to do file output
      try
      {
      BufferedWriter out = new BufferedWriter(new FileWriter(OUTPUT_FILE, false));
         for(int r = 0; r < rows; r++)
         {
            for(int c = 0; c < cols; c++)
            {
               sum += marks[r][c];               
            }
            
            // Find the average 
            average = sum/cols;
            
            // Keep track of the maximum average
            if(maximumAvg < average)
            {
               maximumAvg = average;
               //System.out.printf("%.2f\n",maximumAvg);
               bestStudent = r;
            }
            
            // write the avg in a new file 
            out.write("The average of student " + r + " is " + average + "\n");
                        
            // set the sum to 0
            sum = 0;            
         }
         // Write conclusion outside of the loop
         out.write("The student with the highest average of " + maximumAvg + " is student number " + bestStudent + "\n");
         out.close();
      }
      catch(IOException e)
      {}
      
      // Final try catch
      try
      {
      // Buffered Writer
      BufferedWriter out = new BufferedWriter(new FileWriter(OUTPUT_FILE, true));
         for(int c = 0; c < cols; c++)
         {
            for(int r = 0; r < rows; r++)
            {
               classAvg += marks[r][c];               
            }
            out.write("The average for test " + c + " is " + classAvg + "\n");
         }
      out.close();
      }      
      catch(IOException e)
      {}
   }
}