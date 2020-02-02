import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		String g;
		char k;
		Scanner input = new Scanner(System.in);
		// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("Podaj dowolny znak.");
			System.out.println("(Aby wyjsc z petli wpisz 'quit'):");
			g = input.nextLine();
			k = g.charAt(0);
			System.out.println("Wybrano " + k);
		} while (!g.equalsIgnoreCase("quit"));
	input.close();
	}
}

/*
 * Cwiczenia: 1. Zmien warunek zakonczenia programu na "quit"
 */