package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateCommands 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		 WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver =new ChromeDriver();
		
		 driver.manage().window().maximize();
		
		 driver.get("https://www.flipkart.com/");
		
		 Thread.sleep(3000);
		  
		 
		 driver.navigate().to("https://www.amazon.in/");
		 
		// driver.get("https://www.amazon.in/");
		
		 Thread.sleep(3000);
		 
		 driver.navigate().back();
		
	     Thread.sleep(3000);
	     
	     driver.navigate().forward();
	     
	     driver.navigate().refresh();
	     
	     Thread.sleep(3000);
		
		 driver.close();

	}

}
