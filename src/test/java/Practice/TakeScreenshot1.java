package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot1 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{

		 WebDriverManager.chromedriver().setup();
			
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://admin-demo.nopcommerce.com/login");
		 
		 //TakesScreenshot ts=(TakesScreenshot) driver;
		 
		 
		 
         WebElement element= driver.findElement(By.xpath("//h1[contains(text(),'Admin area')]"));
         
		 File src=element.getScreenshotAs(OutputType.FILE);
		 
		 File trg=new File(".\\screenshots\\home2.png");
		 
		 FileUtils.copyFile(src, trg);

		
		 Thread.sleep(1000);
		 
		 driver.close();
	}

	
}
