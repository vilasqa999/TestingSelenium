package Practice_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		
		List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("No of radio button:-"+ radio.size());
		
		System.out.println("success..........");
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		// TODO Auto-generated method stub

	}

}
