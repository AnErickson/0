import java.util.Scanner;

public class FiveSeventeen {
	public static void main(String[] args) {
		
		// Andrew Erickson 10-3-18

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int numberOfLines = input.nextInt();

		for (int rows = 1; rows <= numberOfLines; rows++) {

			for (int s = numberOfLines - rows; s >= 1; s--) {
				System.out.print("   ");
			}

			for (int l = rows; l >= 2; l--) {
				if(l > 9){
				System.out.print(" " + l);
				}
				else {
				System.out.print("  " + l);

				}
			}

			for (int r = 1; r <= rows; r++) {
				if(r > 9){
				System.out.print(" " + r);
				}
				else {
				System.out.print("  " + r);

				}
				
			}

			System.out.println();
		}
		
	}
		
}