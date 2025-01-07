package javaprograms;

import java.util.Scanner;

public class evenorodd {

	
	
	public static boolean checkprime(int num) {
		
		boolean flag= true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("enter low");
		int low = s.nextInt();
		System.out.println("enter high");
		int high= s.nextInt();
		while (low<high) {
			if(checkprime(low)) 
				System.out.println(low+"");
			++low;
}

	}
	}
