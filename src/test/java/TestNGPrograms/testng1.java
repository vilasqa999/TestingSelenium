package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class testng1 
{

	//@Test  
	public void showpagedetails() 
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		String actual=driver.getTitle();
		String expeted= "Register: Mercury Tours";
		
		Assert.assertEquals(expeted,actual);
		System.out.println("this is testng test case....");
		
		driver.quit();
	}
	
	@Test
	
	public void showdetails()
	{
		System.out.println("test case for show details...");
	}
	
	@BeforeMethod
	public void testcase1()
	{
		System.out.println("test case for show details of testcase1 ...");
	}
	
	@Test (priority=1)
	public void testcase2()
	{
		System.out.println("test case for show details of testcase2...");
	}
	
	
	@Test (invocationCount=5)
	public void Assstcase3()
	{
		System.out.println("test case for show details of  testcase3...");
	}
	
	@BeforeClass
	public void beforeclassmethod()
	{
		System.out.println("beforeclassmethod is excuted ...");
	}
	
	@Test
	public void suceess()
	{
		
		Assert.assertTrue(true);
	}
	
	@Test
	public void fail()
	{
		
		Assert.assertTrue(false);
	}

}
