package javaprograms;

import java.util.Scanner;

public class readint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner read = new Scanner(System.in);
		System.out.println("enter a number");
		int newint = read.nextInt();
		System.out.println("print the number"+newint);
		int fact=1;
		for (int i=1;i<=newint;i++) {
			fact = fact *i;
		}
		System.out.println("factoria; of the given value is"+fact);
		
	}

}
