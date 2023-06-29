package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup {

	public static void main(String[] args) 
	{

     ChromeOptions opt1=new ChromeOptions();
     
     opt1.addArguments("--disable-notifications");
     
     WebDriverManager.chromedriver().setup();
     
     WebDriver driver=new ChromeDriver(opt1);
		
		
	driver.get("https://www.redbus.in/");

	}

}
