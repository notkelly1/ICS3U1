import java.util.*;
public class SigmaOnTheWall
{
   public static void main(String[] args)
   {
     int a = 6;
     int b = 3;
     float c = 3.5f;
     char e = 'd';
     int f;
     
     a = 4;
     /*a = 4.5; // a is an int but this is not.*/
     b = 4.5 + b; // b is an int, but  a + b takes the most recent assignments, and so it would equal to 3 + 4.5 which is 7.5, not an int
     
     //c = a + b;
     //e = e;
     //e = "h";
     //e = "def"; // e is a char, “def” is a string.
     b = 3 / 5; // b  is an int, but ⅗ is not an int.
     //b = f; 
     
     System.out.print("" + a + "" + e + "" + b);
   }
}
