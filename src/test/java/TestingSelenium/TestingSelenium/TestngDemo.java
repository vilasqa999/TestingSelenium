package TestingSelenium.TestingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestngDemo 
{

	
	@Test
	
	public void verifyPageTitle()
	{
		

        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://visualstories.com/info/pricing");
		

		driver.get("https://www.calculator.net/");
		
		String expected="Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science";
		
		String actual=driver.getTitle();
		
		System.out.println("Actual title:"+ actual);
		
		Assert.assertEquals(actual,expected);
		
		driver.close();
				
		
	}
	
	
}
