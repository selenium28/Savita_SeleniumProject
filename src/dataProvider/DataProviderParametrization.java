package dataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderParametrization {
  @Test(dataProvider = "testData")
  public void testCase(Integer n, String s) {
	  System.out.println(n);
	  System.out.println(s);
	  
  }

  @DataProvider
  public Object[][] testData() {
	  Object[][] data = new Object[2][2];
	  
	  data[0][0] = 100;
	  data[0][1] = "username";
	  
	  data[1][0] = 300;
	  data[1][1] = "password";
	  
	return data;
	 
  }
}
