package TestingSelenium.TestingSelenium;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameters;

public class TestngParameters 
{

	@Test
	@Parameters({"i","j"})
	public void addition(int a, int b)
	{
		System.out.println("Add:"+ (a+b));
	}



	@Test
	@Parameters({"i","j"})
	public void sub(int a, int b)
	{
		System.out.println("sub:"+ (a-b));
	}

	@Test
	@Parameters({"i","j"})
	public void multi(int a, int b)
	{
		System.out.println("multi:"+ (a*b));
	}




}
