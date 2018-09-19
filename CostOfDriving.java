import java.util.Scanner;

public class CostOfDriving {
	public static void main(String[] args) {
		
		/* Andrew Erickson 09-12-18 A basic program for calculating the cost of driving */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance");
		
		double distance = input.nextDouble();

		System.out.println("Enter the mpg");
		
		double mpg = input.nextDouble();
		
		System.out.println("Enter the price per gallon");
		
		double price = input.nextDouble();
		
		System.out.println(price * (distance / mpg));
		
	}
	
}