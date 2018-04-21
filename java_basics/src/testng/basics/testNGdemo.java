package pratyush;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testNGdemo {

	@Test
	public void testAdd() {
		System.out.println("testadd exicuting");
		String str = "TestNG is working fine";
		int exp=15;
		assertEquals("TestNG is working fine", str);
		assertEquals("TestNG is working fine", str);
		assertEquals("TestNG is working fine", str);
		assertEquals(14, exp);

	}


	@Test
	public void testAdd1() {
		System.out.println("testadd1 exicuting");
		String str = "TestNG is working fine";
		int exp=15;
		assertEquals("TestNG is working fine", str);
		assertEquals("TestNG is working fine", str);
		assertEquals("TestNG is working fine", str);
		assertEquals(15, exp);

	}

	@BeforeSuite
	public void start(){
		System.out.println("Before Test cases");
	}

	@AfterSuite
	public void End(){
		System.out.println("Testing finished");
	}

	@BeforeClass
	public void beforeclass(){

		System.out.println("run only once before the first test");
	}

	@AfterClass
	public void afterclass(){
		System.out.println("run only once after all the test");
	}

	@BeforeTest
	public void beforetest(){
		System.out.println("beforetest annotation*****");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nin beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("in afterMethod\n");
	}

}
