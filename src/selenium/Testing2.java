package selenium;

import org.testng.Assert;
//import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing2 {

	SoftAssert softassert = new SoftAssert();
	
	@Test(priority = 1)
	public void createUser() {
		String val = "abc";
		String val2 = "abc";
		
		System.out.println("before assertion");
		Assert.assertEquals(val, val2);
		System.out.println("after assertion");
		
		softassert.assertTrue(2>3);
		
		System.out.println("after second assertion");
		softassert.assertAll();
		
	}
	
	@Test(priority = 2,dependsOnMethods="createUser", groups= {"smoke","sanity"})
	public void EditUser() {
		String expected = "abc";
		String actual = "abc1";
			
		System.out.println("before assert1");
		softassert.assertEquals(actual, expected);
		System.out.println("after assert1");
		System.out.println("before assert2");
		softassert.assertEquals(2>4, "This is error");
	
		}
	
	@Test(priority = 3)
	public void deleteUser() {
		System.out.println("before");
		Assert.assertTrue(3>1);
	}
}
