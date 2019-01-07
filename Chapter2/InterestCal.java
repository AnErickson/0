import java.util.Scanner;

public class InterestCal {
	public static void main(String[] args) {
		
		//Andrew Erickson 09-11-18
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount of money to calculate");
		
		double i = input.nextDouble();
		
		double i1 = i * (1 + 0.00417);
		System.out.println("After 2 months the amount of money has grown to " + i1);

		double i2 = (i1 + 100) * (1 + 0.00417);
		System.out.println("After 3 months the amount of money has grown to " + i2);

		double i3 = (i2 + 100)  * (1 + 0.00417);
		System.out.println("After 4 months the amount of money has grown to " + i3);

		double i4 = (i3 + 100) * (1 + 0.00417);
		System.out.println("After 5 months the amount of money has grown to " + i4);

		double i5 = (i4 + 100) * (1 + 0.00417);
		
		System.out.println("After 6 months the amount of money has grown to " + i5);
		
	}
}