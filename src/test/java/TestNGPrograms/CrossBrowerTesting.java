package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class CrossBrowerTesting 
{
	WebDriver driver;
	
	@BeforeMethod
	//@Parameters("browser")
    public void launchBrowser(String browser)
 {
	
	switch(browser.toLowerCase())
	{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;	
			
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;	
			
			default:
				driver= null;
				break;
	}
	
	driver.manage().window().maximize();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
 }

     @Test
    public void verifytitle()
    {
    	String actual=driver.getTitle();
        String expect= "Automation Testing Practice";
        
        Assert.assertEquals(expect, actual);
        
    }

	
     @AfterMethod
    public void closeBrowser()
    {
    	
    	driver.quit();
    }
    
}
