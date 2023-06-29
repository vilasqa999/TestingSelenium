package TestingSelenium.TestingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HardSoftAssertions 
{
	
	@Test	
	public void verifyAssertions() throws InterruptedException
	{
		
	
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
	SoftAssert softassert=new SoftAssert();
	
	System.out.println("title verified............");
	softassert.assertEquals(driver.getTitle(), "Automation Testing Practice11" );
	
    WebElement element=	driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
	
    
	System.out.println("logo displayed............");
	softassert.assertTrue(element.isDisplayed());
    
    
    WebElement element2  =  driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
    
	System.out.println("button  displayed............");
	softassert.assertTrue(element2.isDisplayed());
    
    
    System.out.println("======================success===================");
    

    
    Thread.sleep(2000);
    driver.close();
    
    softassert.assertAll();
   
	}

}
