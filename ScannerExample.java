import java.util.*;
public class ScannerExample
{
   public static void main(String[] args)
   {
      String text; //no data, just create the variab,e
      int wholeNumber;
      double fpNumber; // following line will create the scanner?? will get info from keyboard for you: sc is the variale name
      Scanner sc = new Scanner (System.in);
      
      System.out.println("Please type in a string");
      text = sc.nextLine(); // get a string from keyboard and save it: note that it is next LINE..
      
      System.out.print("Please type in an integer");
      wholeNumber = sc.nextInt();
      
      System.out.print("Please type in a floating point number");
      fpNumber = sc.nextDouble();
      
      System.out.println("\nThe String you typed in was:\n" + text);
      //system.out.println(fpNumber); how to print a variable as a string not as the letters of the variable?!?!
      }
}