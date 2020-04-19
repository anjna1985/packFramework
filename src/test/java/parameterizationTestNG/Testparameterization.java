package parameterizationTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testparameterization {

	@Test(dataProvider = "getData")
	public void doLogin(String username, String password) {

		System.out.println(username + "----" + password);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = "anjna85@gmail.com";
		data[0][1] = "anjna85";
		
		data[1][0] = "banjna1985@gmail.com";
		data[1][1] = "banjna1985";
		
		data[2][0] = "bharat.anjna85@gmail.com";
		data[2][1] = "bharat.anjna";
	
		return data;

	}

}
