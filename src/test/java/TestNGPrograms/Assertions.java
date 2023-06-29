package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class Assertions
{

	@Test	
	public void testElement() throws InterruptedException
	{
		SoftAssert soft=new SoftAssert();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// 1. verify title
		System.out.println("page title");
		String expectedTitle= "Automation Testing Practice";
		
		String actualTitle=driver.getTitle();
		
		soft.assertEquals(actualTitle, actualTitle);
		
		//System.out.println((Assert.assertEquals(actualTitle, actualTitle));
		
		// 2. check wiki icon shown on page or not
		
		System.out.println("wiki icon");
		WebElement icon=driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
		
		soft.assertTrue(icon.isDisplayed());
		
		
		
		// 3. check wiki icon shown on page or not
		
				System.out.println("search icon");
				WebElement searchicon=driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
				
				soft.assertTrue(searchicon.isDisplayed());
		
				
				Thread.sleep(3000);
				driver.close();
				
				soft.assertAll();
			
						
	}
	
	
}
