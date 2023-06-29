package TestNGPrograms;

import org.testng.annotations.Test;

public class TestNGAttribute 
{

	@Test (dependsOnMethods= {"homegapedetails"})
	//@Test(description="This is test case 1 of Getdata added ...")	
	public void getdata()
	{
		System.out.println("Getdata added");
	}
	
	
	@Test
	//@Test(description="This is test case 1 of count detils...")	
	public void countdetails()
	{
		
		
		System.out.println("Count details");
	}
	
	
	@Test
	//@Test
	public void homegapedetails()
	{
		
		System.out.println("Homepages details.....");
		
	}
	
	
	@Test(enabled=false)
	//@Test
	public void accountdetails()
	{
		
		System.out.println("account details.......");
		
	}
	
	
	
	
	
}
