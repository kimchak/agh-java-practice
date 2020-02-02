import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		String g;
		char k;
		Scanner input = new Scanner(System.in);
		// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("Input any character.");
			System.out.println("(In order to quit type 'quit'):");
			g = input.nextLine();
			k = g.charAt(0);
			System.out.println("Chosen character: " + k);
		} while (!g.equalsIgnoreCase("quit"));
	input.close();
	}
}
