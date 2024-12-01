package dp;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login {
	
	@BeforeMethod
	public void launch()
	{
		
		
	}
	
	
	@Test(dataProvider="credentials")
	public void login1(String username,String password)
	{
		System.out.println("+username  +password");
		
	}
	
	@DataProvider
	public String[][] credentials()
	{
		
		String[][] Obj= {{ "firstunmae","firstpassword"},{"seconduname","secondpassword"}};
		
		return Obj;
		
		
	}
	
	
	
	

}
