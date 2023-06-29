package TestingSelenium.TestingSelenium;

import org.testng.annotations.Test;

public class TestNGEnableTestcase 
{
	
	@Test(enabled=true)
	
	public void webLoginTestcase()
	{
		System.out.println("Loan Web Login Test cases ");
	}

	@Test
	public void mobileLoginTestcase()
	{
		System.out.println("Loan Mobile Login Test cases ");
	}
	
	
	@Test
	public void APILoginTestcase()
	{
		System.out.println("Loan API Login Test cases ");
	}


	
}
