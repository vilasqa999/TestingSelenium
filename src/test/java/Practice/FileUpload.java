package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args)
	{


		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://demoqa.com/upload-download");
		 
		 driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\vilas\\OneDrive\\Desktop\\Test data.txt");

	}

}
