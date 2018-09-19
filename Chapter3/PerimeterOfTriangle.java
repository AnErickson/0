import java.util.Scanner;

public class PerimeterOfTriangle {
	public static void main(String[] args) {
		
		//Andrew Erickson 09-19-18
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of side 1");
		
		double s1 = input.nextDouble();
		
		System.out.println("Enter the value of side 2");
		
		double s2 = input.nextDouble();
		
		System.out.println("Enter the value of side 3");
		
		double s3 = input.nextDouble();
		
		if (s1 + s2 > s3)
		
		{
		
		if (s2 + s3 > s1) {
			if (s1 + s3 > s2) {
				double x = s1 + s2 + s3;
				
				System.out.println("The perimeter of the triangle is  " + x);
			} 
			else {
				System.out.println("Not valid");
			}
		} else {
			System.out.println("Not valid");
		}
		
		} 
			else System.out.println("Not valid");
		
		
	}
}