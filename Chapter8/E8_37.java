import java.util.Scanner;

public class E8_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What the ")

		System.out.println("The correct count is " + startTest(input)) " out of 10";
	}

	public static int startTest(Scanner input) {
		String[][] capitals = {
			{"Alabama", "Montgomery"},
			{"Alaska", "Juneau"},
			{"Arizona", "Phoenix"},
			{"Arkansas", "Little Rock"},
			{"California", "Sacramento"},
			{"Colorado", "Denver"},
			{"Connecticut", "Hartford"},
			{"Delaware", "Dover"},
			{"Florida", "Tallahassee"},
			{"Georgia", "Atlanta"},
			
		};

		int count = 0;

		for (int i = 0; i < capitals.length; i++) {
			System.out.print("What is the capital of " + capitals[i][0] + "? ");
			if (input.nextLine().toLowerCase().equals(capitals[i][1].toLowerCase())) {
				System.out.println("Your answer is correct");
				count++;
			} else {
				System.out.println("The correct answer should be " + capitals[i][1]);
			}
		}

		return count;
	}
}