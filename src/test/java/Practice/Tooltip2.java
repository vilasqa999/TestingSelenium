package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip2 {

	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://visualstories.com/info/pricing");
		 
		 
		 


	}

}
