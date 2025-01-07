package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class smoketest {
	
	@Test(groups = "smoke")
	public void s1() {
		Reporter.log("first smoke test ",true);
	}
	@Test(groups="regression")
	public void s2() {
		Reporter.log("first smoke test ",true);
	}
	@Test(groups="functional")
	public void s3() {
		Reporter.log("first smoke test ",true);
	}
}
