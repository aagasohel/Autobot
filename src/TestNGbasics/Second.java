package TestNGbasics;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Second {
	@BeforeMethod
	void launchBrowser() {
		System.out.println("Browser got launched successfully");
	}
	@Test(priority = 3, enabled = true , groups = "reg")
	void logOut() {
		System.out.println("You have been logged out");
	}
	@Test(priority = 2, groups = "fun", invocationCount = 2, timeOut = 3000)
	void logIn() throws InterruptedException {
		System.out.println("You have been logged in");
		Thread.sleep(4000);
	}
	@Test(priority = 1, groups = {"reg", "smoke"}, dependsOnMethods = "logIn")
	void myAccount() {
		System.out.println("You are under  my account page");
	}
	@AfterMethod
	void quitBrowser() {
		System.out.println("Browser gets closed");
	}

}
