package selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ParameterizedTest {

	@Test(dataProvider = "getData")
	public void createUser(String username,String password) {
		
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "u1";
		data[0][1] = "p1";
		
		data[1][0] = "u2";
		data[1][1] = "p2";
		
		data[2][0] = "u3";
		data[2][1] = "p3";
		
		
		return data;
	}
}
