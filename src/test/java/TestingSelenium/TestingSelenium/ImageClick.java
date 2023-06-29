package TestingSelenium.TestingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageClick {

	public static void main(String[] args) 
	{
		
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://visualstories.com/info/pricing");
		
		driver.findElement(By.xpath("//img[@alt='logo']")).click();
		
		if(driver.getTitle().equals("Visual Stories: Storytelling with AMP Web Stories"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}

	}

}
