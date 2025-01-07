package testng;


import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annoptations {
	

	@BeforeMethod
	public void beforemethod() {
		Reporter.log("beforemethod method",true);
	}
	@AfterMethod
	public void aftermethod(ITestResult result) {
		String name = result.getName();
		int status  =result.getStatus();
		if(status==1) {
			Reporter.log(name+"passed",true);
		}
		else {
			Reporter.log(name+"failed",true);
		}
		Reporter.log("aftermethod method",true);
	}

	
	  @BeforeClass public void beforeclass() { Reporter.log("beforeclass method",true);
	  }
	  
	  @AfterClass 
	  public void afterclass() { Reporter.log("afterclass method",true); }
	  
	  @BeforeSuite 
	  public void beforesuite() { Reporter.log("beforesuite method",true);
	  }
	  
	  @AfterSuite 
	  public void aftersuite() 
	  { 
		  Reporter.log("aftersuite method",true); 
		  }
	 
	@Test
	public void firsttest() {
		Reporter.log("first testcase running",true);
	}
	@Test
	public void secondtest() {
		Reporter.log("second testcase running",true);
	}

}
