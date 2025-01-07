package POM.orange;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.baseclass;
import POM.orangepages.OrangeHRMLoginPage;
import POM.orangepages.forgotpwdpage;
import POM.orangepages.resetpasswordpage;


public class orangetest extends basetest{
	
	WebDriver driver;
	
	@Test
	public void logintest() {
	
		OrangeHRMLoginPage log = new OrangeHRMLoginPage(basetest.driver);
		log.login();
		}
	@Test
	public void forgottest() throws InterruptedException {
		forgotpwdpage forgot= new  forgotpwdpage(basetest.driver);
		resetpasswordpage reset=forgot.clickonforgotpqwdlink();
		Thread.sleep(3000);
		
		reset.resetpwd();
		String text=reset.getthetext();
		String realtextmsg = "Reset Password link sent successfully";
		Assert.assertEquals(text,realtextmsg);
	}

}
