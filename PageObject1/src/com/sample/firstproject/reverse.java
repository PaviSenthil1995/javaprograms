package com.sample.firstproject;

import java.util.Scanner;
public class reverse {

	public static void main(String args[]) {

String word,reverse="";
Scanner s=new Scanner(System.in);
System.out.println("Enter a word:");
word = s.nextLine();
int length = word.length();

for (int i = length - 1; i >= 0; i--) {
	reverse = reverse + word.charAt(i);
}
System.out.println("Reversed word:" + reverse);
s.close();
}
}
