import java.util.Scanner;

public class ParseStrings {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput = "";
		boolean endProgram = false;

		while (!endProgram) {
			System.out.println("Enter input string: ");
			userInput = scnr.nextLine();

			if (userInput.equals("q")) {
				endProgram = true;
			}

			else if (userInput.contains(",")) {
				String[] word = userInput.trim().split("\\s*,\\s*");
				System.out.println("First word: " + word[0]);
				System.out.println("Second word: " + word[1]);
				System.out.println("\n");
			}

			else {
				System.out.println("Error: No comma in string");
			}
		}
	}
}