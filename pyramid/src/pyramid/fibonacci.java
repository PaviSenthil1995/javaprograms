package pyramid;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + "\t");
		for (int i = 1; i <= 20; i++) {
			c = a + b;
			b = a;
			a = c;
			System.out.print(c + "\t");




		}
	}

}
