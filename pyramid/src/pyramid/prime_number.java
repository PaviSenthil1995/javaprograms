package pyramid;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check prime or not:");
		number = scan.nextInt();
		int m = number / 2;

		if (number <= 1) {
			System.out.println("Prime number should be more than one.");
		} else {
			for (int i = 2; i <= m; i++) {
				if ((number % m == 0)) {
					System.out.println("Given number is prime number.");
				} else {
					System.out.println("Given number is not a prime number.");
				}
			}

		}
		scan.close();
	}

}
