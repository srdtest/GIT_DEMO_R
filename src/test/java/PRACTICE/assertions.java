package PRACTICE;

	import org.testng.asserts.SoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;


public class assertions {
	
	@Test(priority=3)
	public void signin11() {
	System.out.println("sigin 1 running");
	}
	@Test(dependsOnMethods= {"signin3"}, alwaysRun= true)
	public void signin2() {
	System.out.println("sigin 2 running");
	}
	@Test(priority=1,enabled=false)
	public void signin3() {
	System.out.println("sigin 3 running");
	}
	@Test
	public void loignin1() {
	System.out.println("login1 running");
	}

}
