package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

@Test
public class testng {
	@Test(groups = "auto")
	public void tc1() {
		Reporter.log("tc1 is running");
	}
	@Test(priority =-3,groups = "functional")
	public void tc2() {
		Reporter.log("tc2 is running");
	}
	@Test(priority =-2,invocationTimeOut=5000, expectedExceptions = ThreadTimeoutException.class)
	public void tc3() throws InterruptedException {
		Thread.sleep(6000);
		Reporter.log("tc3 is running");
	}
	@Test(priority =-1,dependsOnMethods = "tc3",groups="smoke")
	public void tc5() {
		Reporter.log("tc5 is running");
	}
	@Test(priority =-5, invocationCount=3,groups ="smoke")
	public void tc4() {
		Reporter.log("tc4 is running");
	}

}
