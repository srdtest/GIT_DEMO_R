package inheritance;

import org.testng.annotations.Test;

public class ps1 {
  int a;
private int i;

	
	
	public ps1(int i ) {
	// TODO Auto-generated constructor stub
		this.i=i;
}
	
	@Test
	public int increment(int a) {
		System.out.println("this is increment");
		a= a+1;
		return a;
		
	}
	@Test
	public int decrement() {
		System.out.println("this is decrement");
		a= a-1;
		return a;
	}
	
}
