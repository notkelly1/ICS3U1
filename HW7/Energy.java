/* Kelly Wang ICS3U 2025-02-07 

"Energy"

a program that prompts that user for a mass in kilograms and then displays the energy and the number of light bulbs that could be powered.

*/
import java.util.*;
import java.lang.Math; //import math because I don't want to type out the power: https://www.geeksforgeeks.org/math-pow-method-in-java-with-example/
public class Energy
{
   public static void main(String[] args)
   {
      double m;
      double e;
      double c = 3.0 * Math.pow(10, 8);
      Scanner sc = new Scanner (System.in);
      
      System.out.println("Please type a mass (in kg):"); //asks for a value
      m = sc.nextDouble ();
      
      e = m * Math.pow(c, 2);
      System.out.println("This is the energy that your mass releases after complete conversion: " + e + " Joules");
      
      System.out.println("This is how many 100W lightbulbs you could power with that energy (for an hour): " + e/360000.0 + " lightbulbs");
   }
}