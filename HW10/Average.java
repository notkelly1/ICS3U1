/* Kelly Wang ICS3U 2025-03-04

"Average"

a program that prompts the user for five grades and then displays the average of the grades.*/
import java.util.*;
public class Average
{
    public static void main(String[] args)
    {
       
       final double NUM_STUDENT = 5d;     
       
       int g1, g2, g3, g4, g5;
       double avgGrade;
       int sumGrade;
       Scanner sc = new Scanner (System.in);
       
       System.out.println("Enter grades, and put spaces between each individual's grade:");
       
       g1 = sc.nextInt();
       g2 = sc.nextInt();
       g3 = sc.nextInt();
       g4 = sc.nextInt();
       g5 = sc.nextInt();
              
       sumGrade = g1 + g2 + g3 + g4 + g5;
       avgGrade = sumGrade/NUM_STUDENT;
            
       System.out.printf("\nThe average is %.0f. ", avgGrade);    
     
    }
}
