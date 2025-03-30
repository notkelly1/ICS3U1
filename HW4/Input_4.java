/*
A program that asks the user for two words, then printing them in a specific way.
Written by Kelly Wang on Feb. 19. 2025

*/

import java.util.*;
public class Input_4
{
   public static void main(String[] args)
   {
      String word1;
      String word2;
      Scanner sc = new Scanner (System.in);
   
      System.out.print("\nPlease type in a word and press enter: "); //prompt for user
      word1 = sc.nextLine(); //saves the string, AKA the first word
      
      System.out.print("\nPlease type in another word and press enter: "); //prompt for user
      word2 = sc.nextLine(); //saves the string, AKA the second word
   
      System.out.println(word1 + "\n" + word2 + "\n" + word1 + " " + word2); //prints the words
   }
}