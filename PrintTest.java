public class PrintTest
{
   public static void main(String[] args)
   {
      System.out.println("First");
      System.out.println("Second");
      
      System.out.print("First");
      System.out.print("Second");
      
      System.out.println("Done?");
      System.out.println("Yes");
      
      System.out.println("Before \nAfter");
      
      System.out.println("(\"_\")");
      System.out.println("\\n/");
      
      // this question will 100% come back on a quiz or test
     
      System.out.println("1 + 2 + 3 + 4 + 5");
      System.out.println(1 + 2 + 3 + 4 + 5); //not a literal string, print statement can do calculation
      System.out.println(1 + 2 + 3 + "4 + 5"); //1+2+3 is 6 which is why it prints 6 and then 4, thus givingt 64 + 5 where 4 + 5 is printed
      System.out.println("1 + 2 + 3" + 4 + 5); //Why is it not it prints 1 + 2 + 3 and then it it adds 4 and then adds 5, is it because the + is in front of the 4?
      //the + sign has two jobs (stick strings together: concatenation)
      //Java decides what the job + will do. If at least one of the things beside the thing is a string
      
      //Order of operations (4gets added first, then 5)
      
      // 1+2+3 is printed as a literal string. it adds 4 and makes iyt a bigger string. 1+2+34 is a iteral string, thereisanother +sign w
   }
}