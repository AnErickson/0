import java.util.Scanner;

public class FourOne {
	public static void main(String[] args) {
		
		//Andrew Erickson 09-20-18
		
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter the length from the center to the vertex");
		
		double r = input.nextDouble();
		
		double side = 2 * r * Math.sin(Math.PI / 5);
		System.out.println("The side length is " + side);
		double area = 5 * side * side / Math.tan(Math.PI / 5) * 4;
		
		System.out.println("The area of the pentagon is " + area);
	}
		
}