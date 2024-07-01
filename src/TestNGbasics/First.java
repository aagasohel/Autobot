package TestNGbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First {
	@BeforeSuite
	void connectDB() {
		System.out.println("DB gets connected");
	}
	@BeforeTest
	void envSetup() {
		System.out.println("Env setup is done");
	}
	@BeforeClass
	void setUp() {
		System.out.println("Setup is initiated");
	}
	@BeforeMethod
	void launchBrowser() {
		System.out.println("Browser got launched successfully");
	}
	@Test(priority = 3, enabled = true , groups = "reg")
	void testA() {
		System.out.println("This is test-A");
	}
	@Test(priority = 2, groups = "fun")
	void testB() {
		System.out.println("This is test-B");
	}
	@Test(priority = 1, groups = {"reg", "smoke"})
	void testC() {
		System.out.println("This is test-C");
	}
	@AfterMethod
	void quitBrowser() {
		System.out.println("Browser gets closed");
	}
	@AfterClass
	void closesetup() {
		System.out.println("Setup is closed");
	}
	@AfterTest
	void closeEnvSetup() {
		System.out.println("Env is closed");
	}
	@AfterSuite
	void closeDB() {
		System.out.println("DB disconnected");
	}
	

}
