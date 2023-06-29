package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplictWait {

	public static void main(String[] args) 
	{

		
		  WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.name("q")).sendKeys("selenium");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.xpath("//a[@href='https://www.javatpoint.com/selenium-tutorial']//h3[@class='LC20lb" + " MBeuO DKV0Md'][normalize-space()='Selenium Tutorial'])")).click();
	}

}
