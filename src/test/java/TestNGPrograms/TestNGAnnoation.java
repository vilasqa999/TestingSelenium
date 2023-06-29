package TestNGPrograms;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNGAnnoation
{
    

	
	
	
	
	


	
	@BeforeSuite
	public void beforeSuite()
	{
	
		System.out.println("This is Before Suite.........\n");
		
	}
	
	@AfterSuite
	public void afterSuite()
	{
		
		System.out.println("This is After Suite.........\n");
	}
	
	
	
	@BeforeTest
	public void beforetest()
	{
	
		System.out.println("This is Before Test.........\n");
		
	}
	
	@AfterTest
	public void afterTest()
	{
		
		System.out.println("This is After Test.........\n");
	}
	
	@BeforeClass
	public void beforeclass()
	{
	
		System.out.println("This is Before classs.........\n");
		
	}
	
	@AfterClass
	public void afterclass()
	{
		
		System.out.println("This is After class.........\n");
	}
	
	
	
	
	
	
	
	@BeforeMethod
	public void beforeMethod()
	{
	
		System.out.println("This is Before Method.........");
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		
		System.out.println("This is After Method.........");
	}
	
	
	@Test		
	public void test1()
	{
		System.out.println("This is only Test.........");
	}
	
	
	@Test
	public void testcase1()
	{
		System.out.println("This is only Test case 1.........\n");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("This is only Test case 2.........\n");
	}
	
}
