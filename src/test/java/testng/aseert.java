package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(testlisteners.class)

public class aseert {
	SoftAssert sa = new SoftAssert();
	
	
	@Test
	public void s1() {
		String str1 = "Hello";
		String str2 = "Hell";
		sa.assertEquals(str1, str2);
	}
	@Test
	public void s2() {
		String str1 = "Hello";
		String str2 = "Hell";
		sa.assertNotEquals(str1, str2);
		
		
	}
	@Test
	public void s3() {
		String str1 = "Hello";
		String str2 = "Hello";
		Assert.assertTrue(str1.equals(str2));
	}
	@Test
	public void s4() {
		String str1 = "Hello";
		String str2 = "Hell";
		sa.assertNull(str1);
		Reporter.log("this test s4 shoould fail as it is not null",true);
		sa.assertAll();
	}
	@Test
	public void s5() {
		String str1 = "Hello";
		String str2 = "Hell";
		Assert.assertNotNull(str1);
	}
	@Test
	public void s6() {
		String str1 = "Hello";
		String str2 = "Hell";
		Assert.fail();
	}
	
	

}
