package javaprograms;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Scanner;

public class armstron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		System.out.println("enter low");
		int  low = s.nextInt();
		System.out.println("enter hig");
		int  high = s.nextInt();
		
		for (int i=low+1; i<high; i++) {
			if(armstron(i)) {
				System.out.println("armstron number "+"");
		}
		}
		
	}
	
	public static boolean armstron(int num) {
		int digits=0;
		int result=0;
		int org = num;
		while(org!=0) {
			int rem=org%10;
			result+=Math.pow(rem, digits);
			org=org/10;
		
		}
		if(result==num) {
			return true;
		}
		return false;
	}

}
