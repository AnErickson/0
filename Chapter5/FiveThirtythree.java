import java.util.Scanner;

class FiveThirtythree {
	public static void main(String[] args) {
		
		//Andrew Erickson
		
		Scanner input = new Scanner(System.in);
		int numlines = 0;
		
		System.out.print("Enter the number of lines: ");
		numlines= input.nextInt();
		
		
	if (numlines < 1 || numlines > 15){
		System.out.println(" Invalid Input: the number entered must be between 1 and 15");
	}
	else {
		for (int row = 1; row <= numlines; row++){
			
			for (int space = 1; space <= numlines - row; space++){
				System.out.print("   ");
			}
			
			for (int left = row; left > 0; left--) {
				System.out.print((left > 9) ? " " + left : "  " + left);
				
			}
			
			for (int right = 2; right <= row; right++){
				System.out.print((right > 9) ? " " + right : "  " + right);
			}
			
			System.out.println();
			}
		
		}
	}
}