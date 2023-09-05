package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	
	//this will execute after all test in the folder in which the class where the test with this annotation is included in
	//in case of running testng.xml this will execute after all tests in "personal loan" test folder, but before the tests in car loan test folder 
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
	}
	
	@Test(groups= {"smoke"}) //test can be grouped for execution in testng3.xml based on the tag name specified here
	public void Demo()
	{
		System.out.println("Hello");
	}
	
	//this will execute last in the suite, even after @AfterTest annotation
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("I am the no 1 from last");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Bye");
	}

}
//added for test of git
//added for test of git2
//added for test of git3
//added for test of git4
//added for test of git5
//added for test of git6

//changed to branch "develop"
//added to branch "develop" from GitX
