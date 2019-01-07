import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void main(String[] args) {
		
		//Andrew Erickson 09-19-18
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of x");
		
		double x1 = input.nextDouble();
		
		System.out.println("Enter the value of y");
		
		double y1 = input.nextDouble();
		
		if (Math.abs(x1) <= (10/2)){
			if (Math.abs(y1) <= (5.0/2)){
				System.out.println("The point is within the rectangle");
			}
			else {
				System.out.println("The point is not in the rectangle");
			}
		} else {
			System.out.println("The point is not in the rectangle");
		}

		}
		
	}
