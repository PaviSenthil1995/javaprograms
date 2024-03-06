package pyramid;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1;
//Scanner s=new Scanner(System.in);
//System.out.println("Enter the rows number to print pyramid:");
//n=s.nextInt();

		for (int i = 1; i <= 5; i++)
{
	for (int j = 1; j <= i; j++) {
		System.out.print(n + "\t");
		n++;
}
System.out.println("\n");
}

	}

}
