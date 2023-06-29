package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload
{

	public static void main(String[] args) 
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://demo.automationtesting.in/FileDownload.html");
		 
		 WebElement string=driver.findElement(By.xpath("//textarea[@id='textbox']"));    //sendKeys("This is data file created..........");
		 
		 string.sendKeys("Vilas giri data");
		 
		 driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		 
		 driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
		 
		 

	}

}
