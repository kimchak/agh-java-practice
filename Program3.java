import java.io.*;

public class Program3 {
   public static void main(String[] args) {
      try {
         int x;
         System.out.println("Podaj dowolna liczbe calkowita: ");
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         x = Integer.parseInt(in.readLine());
         if (x%3 == 0)
            System.out.println("Liczba podzielna przez 3");
         else {
            System.out.println("Liczba niepodzielna przez 3");
         	System.out.println("Reszta z dzielenia : " + x%3);}
      } catch (IOException e) {
      }
   }
}


/*
 * Cwiczenia:
 * 1. Zmodyfkuj program tak, aby sprawdzane bylo czy liczba jest 
 * podzielna przez np. 3 oraz wyswietl reszte z dzielenia.
 */