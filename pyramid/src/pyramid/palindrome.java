package pyramid;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word, reverse = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		word = scan.nextLine();
		int length = word.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		if(reverse.equals(word))
		{
			System.out.println("Given word " + word + " is a palindrome.");
		} else {
			System.out.println("Given word "+word+" is not a palinrome.");
		}
		scan.close();
	}

}
