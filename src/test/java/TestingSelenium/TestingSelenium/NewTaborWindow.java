package TestingSelenium.TestingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTaborWindow {

	public static void main(String[] args)
	{
	

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://visualstories.com/info/pricing");
		
		System.out.println("First tab:"+driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		

		driver.get("https://visualstories.com/info/aitools");
		
		System.out.println("Second tab:"+ driver.getTitle());
		
		
		driver.close();
		

		System.out.println("First tab:"+driver.getTitle());
		

	}

}
