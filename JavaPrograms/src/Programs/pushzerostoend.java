package Programs;

public class pushzerostoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 0, 3, 8, 0, 2, 0, 0, 4 };
		int length = a.length;

		int[] b = new int[length];
		int j = 0, count = 0;

		for (int i = 0; i < length; i++) {
			if (a[i] != 0) {
				b[j] = a[i];
				j++;
			}
			else {
				count++;
			}
		}
		while (count > 0) {
			b[j] = 0;
			count--;
			j++;
		}
		for (int i = 0; i < length; i++) {
			a[i] = b[i];
			System.out.print(a[i] + " ");
		}

	}

}
