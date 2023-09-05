package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void ploan()
	{
		System.out.println("good");
		Assert.assertTrue(false); //so the test fails and Listeners on test failure code is executed
	}
	
	//this will execute before all tests in the folder in which the class where the test with this annotation is included in
	//in case of running testng.xml this will execute before all tests in "personal loan" test folder 
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}

}
