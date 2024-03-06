package pyramid;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 3;
		int value = 1;

		for (int i = 1; i <= number; i++) {
			value = value * i;
		}
		System.out.println("The factorial of " + number + " is " + value);
	}

}
