public class Program8 {
   public static void main(String[] args) {
      int n = 15;
      float a = (float)2.5, wynik = 1;
      for (int i = 5; i < n; i+=2) {
         wynik = wynik * a;
         System.out.println("i = "+i+"; wynik = "+wynik);
      }
      System.out.println("Wynik koncowy: "+wynik);
   }
}
