package pyramid;

public class largest {public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a[] = { 193, 343, 23, 432, 555 };
	int num = a[0];
	for (int i = 0; i < a.length; i++) {
		if (num < a[i]) {
			num = a[i];

		}
	}
	System.out.println("Largest number:" + num);
}
}