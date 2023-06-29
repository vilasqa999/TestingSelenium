package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestDropdown {

	public static void main(String[] args) 
	{


		 WebDriverManager.chromedriver().setup();
			
		 ChromeDriver driver =new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //driver.get("https://www.bing.com/");
		 
		 
		 driver.get("https://www.google.com/");
	
	
		// driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("java");
		 
		 driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("java");
         // for google
		 
         List<WebElement> list1= driver.findElements(By.xpath("//li[@class='sbct']//div[@role='presentation']//span"));
		 //for bing
        // List<WebElement> list1= driver.findElements(By.xpath("//li[@role='option']//span[@class='sa_tm_text']"));
       
         System.out.println("No of element:"+  list1.size());
        
         for (WebElement l1:list1)
         {
        	  if(l1.getText().contains("download"))
        	  {
        		  l1.click();
        		  break;
        	  }
         }
		 
		 System.out.println("success");
		 

	}

}
