package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sampletest {
	@BeforeMethod
	public void browser() {
		System.out.println("Launch browser");
	}

	@Test(priority=-2)
		public void login() {
			System.out.println("Testng testcase");
		}

	@Test(priority=1)
	public void logout() {
		System.out.println("Testng testcase logout");
	}

}
