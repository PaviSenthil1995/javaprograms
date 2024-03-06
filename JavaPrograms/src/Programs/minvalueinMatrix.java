package Programs;

public class minvalueinMatrix {

	static void minimumvalue(int A[][], int m, int n) {
		int small = A[0][0];
		int x = 0, y = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (A[i][j] < small) {
					small = A[i][j];
					x = i + 1;
					y = j + 1;

				}
			}
		}
		System.out
				.println("Minimum value of a matix is " + small + " is present in the " + x + " row " + y + " column.");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		int A[][] = { { 11, 24, 35 }, { 5, 30, 7 }, { 4, 6, 8 } };

		System.out.println("Given marix A is:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j] + " ");

				}
				System.out.println("\n");
			}

		minimumvalue(A, m, n);
	}

}
