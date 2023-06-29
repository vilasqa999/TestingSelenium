package TestingSelenium.TestingSelenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnoations 
{

	
	
	
    @BeforeSuite
	public void beforeSuite()
	{
		
		System.out.println("This is before suite:");
	}
	
    @AfterSuite
	public void afterSuite()
	{
		
		System.out.println("This is after suite:");
	}
	

	
    @BeforeTest
	public void beforeTest()
	{
		
		System.out.println("This is before test:");
	}
	
    
    @AfterTest
	public void afterTest()
	{
		
		System.out.println("This is after test:");
	}
	


	
    @BeforeClass
	public void beforeClass()
	{
		
		System.out.println("This is before class:");
	}
	
	
    @AfterClass
	public void afterClass()
	{
		
		System.out.println("This is after class:");
	}
	


	@BeforeMethod
	public void beforeMethod()
	{
		
		System.out.println("This is before method:");
	}
	
	
    @AfterMethod	
	public void afterMethod()
	{
		
		System.out.println("This is after method:");
	}
	

	
	
	
	@Test	
	public void test1()
	{
		System.out.println("This is my test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("This is my test2");
	}
	
}
