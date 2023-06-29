package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException 
	{


		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		
        List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

   
	    System.out.println("No of checkbox:"+ checkboxes.size());
	    
	 //   for(WebElement checkbox:checkboxes)
	 //   {
	 //   	checkbox.click();
	   // }
	    
	    
	    // i want to select sunday and friday;
	    
	    for (WebElement checkday:checkboxes)
	    {
	    	String dayname=checkday.getAttribute("id");
	    	
	    	if(dayname.equals("friday")|| dayname.equals("sunday"))
	    	{
	    	   checkday.click();
	    	}
	    }
	    System.out.println("Success.....");
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
