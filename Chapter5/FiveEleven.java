class FiveEleven {
	public static void main(String[] args) {
		
	// Andrew Erickson Oct 2 2018
		
		int n = 100;
		int counter = 0;	
		
		while (n <= 200){
		
			if (n % 5 == 0 && n % 6 > 0){
		
			System.out.print(n + " ");
			counter = counter + 1;
			}
		
			if (n % 5 > 0 && n % 6 == 0){
		
			System.out.print(n + " ");
			counter = counter + 1;	
			}
		
			n =  n + 1;
			if (counter % 10 == 0){
			System.out.println();
			}
				}
		if (counter == 32) {
			System.out.print(" is devisible by 5 or 6 but NOT both.");
		}
	}
}	

