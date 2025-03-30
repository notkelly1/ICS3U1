/* Kelly Wang ICS3U 2025-03-04

"Height"

a program to input the users height in inches and output their height in centimeters.
*/
import java.util.*;
public class Height
{
    public static void main(String[] args)
    {
       final double CMCONVERSION = 1/2.54;
       
       double userHeight;
       double convertedHeight;
       Scanner sc = new Scanner (System.in);
       
       System.out.print("\nInput your height in inches: ");
       userHeight = sc.nextDouble ();
       convertedHeight = userHeight*CMCONVERSION;
       
       System.out.printf("\nYou are %.2f cm tall.", convertedHeight);    
     
    }
}
