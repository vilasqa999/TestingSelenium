package TestingSelenium.TestingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aunthicationpop {

	public static void main(String[] args) 
	{
		
		

        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://visualstories.com/info/pricing");
		

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		

	}

}
