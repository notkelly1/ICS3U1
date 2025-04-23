/* Kelly Wang ICS3U 2025-04-22

"RandomNum"

a program that will print out a random number between 0 and 100.
*/
import java.util.*;
import java.lang.*;
public class RandomNum{
   public static void main(String[] args) {
      // Generate and Print Random Number
      System.out.printf("Here is a random number between 0 and 100: %.0f", (Math.random()*100));
   }
}