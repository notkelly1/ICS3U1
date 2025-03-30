public class OutputPrintfSilly
{
   public static void main(String[] args)
   {
   System.out.printf("%28s1234567890\n", "");
   //System.out.printf("%d%n", 500000);
   //System.out.printf("%+d%n>", 500000);
   //System.out.printf("%+,d%n>", 500000);
   //System.out.printf("%+,10d%n>", 500000);
   //System.out.printf("%+,010d%n", 500000);
   //System.out.printf("%-+,10d%n", 500000);
   //System.out.printf("I love %-5s%5s%n", "ics", "3u1");
   //System.out.printf("I love %5S%-5S%n", "ics", "3u1");
   //System.out.printf("The average of this class is %6.2f%n", 67.8);
   System.out.printf("The subtotal is %-5.2f and the total price is %5.2f%n", 2.30, 3.99 );
   System.out.printf("The subtotal is %.2f and the total price is %.2f%n", 2.30, 3.99 );
   }
}