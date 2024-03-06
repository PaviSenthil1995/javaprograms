package Programs;

public class numberofOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 5, 1, 3, 6, 7, 5, 3, 0, 9, 3 };
		int n = a.length;
		int j = 3;
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == j) {
				count++;
			}
		}
		System.out.println("The number " + j + " is present in array in " + count + " times.");
	}

}
