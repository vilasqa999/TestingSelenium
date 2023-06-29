package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args)
	{
	

        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		//1. normal click
		//driver.findElement(By.xpath("//button[contains(text(),'JS Alert')]")).click();
		
	//	driver.switchTo().alert().accept();
		
		//2. click confirm ok or cancel.
		
	//	driver.findElement(By.xpath("//button[contains(text(),'JS Confirm')]")).click();
		
	//	driver.switchTo().alert().accept();
		
	//	driver.switchTo().alert().dismiss();
		
		// 3. provide input
		
		driver.findElement(By.xpath("//button[contains(text(),'JS Prompt')]")).click();
		
		Alert alert=driver.switchTo().alert();
		
		alert.sendKeys("villas");
		
		driver.switchTo().alert().accept();
		
		
		
		
       	

     // driver.close();

	}

}
