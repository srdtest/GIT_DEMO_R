package testng;





import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class itestresult {
	

	@Test
	public void s2() {
		
		Reporter.log("s2 is reunning");
		String str1 = "Hello";
		String str2= "Hell";
		Assert.assertEquals(str1, str2);
	}
	@Test
	public void s3() {
		
		Reporter.log("s2 is reunning");
		String str1 = "Hello";
		String str2= "Hello";
		Assert.assertEquals(str1, str2);
	}
	@AfterMethod
	public void test123(ITestResult result) {
		String testname=result.getName();
		int status = result.getStatus();
		if(status==1) {
			Reporter.log("test passed at"+testname, true);
		}
		else {
			Reporter.log("test failed at"+testname, true);
		}
			
	}

}
