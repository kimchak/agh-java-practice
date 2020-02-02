import java.io.*;

public class Program2 {
   public static void main(String[] args) {
      try {
      int x, y, pole, obwod;
      System.out.println("Podaj pierwszš, dowolna liczbe calkowita: ");
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));      
      x = Integer.parseInt(in.readLine());
      System.out.println("Podaj druga, dowolna liczbe calkowita: ");
      BufferedReader nin = new BufferedReader(new InputStreamReader(System.in));      
      y = Integer.parseInt(nin.readLine());
//      zmiana na pole prostokata
      pole = x*y;
      obwod = 2*x+2*y;
      System.out.println("Pole prostokšta o boku "+x+" i " +y +" wynosi: "+pole);
      System.out.println("Obwód prostokšta o boku "+x+" i " +y+ " wynosi: "+obwod);
      } catch (IOException e) {
      }
   }
}
