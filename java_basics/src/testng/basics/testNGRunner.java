package testng.basics;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class testNGRunner {
	public void runMySuit() {
		TestNG testNG = new TestNG();
		testNG.setVerbose(1);
		
		List<Class> lis= new ArrayList<Class>();
		//lis.add(testng.basics.CustomListener.class);
		lis.add(testng.basics.CustomListenerImplementation.class);
		testNG.setListenerClasses(lis);
		

		XmlSuite suite = new XmlSuite();
		suite.setName("MyTestSuit");

		XmlTest test1 = new XmlTest(suite);
		test1.setName("My Test");

		XmlClass testclass1 = new XmlClass(testng.basics.Test1.class);

		List<XmlClass> myClasses = new ArrayList<XmlClass>();
		myClasses.add(testclass1);
		
		test1.setXmlClasses(myClasses);

		List<XmlTest> tests = new ArrayList<XmlTest>();
		
		tests.add(test1);

		
		suite.setTests(tests);

		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);

		testNG.setXmlSuites(suites);
		testNG.run();
	}

	public static void main(String srgs[]) {
		testNGRunner testng = new testNGRunner();
		testng.runMySuit();
	}
}
