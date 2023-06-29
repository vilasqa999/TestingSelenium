package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatepickerAdvance 
{

	public static void main(String[] args)
	{
		
		
		
		
		  WebDriverManager.chromedriver().setup();
		
		  ChromeDriver driver=new ChromeDriver();
		
		  driver.manage().window().maximize();
		 
		  driver.get("https://www.redbus.in/");
		  
		  driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		  
		  String year="2024";
		  String month= "July";
		  String date="22";
		  
		  while(true)
		  {
			  String monthyear=driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText();
			  
			  String arr[]=monthyear.split(" ");
			  
			  String mon=arr[0];
			  String yr=arr[1];
			  
			  if(mon.equalsIgnoreCase(month)&&yr.equals(year))
				  break;
			  else
				  driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
			  
		  }
		  

		 
	}

}
