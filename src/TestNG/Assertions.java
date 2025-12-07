package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

		@Test(priority=2)
	public void hardassert() {
		String title="Goolge";
	String s="Goolge";
	Assert.assertEquals(title, s,"failed TC");
//	Assert.assertTrue(title.equals(s),"checking true");
		}
	@Test(priority=5)
	public void softassert() {
		String title="Gmail";
	String s="gmail";
	SoftAssert softassert=new SoftAssert();
	softassert.assertEquals(title, s,"not matched but pass");
	}

}
