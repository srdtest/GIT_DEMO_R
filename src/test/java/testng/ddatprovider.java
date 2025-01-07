package testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ddatprovider {
	
	@Test(dataProvider = "data")
	public void dataprovider(String username, String password) {
		
		Reporter.log(username,true);
		Reporter.log(password,true);
	}
	@DataProvider
	public Object[][] data(){
		Object[][] ref = new String[1][2];
		ref[0][0]= "admin";
		ref[0][1]="password";
		return ref;
				}
}
