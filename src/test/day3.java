package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	//tests will execute in alphabetical order of their name (method name), not in the order they are written in
	
	//this will execute before any method of the class
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before executing any method in the class");
	}
	
	//this will execute after all methods of the class
	@AfterClass
	public void afterClass()
	{
		System.out.println("after executing all methods in the class");
	}
	
	@Parameters({"URL","URL2"}) //these parameters will be taken from the testng.xml file and made available to this method as param1 and param2, in this order
	@Test(groups= {"smoke"})
	public void WebLoginCarLoan(String param1, String param2)
	{
		System.out.println("weblogincar");
		System.out.println(param1);
		System.out.println(param2);
	}
	
	//this will execute before every method in this class
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I will execute before every method in day3 class");
	}
	
	//this will execute after every method in this class
	@AfterMethod
	public void afterevery()
	{
		System.out.println("I will execute after every method in day3 class");
	}
	
	@Test(timeOut=4000) //wait for 4 seconds before failing
	public void MobileLoginCarLoan()
	{
		System.out.println("mobilelogincar");
	}
	
	//this will execute before all tests in the suite, even before the one set with @BeforeTest
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(enabled=false) //TestNG will skip this test from execution 
	public void MobileSignInCarLoan()
	{
		System.out.println("mobilesignin");
	}
	
	@Test(dataProvider="getData") //to run the test with the data provided by the method with the name specified. The specified method must be annotated with @DataProvider
	public void MobileSignOutCarLoan(String username, String password) //variables to use the data provided. Test will be executed 3 times because there are 3 sets of data provided
	{
		System.out.println("mobilesignout");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"WebLoginCarLoan","MobileSignOutCarLoan"}) //it will execute WebLoginCarLoan and MobileSignOutCarLoan method/test before executing this method/test
	public void APILoginCarLoan()
	{
		System.out.println("apilogincar");
	}
	
	@Test
	public void ToBeExcluded1()
	{
		System.out.println("this will be excluded1");
	}
	
	@Test
	public void ToBeExcluded2()
	{
		System.out.println("this will be excluded2");
	}
	
	//for running tests with data sets defined in this method, even multiple data sets for running the tests in a loop with all data sets provided
	@DataProvider
	public Object[][] getData()
	{
		//1st combination = username and password - good credit history user
		//2nd combination = username and password - no credit history user
		//3rd combination = username and password - bad credit history user
		
		Object[][] data = new Object[3][2]; //the number of data sets is given by the number of elements in the array defined or the number of rows in the matrix.
		////In this case it's 3 rows so the test using this data provider will be executed 3 times
		//1st set
		data[0][0] = "FirstUserName";
		data[0][1] = "FirstPassword";
		
		//2nd set
		data[1][0] = "SecondUserName";
		data[1][1] = "SecondPassword";
		
		//3rdset
		data[2][0] = "ThirdUserName";
		data[2][1] = "ThirdPassword";
		
		return data;
	}

}

//changed to branch "develop"
