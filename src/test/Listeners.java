package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface with methods for Listeners in TestNG
public class Listeners implements ITestListener {
	
	//this will execute after each test in the suite that is passed
	@Override //to override the default implementation of this method in the Interface. Default implementation doesn't do anything
	public void onTestSuccess(ITestResult result) {
	    System.out.println("I've successfully executed Listeners Pass code");
	  }
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I've failed executing Listeners Pass code " + result.getName()); 
		//result catches details of the executed tests. result.getName() gives you the test case name(method) that failed in this case
		  }
}
