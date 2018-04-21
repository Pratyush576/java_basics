package testng.basics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pratyush.MessageUtil;

public class Test1 extends MyAssert {
	String message = "Manish";
	MessageUtil messageUtil = new MessageUtil(message);

	@BeforeMethod
	public void setUp(){
		Reporter.log("SETUP IN TEST1", true);
	}

	@Test(invocationCount = 20, threadPoolSize = 3)
	public void testPrintMessage1() {
		System.out.println("Inside testPrintMessage()");
		Reporter.log("Test1_testPrintMessage1",true);
		Assert.assertEquals("Manish", message,"");
	}
	
	//@Test(invocationCount = 3, threadPoolSize = 3)
	public void testPrintMessage2() {
		System.out.println("Inside testPrintMessage()");
		Reporter.log("Test1_testPrintMessage2",true);
		Assert.assertEquals("Manish1", message,"");
		

	}

}
