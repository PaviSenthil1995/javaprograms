package pyramid;

public class smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 43, 23, 3, 12, 11 };
		int num = a[0];
		for (int i = 0; i < a.length; i++) {
			if (num > a[i]) {
				num = a[i];

			}
		}
		System.out.println("Smallest number:" + num);
	}

}
