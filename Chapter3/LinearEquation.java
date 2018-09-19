/* By Andrew Erickson 9-13-18 */

import java.util.Scanner;
public class LinearEquation {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(Math.pow(2, 3));
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double detA = a * d - b * c;
		
		if (detA == 0) {
			System.out.println("The equation does not have a solution :(");
		}
		
		else {
			double x = (e * d - b * f) / detA;
			double y = (a * f - e * c) / detA;
			System.out.println("x is: " + x + " and y is : " + y);
		}
		
	}
}