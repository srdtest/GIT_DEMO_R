package javaprograms;

import java.util.Scanner;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		System.out.println(rev(number));
		
		
	}
	public static int rev(int num) {
		int rev=0;
		while(num !=0) {
			int rem=num%10;
			 rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}

}
