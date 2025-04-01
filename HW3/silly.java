import java.util.*;
public class silly
{
   public static void main(String[] args){
      final int SIZE = 5;
      for (int i = 1; i < SIZE; i++) 
      {
         for (int j = SIZE; j >= i; j--) 
         {
         System.out.println(i * 2 + j);
         }
      }
   }
}
      /*System.out.println(".\n\\\t.hhhh\n.\n."+"A");
      System.out.print("big");
      System.out.println("New\nYork\n");
      System.out.println("apple");
      System.out.println(34.789);
      System.out.println("3" + 3 + 3);
      System.out.println(3 + 3 + "3");
      System.out.println(5+2);  
      System.out.println("5+2");
      System.out.println("5"+"2");
      System.out.println(""+5+2);
      System.out.println(5+2+""); 
      System.out.println (5+"85"+24.2+"\n5*2");*/
