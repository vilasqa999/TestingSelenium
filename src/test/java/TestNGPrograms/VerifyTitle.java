package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;
//import io.netty.util.AsciiString;

public class VerifyTitle 
{

	
 @Test
 public void verifyPageTitle()
 {
	 
	 WebDriverManager.chromedriver().setup();
	 
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://visualstories.com/info/pricing");
	 
	 String expectedtitle= "Visual Stories Pricing Plans";
	 
	 String actual=driver.getTitle();
	 
	 Assert.assertEquals(expectedtitle, actual);
	 
	 
 }
	
}
