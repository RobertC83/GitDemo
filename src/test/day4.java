package test;

import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void WebLoginHomeLoan()
	{
		//Selenium code for example
		System.out.println("webloginhome");
	}
	
	@Test
	public void MobileLoginHomeLoan()
	{
		//Appium code for example
		System.out.println("mobileloginhome");
	}
	
	@Test(groups= {"smoke"})
	public void APILoginHomeLoan()
	{
		//REST API automation code for example
		System.out.println("apiloginhome");
	}

}
