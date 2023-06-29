package TestingSelenium.TestingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestngParallel1 
{
 @Test
	public void verifytitle() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
		Thread.sleep(3000);
		driver.close();
		
	}
	
	
@Test	
	public void verifylogo() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
        WebElement element=		driver.findElement(By.xpath("//div[@class='login_logo']"));
		
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
		Assert.assertTrue(element.isDisplayed());
		

		Thread.sleep(3000);
		driver.close();
		
		
	}
	
}
