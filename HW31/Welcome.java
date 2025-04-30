/* Kelly Wang ICS3U 2025-04-25

"Welcome"

method for the following header.  
public static String welcomeMessage (String name, int visitorNum)
*/
import java.util.*;
import java.lang.*;
public class Welcome{
   public static void main(String[] args) {
      // Constant declarations
      final int visitorNum = 5;
      final String visitorName = "Joe";
      
      // Print welcome mesage
      System.out.println(welcomeMessage(visitorName, visitorNum));
   }
   /*  
   Method name: "welcomeMessage"
   Return type: String (visitor number and name)
   Parameters: String name (visitor name), int visitorNum (visitor number)
   Description: outputs a welcome message.
   */
   public static String welcomeMessage (String name, int visitorNum){
      String message = "Welcome " + name + "!  You are visitor number " + visitorNum; 
   return message;     
   }
}