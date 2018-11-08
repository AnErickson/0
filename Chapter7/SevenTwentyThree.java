//Andrew Erickson November 4, 2018

//Be it noted that I used seperate classes to test wether or not the locker was open
import java.util.Scanner;

public class SevenTwentyThree {
	public static void main(String[] args) {
		String[] lockers = new String[100];

		closeAllLockers(lockers);
		studentLockerChanges(lockers);
		print(lockers);
	}

	public static boolean isOpen(String l) {
		return l == "open";
	}

	public static void closeAllLockers(String[] lockers) {
		for (int i = 0; i < lockers.length; i++) {
			lockers[i] = "closed";
		}
	}

	public static void studentLockerChanges(String[] lockers) {
		int start = 0; 

		for (int s = 1; s <= lockers.length; s++) {
			for (int l = 0; l < lockers.length; l += s) {
				if (isOpen(lockers[l]))
					lockers[l] = "closed";
				else
					lockers[l] = "open";
			}
			start++;
		}
	}

	public static void print(String[] lockers) {
		for (int i = 0; i < lockers.length; i++) {
			if (isOpen(lockers[i])) {
				System.out.print("Locker " + (i) + ", ");
			}
		}
		System.out.print("Locker 100, are open. ");
		System.out.println("All else are closed :3.");
	}
}