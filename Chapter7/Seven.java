//Andrew Erickson Oct 31 2018 :3

import java.util.Scanner;

class Seven {
	public static void main(String[] args) {
		Scanner inout = new Scanner(System.in);
		int[] numbers = new int[10];
		int numberOfDistinctValues = 0;
		
		System.out.print("Enter 10 numbers seperated by a space ");
		
		for (int i = 0; i < numbers.length; i++){
			int value = input.nextInt();
			
			boolean isInTheArray = false;
			for (int j = 0; j < numberOfDistinctValues; j++){
				if (value == number[j]){
					isInTheArray = true;
				}
			}
			if(!isInTheArray){
				numbers [numberOfDistinctValues] = value;
				
				numberOfDistinctValues++;
			}
		}
		System.out.println("The number of distinct numbers is: " + numberOfDistinctValues);
		
		for (int x = 0; x < numbers; x++)
		System.out.println(numbers[x]);
	}
}

//Thank you :3