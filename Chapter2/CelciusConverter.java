import java.util.Scanner;

public class CelciusConverter {
	public static void main(String[] args) {
		
		//Andrew Erickson 09-10-18
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a degree in Celcius");
		
		double celcius = input.nextDouble();
		
		double fahrenheit = (9.0 / 5) * celcius +32;
		
		System.out.println(celcius + "Celcius is " + fahrenheit + " Fahrenheit");
		
	}
}