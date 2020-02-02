import java.io.*;

public class Program4 {
   public static void main(String[] args) {
      try {
         int a;
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         do {
             System.out.print("Input a number between 1 and 6: "); 
               try
               {
                    a = Integer.parseInt(in.readLine());
                    break;
               }
               catch (NumberFormatException e)
               {
                 System.out.println("Not an integer! Try again.");
               }
             } while (true);
         switch (a) {
         case 1:
            System.out.println("Point (a=1)");
            break;
         case 2:
            System.out.println("Line segment (a=2)");
            break;
         case 3:
            System.out.println("Triangle (a=3)");
            break;
         case 4:
            System.out.println("Rectangle (a=4)");
            break;
         default:
            System.out.println("Polygon (a>4)");
            break;
         }
      } catch (IOException e) {
      }
   }
}

