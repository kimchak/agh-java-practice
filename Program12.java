import java.io.*;
import java.util.*;

public class Program12 {
   public static void main(String[] args) {
      try {
         int zmienna, szuk, top, tries=1;
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         Random rand = new Random();
         System.out.println("Podaj gorna granice zakresu");
         top = Integer.parseInt(in.readLine());
         szuk = rand.nextInt(top);
         //System.out.println("Bug test: " +szuk);
         while (true) { // lub for (;;)
            System.out.println("Podaj liczbe calk. 0-"+top);
            zmienna = Integer.parseInt(in.readLine());
            if (zmienna == szuk) {
               System.out.println("Brawo, odgadles!");
               System.out.println("Ilość prób: " +tries);
               if (tries<5)
            	   System.out.println("Doskonale!");
               break;
            }
            if (zmienna < szuk) {
               System.out.println("Za malo!");
            	tries++;}
            else {
               System.out.println("Za duzo!");
               tries++;}
         }
      } catch (IOException e) {
      }
   }
}
