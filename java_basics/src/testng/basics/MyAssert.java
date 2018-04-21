package testng.basics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.Assertion;

public class MyAssert extends Assertion {

	public static void AssertEquals(String actual, String expected) {
		if (!actual.equals(expected))
			Reporter.log("[FAILED]: Expected " + expected + " but found " + actual, true);
		else {
			Reporter.log("[PASSED]: Expected " + expected + " and found " + actual, true);
		}
		Assert.fail();
	}

}
