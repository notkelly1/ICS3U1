import java.util.*;
public class printF
{
   public static void main(String[] args)
   {
   double price;
   String name;
   String stars = "****";
   Scanner sc = new Scanner (System.in);
   int posNum = 1234;
   int negNum = -4567;
   
   System.out.printf("%d", posNum);
   System.out.printf("%+10d", posNum);
   //order of flags doesnt matter

   System.out.printf("%d", posNum);
   
   System.out.println("1234567890");
   System.out.printf("|%s| \n", stars);
   System.out.printf("|%2s| \n", stars);
   //10 in the line previous is the field width, which is how much space it should take up
   //Flags: - (left align) is the most important one 

   
   /*System.out.printf("Put in the name of your");*/
   name = sc.nextLine (); 
   price = sc.nextDouble();
   
   
   System.out.printf("%s, please pay $%f %n", name, price);
   //printf shows 6 dp. by default for %f
   System.out.printf("%s, please pay $%.2f %n", name, price); 
   // % .2 f .[dp you want]
   System.out.printf("%S!  MONEY ME!  NOW!", name);
   //S makes it all caps
   
   }
}