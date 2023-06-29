package TestingSelenium.TestingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException
	{
		
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://visualstories.com/info/pricing");
		

		driver.get("https://www.calculator.net/");
		
		WebElement element=driver.findElement(By.linkText("Due Date Calculator"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		//js.executeScript("window.scrollBy(0,2000)");
	
		  js.executeScript("arguments[0].scrollIntoView()", element);
		
	}

}
