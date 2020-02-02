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
               System.out.println("Iloœæ prób: " +tries);
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


/*
 * Cwiczenia:
 * 1. Wprowadz podawanie gornej granicy przedzialu losowania 
 * przez uzytkownika.
 * 2. Dodaj komunikat wyswietlajacy informacje za ktorym razem udalo sie
 * odgadnac.
 * 3. Wprowadz wyswietlanie dodatkowego komunikatu, gdy uda sie odgadnac
 * w 5 lub mniej probach
 */
