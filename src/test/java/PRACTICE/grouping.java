package PRACTICE;

import org.testng.annotations.Test;

public class grouping {
	
	@Test(	groups= {"sanity"})
	public void login() {
		System.out.println("login successfull");
	}
	@Test(	groups= {"sanity", "regression"})
	public void entercresd() {
		System.out.println("enter credentials successfull");
	}
	@Test(	groups= {"sanity", "regression"})
	public void clciksubmit() {
		System.out.println("submit success successfull");
	}
	@Test(	groups= {"sanity", "regression"})
	public void slectitem() {
		System.out.println("item selected");
	}
	@Test(	groups= {"regression"})
	public void addtocart() {
		System.out.println("item added to cart");
	}
	@Test(	groups= {"regression"})
	public void checkout() {
		System.out.println("add checkoutdetails");
	}
	@Test(	groups= {"regression"})
	public void payment() {
		System.out.println("payment success");
	}
	@Test(	groups= {"regression"})
	public void verification() {
		System.out.println("verification success");
	}

}
