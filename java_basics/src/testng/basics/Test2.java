package testng.basics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pratyush.MessageUtil;

public class Test2 {
	   String message = "Manisha";	
	   MessageUtil messageUtil = new MessageUtil(message);
		 
	   @BeforeMethod
		public void setUp(){
			Reporter.log("SETUP IN TEST2", true);
		}
	   
	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "Manisha";
	      Reporter.log("Test2_testSalutationMessage",true);
	      Assert.assertEquals(message,messageUtil.salutationMessage());
	   }	
	}
